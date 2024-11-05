package e.commerce.system;

public class User {
	String userId;
	String userName;
	Order order;
	
	
	User(String userId, String userName){
		this.userId = userId;
		this.userName = userName;
		this.order = new Order();
	}
	
	public void placeOrder(Product product) {
		order.addProduct(product);
	}
	
	public void orderDetails() {
		System.out.println("User : " + this.userName);
		order.displayOrderDetails();
		
	}
}
