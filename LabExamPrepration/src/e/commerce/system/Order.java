package e.commerce.system;

import java.util.*;

public class Order {
	
	ArrayList<Product>products = new ArrayList<>();
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public double calculateTotalPrice() {
		double totalPrice = 0;
		
		for(Product product : products) 
			totalPrice += product.getProductPrice();
				
		return totalPrice;
	}
	
	
	public void displayOrderDetails() {
		System.out.println("Order Details:");
		for(Product product : products) {
			System.out.println(" - " + product.getProductName() + " : $" + product.getProductPrice());
		}
		
		System.out.println("Total Price: $" + this.calculateTotalPrice());
	}
	
	
}
