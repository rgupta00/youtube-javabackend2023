package com.productapp.service;

import java.util.List;

import com.productapp.dao.ProductDao;
import com.productapp.dao.ProductDaoImplArrrayList;
import com.productapp.dao.ProductDaoImplJdbc;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<String> getAll() {

		return productDao.getAll();
	}

}
