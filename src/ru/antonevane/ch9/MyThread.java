package ru.antonevane.ch9;

public class MyThread extends Thread {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();

		myThread.start();
		myThread.run();
		myThread.sleep(10);

	}

	@Override
	public void run() {
		System.out.println("MyThread extend Thread");
	}

}
