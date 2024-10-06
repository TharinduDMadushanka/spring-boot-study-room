import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './Customer.css';

const Customer = () => {
  // State to store list of customers fetched from the backend
  const [customers, setCustomers] = useState([]);
  
  // State to store the currently selected customer for add/update/delete
  const [selectedCustomer, setSelectedCustomer] = useState({
    id: '',        // ID of the customer
    title: '',     // Title (e.g., Mr., Ms.)
    name: '',      // Customer's name
    dob: '',       // Date of birth
    salary: '',    // Customer's salary
    address: '',   // Customer's address
    city: '',      // City
    province: '',  // Province
    postal: ''     // Postal code
  });

  // useEffect hook to fetch customer data when the component loads
  useEffect(() => {
    fetchCustomers();  // Fetch customers from the backend
  }, []);

  // Function to fetch customer data from the backend API
  const fetchCustomers = async () => {
    try {
      // Send a GET request to the API to fetch customer data
      const response = await axios.get('http://localhost:8080/cust');
      
      // Update the state with the fetched data
      setCustomers(response.data);
    } catch (error) {
      console.error('Error fetching customers:', error);
    }
  };

  // Function to handle form input changes for each field
  const handleChange = (e) => {
    const { name, value } = e.target;
    
    // Update the selectedCustomer state dynamically based on the input name and value
    setSelectedCustomer((prev) => ({
      ...prev,    // Keep the existing values in selectedCustomer
      [name]: value  // Update the specific field being changed
    }));
  };

  // Function to add a new customer using POST request
  const handleAddCustomer = async (e) => {
    e.preventDefault();  // Prevent default form submission behavior
    
    try {
      // Send a POST request with the selectedCustomer data to the backend API
      const response = await axios.post('http://localhost:8080/cust', selectedCustomer);
      
      // Update the customers state to include the newly added customer
      setCustomers((prev) => [...prev, response.data]);
      
      // Reset the form after successful addition
      resetForm();
    } catch (error) {
      console.error('Error adding customer:', error);
    }
  };

  // Function to update an existing customer using PUT request
  const handleUpdateCustomer = async (e) => {
    e.preventDefault();  // Prevent default form submission behavior
    
    try {
      // Send a PUT request to update the selected customer by its ID
      const response = await axios.put(`http://localhost:8080/cust/${selectedCustomer.id}`, selectedCustomer);
      
      // Update the customer list with the updated data from the response
      setCustomers((prev) => prev.map((cust) => (cust.id === response.data.id ? response.data : cust)));
      
      // Reset the form after successful update
      resetForm();
    } catch (error) {
      console.error('Error updating customer:', error);
    }
  };

  // Function to delete a customer using DELETE request
  const handleDeleteCustomer = async () => {
    try {
      // Send a DELETE request to the backend to remove the customer by ID
      await axios.delete(`http://localhost:8080/cust/${selectedCustomer.id}`);
      
      // Remove the deleted customer from the customers state
      setCustomers((prev) => prev.filter((cust) => cust.id !== selectedCustomer.id));
      
      // Reset the form after deletion
      resetForm();
    } catch (error) {
      console.error('Error deleting customer:', error);
    }
  };

  // Function to handle selecting a customer from the table for editing or deletion
  const handleSelectCustomer = (customer) => {
    // Set the selected customer's data into the form fields
    setSelectedCustomer(customer);
  };

  // Function to reset the form back to its initial state (clear all fields)
  const resetForm = () => {
    setSelectedCustomer({
      id: '',      // Reset ID field
      title: '',   // Reset title field
      name: '',    // Reset name field
      dob: '',     // Reset date of birth field
      salary: '',  // Reset salary field
      address: '', // Reset address field
      city: '',    // Reset city field
      province: '',// Reset province field
      postal: ''   // Reset postal code field
    });
  };

  return (
    <div className="container mt-5">
      <h1 className="text-center">Customer Management</h1>
      
      {/* Form for adding/updating customers */}
      <form onSubmit={handleAddCustomer} className="border p-4 rounded shadow">
        <h4 className="mb-4">Customer Details</h4>
        <div className="row g-3">
          
          {/* Input field for ID */}
          <div className="col-md-4">
            <label className="form-label">ID</label>
            <input type="text" name="id" className="form-control" value={selectedCustomer.id} onChange={handleChange} required />
          </div>
          
          {/* Input field for Title */}
          <div className="col-md-4">
            <label className="form-label">Title</label>
            <input type="text" name="title" className="form-control" value={selectedCustomer.title} onChange={handleChange} required />
          </div>
          
          {/* Input field for Name */}
          <div className="col-md-4">
            <label className="form-label">Name</label>
            <input type="text" name="name" className="form-control" value={selectedCustomer.name} onChange={handleChange} required />
          </div>
          
          {/* Input field for Date of Birth */}
          <div className="col-md-4">
            <label className="form-label">Date of Birth</label>
            <input type="date" name="dob" className="form-control" value={selectedCustomer.dob} onChange={handleChange} required />
          </div>
          
          {/* Input field for Salary */}
          <div className="col-md-4">
            <label className="form-label">Salary</label>
            <input type="number" name="salary" className="form-control" value={selectedCustomer.salary} onChange={handleChange} required />
          </div>
          
          {/* Input field for Address */}
          <div className="col-md-4">
            <label className="form-label">Address</label>
            <input type="text" name="address" className="form-control" value={selectedCustomer.address} onChange={handleChange} required />
          </div>
          
          {/* Input field for City */}
          <div className="col-md-4">
            <label className="form-label">City</label>
            <input type="text" name="city" className="form-control" value={selectedCustomer.city} onChange={handleChange} required />
          </div>
          
          {/* Input field for Province */}
          <div className="col-md-4">
            <label className="form-label">Province</label>
            <input type="text" name="province" className="form-control" value={selectedCustomer.province} onChange={handleChange} required />
          </div>
          
          {/* Input field for Postal Code */}
          <div className="col-md-4">
            <label className="form-label">Postal Code</label>
            <input type="text" name="postal" className="form-control" value={selectedCustomer.postal} onChange={handleChange} required />
          </div>
        </div>

        {/* Buttons for adding, updating, and deleting customers */}
        <div className="mt-4">
          <button type="submit" className="btn btn-primary">Add Customer</button>
          <button type="button" className="btn btn-success ms-2" onClick={handleUpdateCustomer} disabled={!selectedCustomer.id}>Update Customer</button>
          <button type="button" className="btn btn-danger ms-2" onClick={handleDeleteCustomer} disabled={!selectedCustomer.id}>Delete Customer</button>
        </div>
      </form>

      {/* Table displaying list of customers */}
      <table className="table table-striped mt-4">
        <thead>
          <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Name</th>
            <th>Date of Birth</th>
            <th>Salary</th>
            <th>Address</th>
            <th>City</th>
            <th>Province</th>
            <th>Postal</th>
          </tr>
        </thead>
        <tbody>
          {customers.map((customer) => (
            <tr key={customer.id} onClick={() => handleSelectCustomer(customer)} style={{ cursor: 'pointer' }}>
              {/* Display customer details in table rows */}
              <td>{customer.id}</td>
              <td>{customer.title}</td>
              <td>{customer.name}</td>
              <td>{customer.dob}</td>
              <td>{customer.salary}</td>
              <td>{customer.address}</td>
              <td>{customer.city}</td>
              <td>{customer.province}</td>
              <td>{customer.postal}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default Customer;
