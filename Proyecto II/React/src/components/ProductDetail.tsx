import { Link, useParams } from "react-router-dom";
import { useEffect, useState } from "react";
import type { Product } from "../types/Product";
import { ProductService } from "../Services/ProductService";

export function ProductDetail() {
  const { id } = useParams();
  const [product, setProduct] = useState<Product | undefined>();

  const productService = new ProductService();

  const fetchProduct = async () => {
    try {
      if (id) {
        const res = await productService.findById(Number(id));
        setProduct(res);
      }
    } catch (error) {
      console.error("Error: ", error);
    }
  };

  useEffect(() => {
    fetchProduct();
  }, [id]);

  if (!product) {
    return <div>Producto no encontrado</div>;
  }

  return (
    <div className="flex justify-center items-center min-h-screen">
      <div className="border-2 border-black rounded-xl p-8 bg-gray-100 shadow-lg max-w-lg w-full">
        <h2 className="text-2xl font-bold">{product.name}</h2>
        <div className="mb-6 flex justify-center">
          <img
            src={product.imageUrl}
            alt={product.name}
            className="max-h-96 rounded-lg border-2 border-gray-600"
          />
        </div>
        <hr className="my-4 border-black" />
        <h1 className="text-left">
          <span className="font-bold">Precio:</span> ₡{product.price}
        </h1>
        <p className="text-left">
          <span className="font-bold">Descripción:</span> {product.description}
        </p>
        <div>
          <Link
            to="/"
            className="inline-block mt-6 bg-blue-500 hover:bg-blue-600 text-white font-semibold py-2 px-4 rounded-lg transition-colors duration-200"
          >
            Volver al Inicio
          </Link>
        </div>
      </div>
    </div>
  );
}
