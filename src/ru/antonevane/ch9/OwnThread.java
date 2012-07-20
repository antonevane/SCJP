package ru.antonevane.ch9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface CO {
	
}
public class OwnThread extends Thread implements CO{

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
		Boolean b = new Boolean(null);
		System.out.println(b);
		
		List s = new ArrayList<String>();
		
		s.add("C1H");
		s.add("C2H");
		s.add("CHA");
		s.add("CHB");
		Collections.sort(s);
		
		System.out.println(s);
		synchronized ("") {
			
		}
		
		ZXCO z= new ZXCO();
		CO c = null;
		
		z = (ZXCO)c;
		
		System.out.format("%s",new StringBuffer("ssss"));
		

	}

}

class ZXCO extends OwnThread {
	
}

class SuperThread extends Thread {

	@Override
	public void run() {
		System.out.println("Super thread");
	}

}