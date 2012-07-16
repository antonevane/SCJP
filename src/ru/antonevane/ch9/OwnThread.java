package ru.antonevane.ch9;

public class OwnThread extends Thread {

	@Override
	public void run() {
		System.out.println("OwnThread thread");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread th = new Thread(new OwnThread());
//		th.start();
		
		th.run();
		
		OwnThread ownThread = new OwnThread();
		
		Thread myNeThread = new Thread(ownThread);
//		myNeThread.start();
//		
//		ownThread.start();
		
		

	}

}

class SuperThread extends Thread {

	@Override
	public void run() {
		System.out.println("Super thread");
	}

}