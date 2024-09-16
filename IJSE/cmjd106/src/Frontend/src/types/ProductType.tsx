import CategoryType from "./CategoryType.tsx";

interface ProductType {
    id:number,
    name: string,
    price: number,
    description: string,
    category:CategoryType
}

export default ProductType