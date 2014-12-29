package test;

import java.util.Random;

public class NoLogTest {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		for (int t = 0; t < 5; t++) {
		
			// without logging
			r.setSeed(1);
			long rnd = 0;
			long millis = System.currentTimeMillis();
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				rnd += r.nextInt() % 2;
			}
			millis = System.currentTimeMillis() - millis;
			System.out.println("no logging reached rnd " + rnd + " in " + millis + " millis");
		
		}
	}

}
