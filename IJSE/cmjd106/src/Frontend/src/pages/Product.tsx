import {useEffect, useState} from "react";
import ProductType from "../types/ProductType.tsx";
import axios from "axios";

function Product(){

    const [product, setProduct] = useState<ProductType[]>([]);

    async function loadProduct(){
        const response = await axios.get("http://localhost:8080/products")
        setProduct(response.data);
    }

    useEffect(function (){
        loadProduct();
    },[])

    return(
        <div>
            <h1>Product</h1>

            {product.map(function (product){
                return(
                    <div>
                        <h2>{product.name}</h2>
                    </div>
                );
            })}

        </div>
    );
}

export default Product