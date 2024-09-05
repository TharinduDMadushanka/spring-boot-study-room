import {BrowserRouter, Route, Routes} from "react-router-dom";
import Category from "./pages/Category.js";

function App() {

  return (
    <BrowserRouter>
       <Routes>
         <Route path={"/category"} element={<Category/>}/>
       </Routes>
    </BrowserRouter>
  )
}

export default App
