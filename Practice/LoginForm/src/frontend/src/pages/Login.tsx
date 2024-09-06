
function Login(){

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
                    <input type="text" id="inputEmail" className="form-control" placeholder="Enter email"/>
                </div>

                <div className="col-12">
                    <label htmlFor="inputPassword" className="col-form-label" style={{color: '#fff'}}>Password</label>
                    <input type="password" id="inputPassword" className="form-control" placeholder="Enter password"/>
                </div>

                <div className="col-12 text-center mt-5">
                    <button className="btn btn-primary" style={{width: '100%'}}>Login</button>
                </div>

            </div>
        </div>


    );

}

export default Login