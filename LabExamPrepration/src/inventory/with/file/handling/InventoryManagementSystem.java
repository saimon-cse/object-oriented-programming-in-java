package inventory.with.file.handling;

import java.util.*;
import java.io.*;

public class InventoryManagementSystem {

	private ArrayList<Product>products;
	
	InventoryManagementSystem(){
		products = new ArrayList<>();
	}
	
	public void loadProducts(String filename) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			String line;
			while((line = br.readLine()) != null) {
				String[] data = line.split(",");
				int productId = Integer.parseInt(data[0].trim());
				String name = data[1].trim();
				double price = Double.parseDouble(data[2].trim());
				int quantity = Integer.parseInt(data[3].trim());
				
				Product product = new Product(productId, name, price, quantity);
				products.add(product);
			}
			
			System.out.println("Product loaded successfully");			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void purchaseProduct(int productId) {
		for(Product product : products) {
			if(product.getProductId() == productId) {
				try {
					product.purchase();
					return;
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
					return;
				}
			}
		}
		 System.out.println("Product ID " + productId + " not found.");
	}
	
	
	public static void main(String[] args) {
		
		InventoryManagementSystem inventory = new InventoryManagementSystem();
		inventory.loadProducts("");
	}

}
