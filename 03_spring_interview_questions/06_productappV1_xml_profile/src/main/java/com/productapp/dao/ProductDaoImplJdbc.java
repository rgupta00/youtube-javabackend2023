package com.productapp.dao;
import java.util.*;

public class ProductDaoImplJdbc implements ProductDao{
	public List<String> getAll() {
		System.out.println("product dao using jdbc");
		return List.of("tv","laptop","printer");
	}

}
