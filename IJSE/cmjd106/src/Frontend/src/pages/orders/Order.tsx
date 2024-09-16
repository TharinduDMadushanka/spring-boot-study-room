import {Link} from "react-router-dom";
import {useEffect, useState} from "react";
import OrderType from "../../types/OrderType.tsx";
import axios from "axios";

function Order(){

    const [order, setOrders] = useState<OrderType[]>([]);

    async function loadOrders(){
        try {

            const response = await axios.get("http://localhost:8080/orders")
            setOrders(response.data)

        }catch (error){
            console.log(error)
        }
    }

    useEffect(function (){
        loadOrders();
    },[])

    return (
        <div className="container mt-5 mb-5">
            <h1 className="display-4 mb-5">Orders</h1>

            <Link to="/order/create" className="btn btn-primary mb-5">
                Add Order
            </Link>

            <table className="table table-bordered table-striped">
                <thead className="table-light">
                <tr>
                    <th style={{ width: '80px' }}>Order ID</th>
                    <th style={{ width: '200px' }}>Order Date and Time</th>
                    <th style={{ width: '200px' }}>Total Amount</th>
                    <th style={{ width: '200px' }}>Actions</th>
                </tr>
                </thead>
                <tbody>
                {order.map(function (order) {
                    return (
                        <tr key={order.id}>
                            <td>{order.id}</td>
                            <td>{order.orderDateTime}</td>
                            <td>{order.totalPrice}</td>
                            <td>
                                {/* Add action buttons or links here */}
                            </td>
                        </tr>
                    );
                })}
                </tbody>
            </table>
        </div>
    );

}

export default Order