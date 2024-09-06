// @ts-ignore
import React from 'react';
import { Link, useNavigate } from 'react-router-dom';

function Dashboard(){

    const navigate=useNavigate();

    async function backToLogin(){
        navigate('/login');
    }

    return (
        <div className="container" style={{
            backgroundColor: '#0D3B66',
            padding: '50px',
            borderRadius: '10px',
            width: '80%',
            margin: 'auto',
            marginTop: '100px'
        }}>
            <h1 style={{color: '#fff'}}>Welcome to the Dashboard</h1>
            <button className="btn btn-danger" onClick={backToLogin}  style={{
                width: '100px',
                marginTop: '10px',  // Optional: Adjust space between title and button
                position: 'absolute',
                top: '150px',
                right: '200px',
            }}>Logout</button>
        </div>
    );

}

export default Dashboard