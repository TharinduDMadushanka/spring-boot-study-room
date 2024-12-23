
import Home from "./pages/Home.tsx";
import {BrowserRouter, Route, Routes} from "react-router-dom";
import Category from "./pages/Category.tsx";
import Product from "./pages/Product.tsx";
import Order from "./pages/orders/Order.tsx";
import CreateOrder from "./pages/orders/CreateOrder.tsx";

function App() {


  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home/>}/>
        <Route path="/category" element={<Category/>}/>
        <Route path="/product" element={<Product/>}/>
        <Route path="order" element={<Order/>}/>
        <Route path="order/create" element={<CreateOrder/>}/>
      </Routes>
    </BrowserRouter>
  )
}

export default App
