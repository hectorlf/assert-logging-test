package test;

import java.util.Random;

public class AssertLogTest {
	
	private static Log logger = new Log(AssertLogTest.class);

	public static void main(String[] args) {
		Random r = new Random();
		
		for (int t = 0; t < 5; t++) {
		
			// with assert logging
			r.setSeed(1);
			long rnd = 0;
			long millis = System.currentTimeMillis();
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				rnd += r.nextInt() % 2;
				logger.debug("rnd");
			}
			millis = System.currentTimeMillis() - millis;
			System.out.println("assert-logging reached rnd " + rnd + " in " + millis + " millis");
		
		}
	}

}
