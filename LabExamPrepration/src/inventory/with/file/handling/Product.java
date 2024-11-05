package inventory.with.file.handling;

public class Product {
	
	protected int productId;
	protected String name;
	protected double price;
	protected int quantity;
	
	Product(int productId, String name, double price, int quantity){
		this.name = name;
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Getter methods
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public String toString() {
    	return "Product - Name: " + name + ", price: " + price + ",Quantity: " + quantity;
    }
    
    public void purchase() throws OutOfStockException {
    	if(quantity <= 0) {
    		throw new OutOfStockException("Out of Stock");
    	}
    	quantity--;
    	System.out.println("Purchased product - Name:" + name +", Quantity: " + quantity);
    }
	
	
}
