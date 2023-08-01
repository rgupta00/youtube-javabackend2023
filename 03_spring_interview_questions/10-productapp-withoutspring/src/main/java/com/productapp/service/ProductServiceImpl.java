package com.productapp.service;

import java.sql.SQLException;
import java.util.List;

import com.productapp.dao.ProductDao;
import com.productapp.dao.ProductDaoImpl;
import com.productapp.dto.Product;
import com.productapp.exceptions.ProductNotFoundException;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	// :(
	public ProductServiceImpl() {
		productDao = new ProductDaoImpl();
	}

	@Override
	public List<Product> getAll() throws SQLException {
		return productDao.getAll();
	}

	@Override
	public Product addProduct(Product product) {
		// validation
		return productDao.addProduct(product);
	}

	@Override
	public Product getById(int productId) {
		Product product = productDao.getById(productId);
		if (product == null)
			throw new ProductNotFoundException("product with id " + productId + " is not found");

		return product;
	}

	@Override
	public void deleteProduct(int productId) {
		productDao.deleteProduct(productId);
	}

	@Override
	public void updateProduct(int productId, double productPrice) {
		productDao.updateProduct(productId, productPrice);
	}

}
