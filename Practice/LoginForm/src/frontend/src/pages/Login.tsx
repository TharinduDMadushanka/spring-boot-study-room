import { Link, useNavigate } from 'react-router-dom';
import {useState} from "react";
import axios from "axios";


function Login(){

    const [email, setEmail] = useState<string>('');
    const [password, setPassword] = useState<string>('');
    const navigate = useNavigate();

    // @ts-ignore
    async function login() {
        try {
            const response = await axios.get(`http://localhost:8080/api/user/login/${email}/${password}`);
            const user = response.data

            if (user) {
                alert('Welcome!');
                navigate('/dashboard'); // Redirect to Dashboard
            } else {
                alert('Wrong details');
            }

        } catch (error) {
            console.error('Login error:', error);
            alert('An error occurred while logging in.');
        }
    }

    return (
        <div className="container" style={{
            backgroundColor: '#0D3B66',
            padding: '50px',
            borderRadius: '10px',
            width: '400px',
            margin: 'auto',
            marginTop: '100px'
        }}>
            <div className="row g-3 align-items-center">

                <div className="col-12 text-center">
                    <h2 style={{color: '#fff'}}>Login</h2>
                </div>

                <div className="col-12">
                    <label htmlFor="inputEmail" className="col-form-label" style={{color: '#fff'}}>Email</label>
                    <input
                        type="text"
                        id="inputEmail"
                        className="form-control"
                        value={email}
                        onChange={(e)=> setEmail(e.target.value)}
                        placeholder="Enter email"/>
                </div>

                <div className="col-12">
                    <label htmlFor="inputPassword" className="col-form-label" style={{color: '#fff'}}>Password</label>
                    <input
                        type="password"
                        id="inputPassword"
                        className="form-control"
                        value={password}
                        onChange={(e)=>setPassword(e.target.value)}
                        placeholder="Enter password"/>
                </div>

                <div className="col-12 text-center mt-5">
                    <button className="btn btn-primary" onClick={login} style={{width: '100%'}}>Login</button>
                    <hr/>
                    <p className="text-white">
                        Don't you have account ?
                        <Link to="/register" className="text-warning">Register here</Link>
                    </p>
                </div>


            </div>
        </div>


    );

}

export default Login