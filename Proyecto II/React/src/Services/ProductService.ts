import type { Product } from "../types/Product";

const API_URL = "http://localhost:8080/api/products";

export class ProductService {
  async findAll(): Promise<Product[]> {
    const response = await fetch(API_URL);

    if (!response.ok) {
      throw new Error("Fail to fetch product");
    }

    return response.json();
  }

  async findById(id: number): Promise<Product> {
    const response = await fetch(`${API_URL}/${id}`);

    if (!response.ok) {
      throw new Error(`Fail to fetch product with Id: ${id}`);
    }

    return response.json();
  }

  async addProduct(product: Product): Promise<Product> {
    const response = await fetch(API_URL, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(product),
    });
    if (!response.ok) {
      throw new Error("Failed to create product");
    }
    return response.json();
  }

  async removeProduct(id: number): Promise<void> {
    const response = await fetch(`${API_URL}/${id}`, {
      method: "DELETE",
    });
    if (!response.ok) {
      throw new Error(`Failed to delete product with Id: ${id}`);
    }
  }
}
