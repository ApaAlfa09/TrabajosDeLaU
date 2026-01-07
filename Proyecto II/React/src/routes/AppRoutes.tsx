import { Route, Routes } from "react-router-dom";
import { ProductDetail } from "../components/ProductDetail";
import ProductForm from "../components/ProductForm";
import { Home } from "../pages/Home";


export function AppRoutes() {
  return (
    <Routes>
      <Route path="/" element={<Home />}></Route>
      <Route path="/products/:id" element={<ProductDetail />}></Route>
      <Route path="/products/add" element={<ProductForm />}></Route>
    </Routes>
  );
}
