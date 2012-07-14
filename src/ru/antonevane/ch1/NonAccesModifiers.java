package ru.antonevane.ch1;

public abstract class NonAccesModifiers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public transient int z;
	
	public void z(int ... c){
	}

	public NonAccesModifiers getRecord(int fileNumber, final int recordNumber) {
		return null;
	}
}
