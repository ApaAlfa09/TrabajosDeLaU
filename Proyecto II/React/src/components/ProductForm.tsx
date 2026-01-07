import { useNavigate } from "react-router-dom";
import { ProductService } from "../Services/ProductService";
import type { Product } from "../types/Product";
import { useForm } from "react-hook-form";

export const ProductForm = () => {
  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm<Product>();
  const navigate = useNavigate();
  const productService = new ProductService();

  const onSubmit = async (data: Product) => {
    try {
      const newProduct = await productService.addProduct(data);
      navigate(`/products/${newProduct.id}`);
    } catch (err) {
      console.error("Failed to create product:", err);
    }
  };

  return (
    <div className="max-w-md mx-auto mt-10 p-6 bg-white rounded-xl shadow-md">
      <h1 className="text-2xl font-bold mb-4">Crear Producto</h1>
      <form onSubmit={handleSubmit(onSubmit)} className="space-y-4">
        <div>
          <label className="block font-medium mb-1">Nombre</label>
          <input
            type="text"
            {...register("name", { required: "El nombre es obligatorio" })}
            className="w-full border px-3 py-2 rounded-md"
          />
          {errors.name && (
            <p className="text-red-600 text-sm">{errors.name.message}</p>
          )}
        </div>

        <div>
          <label className="block font-medium mb-1">Descripción</label>
          <textarea
            {...register("description", {
              required: "La descripción es obligatoria",
            })}
            className="w-full border px-3 py-2 rounded-md"
          />
          {errors.description && (
            <p className="text-red-600 text-sm">{errors.description.message}</p>
          )}
        </div>

        <div>
          <label className="block font-medium mb-1">Precio</label>
          <input
            type="number"
            {...register("price", { required: "El precio es obligatorio" })}
            className="w-full border px-3 py-2 rounded-md"
          />
          {errors.price && (
            <p className="text-red-600 text-sm">{errors.price.message}</p>
          )}
        </div>

        <div>
          <label className="block font-medium mb-1">URL de imagen</label>
          <input
            type="url"
            {...register("imageUrl", {
              required: "La URL es obligatoria",
              pattern: {
                value: /^https?:\/\/[\w.-]+\.[a-z]{2,}/i,
                message: "Debe ser una URL válida",
              },
            })}
            className="w-full border px-3 py-2 rounded-md"
          />
          {errors.imageUrl && (
            <p className="text-red-600 text-sm">{errors.imageUrl.message}</p>
          )}
        </div>

        <div className="flex gap-4 justify-center">
          <button
            type="submit"
            className="bg-blue-600 text-white px-4 py-2 rounded hover:bg-blue-700"
          >
            Guardar
          </button>
          <button
            type="button"
            onClick={() => navigate("/")}
            className="bg-blue-600 text-white px-4 py-2 rounded hover:bg-blue-700"
          >
            Volver
          </button>
        </div>
      </form>
    </div>
  );
};

export default ProductForm;
