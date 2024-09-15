import {useState} from "react";
import CategoryType from "../types/CategoryType.tsx";
import axios from "axios";

function Category() {

    const [categories, setCategories] = useState<CategoryType[]>([]);

    // const [categoryName, setCategoryName]= useState<string>("");

    async function loadCategories() {
        const response = await axios.get("http://localhost:8080/categories");
        setCategories(response.data);
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
            <div className="d-flex justify-content-center align-items-center" >
                <div className="card" style={{width: "18rem"}}>
                    {categories && categories.map(function (category: CategoryType) {
                        return (
                            <h3>~ {category.name}</h3>
                        );
                    })}
                </div>
            </div>
        </div>

    );

}

export default Category