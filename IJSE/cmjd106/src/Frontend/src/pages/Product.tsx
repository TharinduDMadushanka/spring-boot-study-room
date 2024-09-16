import { useEffect, useState } from "react";
import ProductType from "../types/ProductType.tsx";
import axios from "axios";
import CategoryType from "../types/CategoryType.tsx";
import {useNavigate} from "react-router-dom";

function Product() {

    const navigate = useNavigate();

    const [product, setProduct] = useState<ProductType[]>([]);

    // state required to create a product
    const [productName, setProductName] = useState<string>("");
    const [price, setPrice] = useState<number>(0.0);
    const [description, setDescription] = useState<string>("");
    const [categoryId, setCategoryId] = useState<number>();
    const [categories, setCategories] = useState<CategoryType[]>([]);

    const [productEditing, setProductEditing] = useState<ProductType | null>(null);

    function homePage(){
        navigate("/")
    }

    // load products
    async function loadProduct() {
        const response = await axios.get("http://localhost:8080/products");
        setProduct(response.data);
    }

    // load categories
    async function loadCategories() {
        const response = await axios.get("http://localhost:8080/categories");
        setCategories(response.data);
    }

    useEffect(function () {
        loadProduct();
        loadCategories();
    }, []);

    function handleProductName(event: any) {
        setProductName(event.target.value);
    }

    function handlePrice(event: any) {
        setPrice(Number(event.target.value));
    }

    function handleDescription(event: any) {
        setDescription(event.target.value);
    }

    function handleCategoryId(event: any) {
        setCategoryId(Number(event.target.value));
    }

    async function handleSubmit(event: React.FormEvent) {
        event.preventDefault(); // Prevent the form from reloading the page

        const data = {
            name: productName,
            price: price,
            description: description,
            categoryId: categoryId,
        };

        try {
            await axios.post("http://localhost:8080/products", data);
            loadProduct();
            setProductName("");
            setPrice(0);
            setDescription("");
            setCategoryId(0);
        } catch (error: any) {
            console.log(error);
        }
    }

    // edit Product
    function editProduct(product: ProductType) {
        setProductEditing(product);
        setProductName(product.name);
        setPrice(product.price);
        setDescription(product.description);
        setCategoryId(product.category?.id);
    }

    // update product
    async function updateProduct(event: React.FormEvent) {
        event.preventDefault(); // Prevent the form from reloading the page

        const data = {
            name: productName,
            price: price,
            description: description,
            categoryId: categoryId,
        };

        try {
            await axios.put(`http://localhost:8080/products/${productEditing?.id}`, data); // Use PUT for update
            setProductEditing(null);
            loadProduct();
            setProductName("");
            setPrice(0);
            setDescription("");
            setCategoryId(0);
        } catch (error: any) {
            console.log(error);
        }
    }

    // delete product
    async function deleteProduct(productId: number) {
        try {
            await axios.delete(`http://localhost:8080/products/${productId}`);
            loadProduct();
        } catch (error) {
            console.log(error);
        }
    }

    return (
        <div className="container py-5">
            <h1 className="h3 font-weight-bold mb-5">Products</h1>

            <table className="table table-striped table-bordered text-left">
                <thead className="thead-light">
                <tr>
                    <th style={{width: "80px"}}>Product ID</th>
                    <th style={{width: "200px"}}>Product Name</th>
                    <th style={{width: "200px"}}>Product Price</th>
                    <th style={{width: "200px"}}>Actions</th>
                </tr>
                </thead>
                <tbody>
                {product.map(function (products) {
                    return (
                        <tr key={products.id}>
                            <td>{products.id}</td>
                            <td>{products.name}</td>
                            <td>{products.price}</td>
                            <td>
                                <button
                                    onClick={() => editProduct(products)}
                                    className="btn btn-outline-secondary btn-sm me-2"
                                >
                                    Edit
                                </button>

                                <button
                                    onClick={() => deleteProduct(products.id)}
                                    className="btn btn-danger btn-sm"
                                >
                                    Delete
                                </button>
                            </td>
                        </tr>
                    );
                })}
                </tbody>
            </table>

            <div
                className="border border-light py-3 px-4 rounded mb-4"
                style={{maxWidth: "350px"}}
            >
                <form onSubmit={productEditing ? updateProduct : handleSubmit}>
                    <div className="mb-3">
                        <label className="form-label">Product Name</label>
                        <input
                            type="text"
                            className="form-control"
                            value={productName}
                            onChange={handleProductName}
                            required
                        />
                    </div>

                    <div className="mb-3">
                        <label className="form-label">Price</label>
                        <input
                            type="number"
                            className="form-control"
                            value={price}
                            onChange={handlePrice}
                            required
                        />
                    </div>

                    <div className="mb-3">
                        <label className="form-label">Description</label>
                        <input
                            type="text"
                            className="form-control"
                            value={description}
                            onChange={handleDescription}
                            required
                        />
                    </div>

                    <div className="mb-3">
                        <label className="form-label">Category</label>
                        <select
                            className="form-select"
                            value={categoryId}
                            onChange={handleCategoryId}
                            required
                        >
                            <option value="">Please select category</option>
                            {categories.map(function (category) {
                                return (
                                    <option key={category.id} value={category.id}>
                                        {category.name}
                                    </option>
                                );
                            })}
                        </select>
                    </div>

                    <button type="submit" className="btn btn-dark btn-sm w-100 mb-2">
                        {productEditing ? "Update Product" : "Create Product"}
                    </button>
                </form>
            </div>

            <nav aria-label="Page navigation example">
                <ul className="pagination">
                    <li className="page-item"><a className="page-link" href="#" onClick={homePage}>Home</a></li>
                </ul>
            </nav>
        </div>
    );
}

export default Product;
