import { Link } from 'react-router-dom';
import {useState} from "react";
import axios from "axios";

function Register(){

    const [email, setEmail] = useState<string>('');
    const [mobile, setMobile] = useState<string>('');
    const [name, setName] = useState<string>('');
    const [password, setPassword] = useState<string>('');

    async function register(){
        const user ={email,mobile,name,password}

        try {

            await axios.post("http://localhost:8080/api/user/saveUser",user);
            alert("User Registered Successfully..!")

        }catch (error){
            console.log(error)
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
                    <h2 style={{color: '#fff'}}>Register Form</h2>
                </div>

                <div className="col-12">
                    <label htmlFor="inputEmail" className="col-form-label" style={{color: '#fff'}}>Email</label>
                    <input
                        type="text"
                        id="inputEmail"
                        className="form-control"
                        value={email}
                        onChange={(e) => setEmail(e.target.value)}
                        placeholder="Enter email"/>
                </div>

                <div className="col-12">
                    <label htmlFor="inputName" className="col-form-label" style={{color: '#fff'}}>Name</label>
                    <input
                        type="text"
                        id="inputName"
                        className="form-control"
                        value={name}
                        onChange={(e) => setName(e.target.value)}
                        placeholder="Enter Name"/>
                </div>

                <div className="col-12">
                    <label htmlFor="inputMobile" className="col-form-label" style={{color: '#fff'}}>Mobile</label>
                    <input
                        type="tel"
                        id="inputMobile"
                        className="form-control"
                        value={mobile}
                        onChange={(e) => setMobile(e.target.value)}
                        placeholder="Mobile"/>
                </div>

                <div className="col-12">
                    <label htmlFor="inputPassword" className="col-form-label" style={{color: '#fff'}}>Password</label>
                    <input
                        type="password"
                        id="inputPassword"
                        className="form-control"
                        value={password}
                        onChange={(e) => setPassword(e.target.value)}
                        placeholder="Enter password"/>
                </div>

                <div className="col-12 text-center mt-5">
                    <button className="btn btn-primary" onClick={register} style={{width: '100%'}}>Register</button>
                    <hr/>
                    <p className="text-white">
                        Already have an account ?
                        <Link to="/login" className="text-warning">Login</Link>
                    </p>
                </div>

            </div>
        </div>


    );

}

export default Register