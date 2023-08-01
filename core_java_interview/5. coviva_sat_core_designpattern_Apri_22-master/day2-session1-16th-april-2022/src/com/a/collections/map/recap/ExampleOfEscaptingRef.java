package com.a.collections.map.recap;
import java.util.*;
class Cart{
	
	private List<String>products= new ArrayList<String>();

	public List<String> getProducts() {
		//Cloning in core java: deep copy and shallow copy=> prototype design pattern*
		
		//rather then returing the object u should should return copy of it...
		return products;
	}

	public void addProduct(String product) {
		products.add(product);
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}

	
	public void printAllProducts() {
		products.stream().forEach(p-> System.out.println(p));
	}
	
	
}
public class ExampleOfEscaptingRef {
	
	public static void main(String[] args) {
		Cart cart=new Cart();
		cart.addProduct("tv");
		cart.addProduct("laptop");
		cart.addProduct("mouse");
		
		
		List<String> prducts=cart.getProducts();
		
		prducts.clear();
		
		cart.printAllProducts();
		System.out.println("--------");
		
	}

}
