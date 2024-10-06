import axios from "axios";
import {useEffect, useState} from "react";
import CategoryType from "../types/CategoryType";
import {Simulate} from "react-dom/test-utils";
import reset = Simulate.reset;

function Category() {

    // State for form inputs
    const [id, setId] = useState<number | string>('')
    const [name, setName] = useState<string>('')
    const [categories, setCategories] = useState<CategoryType[]>([])


    useEffect(() => {
        loadCategories();
    }, []);

    // @ts-ignore
    // Fetch all categories
    async function loadCategories() {
        const response = await axios.get("http://localhost:8080/api/v1/category/getCategory");
        setCategories(response.data);
    }

    //save
    // @ts-ignore
    async function saveCategory() {
        const category = {id, name};
        try {

            await axios.post("http://localhost:8080/api/v1/category/saveCategory", category);
            loadCategories();
            resetForm();

        } catch (error) {
            console.log(error)
        }
    }

    //update
    async function updateCategory() {
        const category = {id, name};
        try {

            await axios.post("http://localhost:8080/api/v1/category/updateCategory", category);
            loadCategories();
            resetForm();

        } catch (error) {
            console.log(error)
        }
    }

    //delete
    // @ts-ignore
    async function deleteCategory(id: number) {
        try {
            await axios.delete(`http://localhost:8080/api/v1/category/deleteCategory/${id}`);
            loadCategories(); // Reload categories after deleting
        } catch (error) {
            console.error("Error deleting category", error);
        }
    }


    // Reset form
    function resetForm() {
        setId('');
        setName('');
    }

    // Handle selecting a category (for updating)
    function selectCategory(category: CategoryType) {
        setId(category.id);
        setName(category.name);
    }


    return (

        <div className="container col-6">
            <div className="mb-3">
                <label htmlFor="id" className="form-label">Category ID</label>
                <input
                    type="number"
                    className="form-control"
                    id="id"
                    placeholder="Category ID"
                    value={id}
                    onChange={(e) => setId(Number(e.target.value))}/>
            </div>

            <div className="mb-3">
                <label htmlFor="name" className="form-label">Category Name</label>
                <input
                    type="text"
                    className="form-control"
                    id="name"
                    placeholder="Category Name"
                    value={name}
                    onChange={(e) => setName(e.target.value)}/>
            </div>
            <hr/>

            <button type="button" className="btn btn-secondary" onClick={saveCategory}>Save</button>
            <button type="button" className="btn btn-success" onClick={updateCategory}>Update</button>
            <button type="button" className="btn btn-danger" onClick={resetForm}>Clear</button>

            <div className="mt-3">
                <div className="table-section">
                    <table className="table table-bordered border-primary table-hover">
                        <thead className="table-dark">
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Category Name</th>
                            <th scope="col">Action</th>
                        </tr>
                        </thead>
                        <tbody>

                        {
                            categories.map((category) => (
                                <tr key={category.id}>
                                    <td>{category.id}</td>
                                    <td>{category.name}</td>
                                    <button className="btn btn-warning me-2"
                                            onClick={() => selectCategory(category)}>
                                        Edit
                                    </button>

                                    <button className="btn btn-danger"
                                            onClick={() => deleteCategory(category.id)}>
                                        Delete
                                    </button>
                                </tr>
                            ))
                        }

                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    );

}

export default Category