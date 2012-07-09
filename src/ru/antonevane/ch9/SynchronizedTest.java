package ru.antonevane.ch9;

public class SynchronizedTest {

	public static void main(String[] args) throws InterruptedException {
		StringBuffer currentBuffer = new StringBuffer(403);
		SyncThread thread1 = new SyncThread(currentBuffer);
		SyncThread thread2 = new SyncThread(currentBuffer);
		SyncThread thread3 = new SyncThread(currentBuffer);

		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		thread3.start();
		thread3.join();

		System.out.println(currentBuffer.toString());
	}

}

class SyncThread extends Thread {
	private StringBuffer sb;
	private static char letter = 'A';

	public SyncThread(StringBuffer sb) {
		this.sb = sb;
	}

	@Override
	public void run() {
		synchronized (this) {
			if (sb == null) {
				sb = new StringBuffer(300);
			}

			int maxRow = 100;
			for (int i = 0; i < maxRow; i++) {
				sb.append(letter);
				if (i == maxRow - 1) {
					letter++;
				}
			}

		}
	}

}
