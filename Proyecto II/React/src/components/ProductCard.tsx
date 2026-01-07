import { Link } from "react-router-dom";
import type { Product } from "../types/Product";
import { ProductService } from "../Services/ProductService";

type Props = {
  product: Product;
  onProductDeleted: () => void;
};

export function ProductCard({ product, onProductDeleted }: Props) {
  const productService = new ProductService();

  const handleDelete = async (event: React.MouseEvent) => {
    event.preventDefault();
    event.stopPropagation();
    try {
      await productService.removeProduct(product.id);
      onProductDeleted();
    } catch (error) {
      console.error("Error deleting product:", error);
    }
  };

  return (
    <Link
      to={`/products/${product.id}`}
      className="block bg-gray-100 rounded-lg shadow-md p-4 hover:shadow-lg transition-shadow duration-300 hover:scale-105"
    >
      {product.imageUrl && (
        <div className="bg-white p-2 rounded-xl mb-4 border-2 border-black flex justify-center items-center">
          <img
            src={product.imageUrl}
            alt={product.name}
            className="w-full h-40 object-contain rounded-xl"
          />
        </div>
      )}

      <div className="flex items-center justify-between mb-4">
        <span className="text-lg font-bold text-black flex items-center gap-2">
          {product.name}
        </span>
        <span className="text-base text-black font-medium">
          Precio: ₡{product.price}
        </span>
      </div>

      <p className="font-medium text-black overflow-y-auto max-h-24">
        {product.description}
      </p>

      <hr className="my-4 border-gray-800" />
      <button
        onClick={handleDelete}
        className="bg-blue-600 text-white px-4 py-2 rounded hover:bg-blue-700"
      >
        Eliminar
      </button>
    </Link>
  );
}
