package test;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
	
	private static Logger logger = LoggerFactory.getLogger(LogTest.class);

	public static void main(String[] args) {
		Random r = new Random();
		
		for (int t = 0; t < 5; t++) {
		
			// with logging
			r.setSeed(1);
			long rnd = 0;
			long millis = System.currentTimeMillis();
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				rnd += r.nextInt() % 2;
				logger.debug("rnd");
			}
			millis = System.currentTimeMillis() - millis;
			System.out.println("logging reached rnd " + rnd + " in " + millis + " millis");
		
		}
	}

}
