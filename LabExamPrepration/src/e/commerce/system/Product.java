package e.commerce.system;

public class Product {
	private int productId;
	private String name;
	private double price;
	
	Product(String name, int productId, double price){
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	
	public String getProductName() {
		return this.name;
	}
	
	public int getProductId() {
		return this.productId;
	}
	
	public double getProductPrice() {
		return this.price;
	}
	
	
}
