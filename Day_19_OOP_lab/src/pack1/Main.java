package pack1;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * Threading -> sub process of process
		 * Multithread 
		 * 
		 * Start & Run Method on-> Thread Class
		 * 6-2.06
		 * 3.69
		 * 12->2.9
		 * 14->3.63
		 * 16->48
		 * 
		 */
		
		
		ABC reply = new ABC();
		reply.start();
		
		for(int i=1; i<=10; i++) {
			System.out.println("Hello World");		
			Thread.sleep(1000); // milisec 
//			ABC tmp = new ABC();
//			tmp.display();
		}
		

	}

}

class ABC extends Thread{
	public void display() throws Exception{
		System.out.println("Hi");
		Thread.sleep(1000);
	}
	
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				System.out.println("Hiiii");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
