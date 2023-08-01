package com.productapp.dao;
import java.util.*;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
//<bean id="productDao1" class="com.productapp.dao.ProductDaoImplArrrayList"/>
@Repository(value = "productDao1")
public class ProductDaoImplArrrayList implements ProductDao{
	public List<String> getAll() {
		System.out.println("product dao using ArrayList");
		return List.of("tv","laptop","printer");
	}
}
