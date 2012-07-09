package ru.antonevane.ch9;

public class SleepTest {

	public static void main(String[] args) {
		SleepTest st = new SleepTest();
		MyOwnThread thread = st.new MyOwnThread();
		thread.start();
	}

	class MyOwnThread extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (i % 10 == 0) {
					System.out.println("i:" + i);

				}
			}
		}

	}

}
