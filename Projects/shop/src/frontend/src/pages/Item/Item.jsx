import axios from 'axios';
import React, { useEffect, useState } from 'react';

const Item = () => {

  // State to store the list of items fetched from the server
  const [items, setItems] = useState([]);

  // State to store the selected item's details for add/update operations
  const [selectedItem, setSelectedItem] = useState({
    itemCode: '',
    description: '',
    pack: '',
    qoh: '',
    unitPrice: ''
  });

  // useEffect to fetch items when the component mounts (initial load)
  useEffect(() => {
    getAllItems();
  }, []);

  // Fetch all items from the backend API and store them in 'items' state
  const getAllItems = async () => {
    try {
      const response = await axios.get('http://localhost:8080/item');
      setItems(response.data);  // Update the state with fetched items
    } catch (error) {
      console.error('Error fetching items:', error);
    }
  };

  // Handle changes in input fields and update the 'selectedItem' state accordingly
  const handleChange = (e) => {
    const { name, value } = e.target;
    setSelectedItem((prevItem) => ({
      ...prevItem,
      [name]: value
    }));
  };

  // Add a new item by sending a POST request to the backend
  const addItem = async (e) => {
    e.preventDefault();  // Prevent form from reloading the page

    try {
      const response = await axios.post('http://localhost:8080/item', selectedItem);
      setItems((prev) => [...prev, response.data]);  // Add the new item to the list
      resetForm();  // Clear the form fields after adding
    } catch (error) {
      console.error('Error adding item:', error);
    }
  };

  // Update an existing item by sending a PUT request to the backend
  const updateItem = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.put(`http://localhost:8080/item/${selectedItem.itemCode}`, selectedItem);
      
      // Update the item in the 'items' state with the updated response data
      setItems((prev) =>
        prev.map((item) =>
          item.itemCode === response.data.itemCode ? response.data : item
        )
      );
      resetForm();  // Clear the form fields after updating
    } catch (error) {
      console.error('Error updating item:', error);
    }
  };

  // Delete an item by sending a DELETE request to the backend
  const deleteItem = async () => {
    try {
      await axios.delete(`http://localhost:8080/item/${selectedItem.itemCode}`);
      
      // Remove the deleted item from the 'items' state
      setItems((prev) =>
        prev.filter((item) => item.itemCode !== selectedItem.itemCode)
      );
      resetForm();  // Clear the form fields after deleting
    } catch (error) {
      console.error('Error deleting item:', error);
    }
  };

  // Set the selected item in the form when a row in the table is clicked
  const handleSelectedItem = (item) => {
    setSelectedItem(item);  // Populate the form with the selected item details
  };

  // Clear the form fields after add/update/delete operations
  const resetForm = () => {
    setSelectedItem({
      itemCode: '',
      description: '',
      pack: '',
      qoh: '',
      unitPrice: ''
    });
  };

  return (
    <div className='container mt-5'>
      <h1 className="text-center">Item Management</h1>

      {/* Form to Add/Update an Item */}
      <form onSubmit={handleChange} className="border p-4 rounded shadow">
        <h4 className="mb-4">Item Details</h4>
        <div className="row g-3">
          {/* Input for Item Code */}
          <div className="col-md-4">
            <label className="form-label">Item Code</label>
            <input
              type="text"
              name="itemCode"
              className="form-control"
              value={selectedItem.itemCode}
              onChange={handleChange}
              required
            />
          </div>

          {/* Input for Description */}
          <div className="col-md-4">
            <label className="form-label">Description</label>
            <input
              type="text"
              name="description"
              className="form-control"
              value={selectedItem.description}
              onChange={handleChange}
              required
            />
          </div>

          {/* Input for Pack Size */}
          <div className="col-md-4">
            <label className="form-label">Pack Size</label>
            <input
              type="text"
              name="pack"
              className="form-control"
              value={selectedItem.pack}
              onChange={handleChange}
              required
            />
          </div>

          {/* Input for Quantity on Hand (QOH) */}
          <div className="col-md-4">
            <label className="form-label">QOH</label>
            <input
              type="number"
              name="qoh"
              className="form-control"
              value={selectedItem.qoh}
              onChange={handleChange}
              required
            />
          </div>

          {/* Input for Unit Price */}
          <div className="col-md-4">
            <label className="form-label">Unit Price</label>
            <input
              type="number"
              name="unitPrice"
              className="form-control"
              value={selectedItem.unitPrice}
              onChange={handleChange}
              required
            />
          </div>
        </div>

        {/* Buttons for Add, Update, and Delete operations */}
        <div className="mt-4">
          <button type="submit" className="btn btn-primary" onClick={addItem}>
            Add Item
          </button>
          <button
            type="button"
            className="btn btn-success ms-2"
            onClick={updateItem}
          >
            Update Item
          </button>
          <button
            type="button"
            className="btn btn-danger ms-2"
            onClick={deleteItem}
          >
            Delete Item
          </button>
        </div>
      </form>

      {/* Table to display the list of items */}
      <table className="table table-striped mt-4">
        <thead>
          <tr>
            <th>Item Code</th>
            <th>Description</th>
            <th>Pack Size</th>
            <th>QOH</th>
            <th>Unit Price</th>
          </tr>
        </thead>
        <tbody>
          {items.map((item) => (
            <tr
              key={item.itemCode}
              style={{ cursor: 'pointer' }}
              onClick={() => handleSelectedItem(item)}  // Set item details in the form when clicked
            >
              <td>{item.itemCode}</td>
              <td>{item.description}</td>
              <td>{item.pack}</td>
              <td>{item.qoh}</td>
              <td>{item.unitPrice}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default Item;
