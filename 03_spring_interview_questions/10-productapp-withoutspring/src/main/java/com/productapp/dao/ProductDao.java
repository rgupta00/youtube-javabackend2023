package com.productapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.productapp.dto.Product;

public interface ProductDao {

	public List<Product> getAll() throws SQLException;

	public Product addProduct(Product product);

	public Product getById(int productId);

	public void deleteProduct(int productId);

	public void updateProduct(int productId, double productPrice);

}
