import React from 'react'
import './Home.css'
import { useNavigate } from 'react-router-dom'

const Home = () => {

    const navigate = useNavigate();

    function navCustomer(){
        navigate('/customer');
    }

  return (
    <div>
        <div className="container p-5 mt-5">
                <div className="card text-center">

                    <div className="card-body">
                        <h1 className="card-title text">Welcome to supermarket project!</h1>
                        <a href="#" className="btn btn-primary  mt-5" >Enter</a>
                    </div>

                </div>
            </div>

            <nav aria-label="Page navigation example">
                <ul className="pagination">
                    <li className="page-item"><a className="page-link" href="#" onClick={navCustomer}>Customer</a></li>
                    <li className="page-item"><a className="page-link" href="#" >Product</a></li>
                    <li className="page-item"><a className="page-link" href="#" >Order</a></li>
                    
                </ul>
            </nav>

    </div>
  )
}

export default Home
