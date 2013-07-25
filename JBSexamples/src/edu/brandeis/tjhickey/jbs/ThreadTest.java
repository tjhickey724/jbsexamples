package edu.brandeis.tjhickey.jbs;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("Thread Test");

		SharedData d = new SharedData();
		MyRunnable a = new MyRunnable("a", 100000000, d);
		MyRunnable b = new MyRunnable("b", 100000000, d);
		MyRunnable c = new MyRunnable("c", 100000000, d);
		Thread ta = new Thread(a);
		Thread tb = new Thread(b);
		Thread tc = new Thread(c);
		ta.start();
		tb.start();

		try {
			ta.join();
			tb.join();
		} catch (InterruptedException e) {
			System.out.println("Exception: " + e);
			e.printStackTrace();
		}
		
		System.out.println("d="+d);

	}

}
