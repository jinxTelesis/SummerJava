package thread;

public class dre {

	public static void main(String[] args) {
		
		Thread t1 =new Thread(new Secondary("one"));
		// thread needs runnable
		Thread t2 = new Thread(new Secondary("two"));
		
		Thread t3 = new Thread(new Secondary("three"));
		
		Thread t4 = new Thread(new Secondary("four"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
