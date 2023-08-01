package com.productapp.dao;
import java.util.List;
public class ProductDaoImplArrrayList implements ProductDao{
	public List<String> getAll() {
		System.out.println("product dao using ArrayList");
		return List.of("tv","laptop","printer");
	}
}
