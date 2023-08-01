package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.dao.ProductDao;
import com.productapp.dao.ProductDaoImplArrrayList;
import com.productapp.dao.ProductDaoImplJdbc;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<String> getAll() {

		return productDao.getAll();
	}

}
