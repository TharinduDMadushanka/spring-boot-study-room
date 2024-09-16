import {useEffect, useState} from "react";
import CategoryType from "../types/CategoryType.tsx";
import axios from "axios";

function Category() {

    const [categories, setCategories] = useState<CategoryType[]>([]);
    const [categoryName, setCategoryName] = useState<string>("");


    async function loadCategories() {
        const response = await axios.get("http://localhost:8080/categories");
        setCategories(response.data);
    }

    useEffect(function (){
        loadCategories();//function that will be triggered at the side effect
    }, []) //dependency array, if it is empty, it will be triggered only once

    function handleCategoryName(event: any) {
        setCategoryName(event.target.value);
    }


    async function createCategory() {

        // Trim the categoryName to remove any leading or trailing whitespace
        const trimmedCategoryName = categoryName.trim();

        // Check if the categoryName is empty
        if (!trimmedCategoryName) {
            // Alert the user if the input field is empty
            alert('Category name is mandatory. Please fill it in.');
            return; // Exit the function early
        }

        // Prepare the data to be sent in the request
        const data = {
            name: trimmedCategoryName
        }

        try {
            await axios.post("http://localhost:8080/categories", data);
            loadCategories();
            setCategoryName(''); // Clear the input field
        } catch (error) {
            console.error("Error creating category:", error);
        }
    }

    return (
        <div className="container text-center mt-5">
            {/* Centered H1 */}
            <h1 className="mb-4">Category</h1>

            {/* Styled Button */}
            <button className="btn btn-primary mb-4" onClick={loadCategories}>
                Load Categories
            </button>

            {/* Categories in Cards or List */}
            <div className="d-flex justify-content-center align-items-center">
                <div className="card" style={{width: "18rem"}}>
                    {categories && categories.map(function (category: CategoryType) {
                        return (
                            <h3>~ {category.name}</h3>
                        );
                    })}
                </div>
            </div>

            {/*create category*/}
            <div className="container p-5">
                <h2 className="mb-4 text-center">Create Category</h2>
                <form className="border p-4 rounded shadow-sm" style={{borderWidth: '50px'}}>
                    <div className="row justify-content-center">
                        <div className="col-md-4 mb-3">
                            <label htmlFor="categoryName" className="form-label">Category Name</label>
                            <input
                                type="text"
                                className="form-control"
                                required
                                onChange={handleCategoryName}
                                placeholder="Enter category name"/>
                        </div>
                    </div>
                    <button type="submit" onClick={createCategory} className="btn btn-primary w-20">Create</button>
                </form>
            </div>


        </div>

    );

}

export default Category