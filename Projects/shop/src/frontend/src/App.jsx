import React from 'react'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Home from './pages/Home/Home'
import Customer from './pages/Customer/Customer'
import Item from './pages/Item/Item'

const App = () => {
  return (
    <div>

      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Home/>}/>
          <Route path='/customer' element={<Customer/>}/>
          <Route path='/item' element={<Item/>}/>
        </Routes>
      </BrowserRouter>
      
    </div>
  )
}

export default App
