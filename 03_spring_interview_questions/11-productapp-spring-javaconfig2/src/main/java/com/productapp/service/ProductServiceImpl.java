package com.productapp.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productapp.dao.ProductDao;
import com.productapp.dto.Product;
import com.productapp.exceptions.ProductNotFoundException;
@Service(value = "productService")
@Transactional
public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;


	@Autowired
	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll()  {
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

	@Override
	public void truncateProductTable() {
		productDao.truncateProductTable();
	}

	@Override
	public void insertBatch(List<Product> products) {
		productDao.insertBatch(products);
	}

	@Override
	public void updateBatch(List<Product> products) {
		productDao.updateBatch(products);
	}

}
