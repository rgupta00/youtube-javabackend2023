package com.a.enum_ex;
//S(38), M(40), L(42), XL(44), XXL(46);
interface Foof{
	void foof();
}
enum ShirtSize implements Foof{
	S(38), M(40), L(42), XL(44), XXL(46);
	
	private ShirtSize(int size) {
		this.size=size;
	}
	int size;
	public int getSize() {
		return size;
	}
	@Override
	public void foof() {
		System.out.println("foof method ");
	}
}

class Shirt {
	private String color;
	private ShirtSize size;
	private double price;

	public Shirt() {
	}

	public Shirt(String color, ShirtSize size, double price) {
		this.color = color;
		this.size = size;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ShirtSize getSize() {
		return size;
	}

	public void setSize(ShirtSize size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shirt [color=").append(color).append(", size=").append(size).append(", price=").append(price)
				.append("]");
		return builder.toString();
	}

}

public class A_Ex {
	public static void main(String[] args) {

		//how to convert String to enum
		ShirtSize shirtSize2= ShirtSize.valueOf("M");
		
		System.out.println(shirtSize2);
		
		ShirtSize[] values = ShirtSize.values();
		for(ShirtSize shirtSize: values) {
			System.out.println(shirtSize.getSize()+": "+ shirtSize.ordinal()
			+": "+ shirtSize.toString());
			shirtSize.foof();
		}
		
//		Shirt shirt = new Shirt("red", ShirtSize.XL, 1500.00);
//		System.out.println(shirt);
	}
}
