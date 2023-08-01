package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.dao.ProductDao;
import com.productapp.dao.ProductDaoImplArrrayList;
import com.productapp.dao.ProductDaoImplJdbc;
/*
 * <bean id="productservice" class="com.productapp.service.ProductServiceImpl" 
		autowire="byType">
	</bean>
	1. field XX
	2. setter: optional dep
	3. ctr: mandatory dep
	
 */
@Service(value ="productservice" )
public class ProductServiceImpl implements ProductService {

	//@Autowired
	private ProductDao productDao;
//
//	@Autowired
//	public void setProductDao(ProductDao productDao) {
//		this.productDao = productDao;
//	}
//	
	
	@Autowired
	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}



	@Override
	public List<String> getAll() {

		return productDao.getAll();
	}

}
