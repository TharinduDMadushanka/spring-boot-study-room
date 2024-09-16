import {useNavigate} from "react-router-dom";

function Home() {

    const navigate = useNavigate();

    function navCategory() {
        navigate("/category");
    }

    function navProduct(){
        navigate("/product")
    }

    return (
        <div>
            <div className="container p-5 mt-5">
                <div className="card text-center">

                    <div className="card-body">
                        <h1 className="card-title text">Welcome My CMJD SpringBoot practice project!</h1>
                        <a href="#" className="btn btn-primary  mt-5" onClick={navCategory}>Enter</a>
                    </div>

                </div>
            </div>

            <nav aria-label="Page navigation example">
                <ul className="pagination">
                    <li className="page-item"><a className="page-link" href="#" onClick={navCategory}>Category</a></li>
                    <li className="page-item"><a className="page-link" href="#" onClick={navProduct}>Product</a></li>
                    <li className="page-item"><a className="page-link" href="#">2</a></li>
                    <li className="page-item"><a className="page-link" href="#">3</a></li>
                    <li className="page-item"><a className="page-link" href="#">Next</a></li>
                </ul>
            </nav>

        </div>
    );

}

export default Home