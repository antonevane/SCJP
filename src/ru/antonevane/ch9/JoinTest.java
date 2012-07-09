package ru.antonevane.ch9;

public class JoinTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		JoinTest jt = new JoinTest();
		
		MyJoinThread mjt = jt.new MyJoinThread();
		Thread th = new Thread(mjt);
		th.start();
		System.out.println("main befor join call");
		th.join(1000);
		
		System.out.println("main after join call");

	}
	
	class MyJoinThread implements Runnable {

		@Override
		public void run() {
			System.out.println("join thred");
			
		}
		
	}

}
