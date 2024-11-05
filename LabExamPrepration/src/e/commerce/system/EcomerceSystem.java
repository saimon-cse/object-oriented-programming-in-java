package e.commerce.system;

public class EcomerceSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Product product1 = new Product("Laptop", 1001,1200);
	     Product product2 = new Product("Smartphone",1002, 800);
	     
	        
		User user = new User("202122", "Saimon Islam");
		user.placeOrder(product1);
		user.placeOrder(product2);
		
		user.orderDetails();
		
		
		user = new User("U002", "Gumonto Balok Mehedi");
		user.placeOrder(product1);
		user.placeOrder(product2);
		
		user.orderDetails();

		
	}

}
