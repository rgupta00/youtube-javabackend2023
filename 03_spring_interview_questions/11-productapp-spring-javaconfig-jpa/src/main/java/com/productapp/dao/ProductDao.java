package com.productapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.productapp.entity.Product;

public interface ProductDao {

	public List<Product> getAll();

	public Product addProduct(Product product);

	public Product getById(int productId);

	public void deleteProduct(int productId);

	public void updateProduct(int productId, double productPrice);

}
