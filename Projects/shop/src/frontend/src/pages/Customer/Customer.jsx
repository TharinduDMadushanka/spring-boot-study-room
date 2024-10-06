import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './Customer.css';

const Customer = () => {
  const [customers, setCustomers] = useState([]);
  const [selectedCustomer, setSelectedCustomer] = useState({
    id: '',
    title: '',
    name: '',
    dob: '',
    salary: '',
    address: '',
    city: '',
    province: '',
    postal: ''
  });

  useEffect(() => {
    fetchCustomers();
  }, []);

  const fetchCustomers = async () => {
    try {
      const response = await axios.get('http://localhost:8080/cust');
      setCustomers(response.data);
    } catch (error) {
      console.error('Error fetching customers:', error);
    }
  };

  const handleChange = (e) => {
    const { name, value } = e.target;
    setSelectedCustomer((prev) => ({
      ...prev,
      [name]: value
    }));
  };

  const handleAddCustomer = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post('http://localhost:8080/cust', selectedCustomer);
      setCustomers((prev) => [...prev, response.data]);
      resetForm();
    } catch (error) {
      console.error('Error adding customer:', error);
    }
  };

  const handleUpdateCustomer = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.put(`http://localhost:8080/cust/${selectedCustomer.id}`, selectedCustomer);
      setCustomers((prev) => prev.map((cust) => (cust.id === response.data.id ? response.data : cust)));
      resetForm();
    } catch (error) {
      console.error('Error updating customer:', error);
    }
  };

  const handleDeleteCustomer = async () => {
    try {
      await axios.delete(`http://localhost:8080/cust/${selectedCustomer.id}`);
      setCustomers((prev) => prev.filter((cust) => cust.id !== selectedCustomer.id));
      resetForm();
    } catch (error) {
      console.error('Error deleting customer:', error);
    }
  };

  const handleSelectCustomer = (customer) => {
    setSelectedCustomer(customer);
  };

  const resetForm = () => {
    setSelectedCustomer({
      id: '',
      title: '',
      name: '',
      dob: '',
      salary: '',
      address: '',
      city: '',
      province: '',
      postal: ''
    });
  };

  return (
    <div className="container mt-5">
      <h1 className="text-center">Customer Management</h1>
      <form onSubmit={handleAddCustomer} className="border p-4 rounded shadow">
        <h4 className="mb-4">Customer Details</h4>
        <div className="row g-3">
          <div className="col-md-4">
            <label className="form-label">ID</label>
            <input type="text" name="id" className="form-control" value={selectedCustomer.id} onChange={handleChange} required />
          </div>
          <div className="col-md-4">
            <label className="form-label">Title</label>
            <input type="text" name="title" className="form-control" value={selectedCustomer.title} onChange={handleChange} required />
          </div>
          <div className="col-md-4">
            <label className="form-label">Name</label>
            <input type="text" name="name" className="form-control" value={selectedCustomer.name} onChange={handleChange} required />
          </div>
          <div className="col-md-4">
            <label className="form-label">Date of Birth</label>
            <input type="date" name="dob" className="form-control" value={selectedCustomer.dob} onChange={handleChange} required />
          </div>
          <div className="col-md-4">
            <label className="form-label">Salary</label>
            <input type="number" name="salary" className="form-control" value={selectedCustomer.salary} onChange={handleChange} required />
          </div>
          <div className="col-md-4">
            <label className="form-label">Address</label>
            <input type="text" name="address" className="form-control" value={selectedCustomer.address} onChange={handleChange} required />
          </div>
          <div className="col-md-4">
            <label className="form-label">City</label>
            <input type="text" name="city" className="form-control" value={selectedCustomer.city} onChange={handleChange} required />
          </div>
          <div className="col-md-4">
            <label className="form-label">Province</label>
            <input type="text" name="province" className="form-control" value={selectedCustomer.province} onChange={handleChange} required />
          </div>
          <div className="col-md-4">
            <label className="form-label">Postal Code</label>
            <input type="text" name="postal" className="form-control" value={selectedCustomer.postal} onChange={handleChange} required />
          </div>
        </div>
        <div className="mt-4">
          <button type="submit" className="btn btn-primary">Add Customer</button>
          <button type="button" className="btn btn-success ms-2" onClick={handleUpdateCustomer} disabled={!selectedCustomer.id}>Update Customer</button>
          <button type="button" className="btn btn-danger ms-2" onClick={handleDeleteCustomer} disabled={!selectedCustomer.id}>Delete Customer</button>
        </div>
      </form>

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
