import { Link } from "react-router-dom";
import { ProductService } from "../Services/ProductService";
import { useState, useEffect } from "react";
import { ProductCard } from "../components/ProductCard";
import type { Product } from "../types/Product";

export function Home() {
  const [products, setProducts] = useState<Product[]>([]);
  const productService = new ProductService();

  const fetchProducts = async () => {
    try {
      const res = await productService.findAll();
      setProducts(res);
    } catch (error) {}
  };

  const handleProductDeleted = () => {
    fetchProducts();
  };

  useEffect(() => {
    fetchProducts();
  }, []);

  return (
    <div>
      <div className="w-full bg-blue-600 py-4 flex justify-start items-center px-8 mb-8 gap-8">
        <Link to="/products/add" className="text-white text-lg font-semibold">
          Agregar Producto
        </Link>
      </div>

      <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8">
        {products.map((product) => (
          <ProductCard key={product.id} product={product} onProductDeleted={handleProductDeleted} />
        ))}
      </div>
    </div>
  );
}
