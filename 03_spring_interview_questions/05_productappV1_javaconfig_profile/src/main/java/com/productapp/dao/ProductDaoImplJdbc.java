package com.productapp.dao;
import java.util.*;
//<bean id="productDao2" class="com.productapp.dao.ProductDaoImplJdbc" primary="true"/>

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

public class ProductDaoImplJdbc implements ProductDao{
	public List<String> getAll() {
		System.out.println("product dao using jdbc");
		return List.of("tv","laptop","printer");
	}

}
