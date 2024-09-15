import {useNavigate} from "react-router-dom";

function Home(){

    const navigate = useNavigate();

    function enter(){
        navigate("/category");
    }

    return(
        <div>
            <div className="container p-5 mt-5">
                <div className="card text-center">

                    <div className="card-body">
                        <h1 className="card-title text">Welcome My CMJD SpringBoot practice project!</h1>
                        <a href="#" className="btn btn-primary  mt-5" onClick={enter}>Enter</a>
                    </div>

                </div>
            </div>
        </div>
    );

 }

 export default Home