package thread;

import java.util.Random;

public class Secondary implements Runnable {

	String name;
	int time;
	Random r = new Random();
	
	public Secondary(String x) {
		name = x;
		time = r.nextInt(999);
		
	}
	
	
	
	@Override
	public void run() {
		try {
			System.out.printf("%s us sleeping for %d", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		} catch(Exception e) {
			
		}
		
	}

}
