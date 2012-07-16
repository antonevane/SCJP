package ru.antonevane.ch2;

public class CCC extends ZLS{

	public final class BZZ {
		private final void  print (){
			
		}
	}
	
	private final static void print (){
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ZLS {
	private final class BZZZ extends ZLS{
		public final void print(){
			
		}
	}
	
	private final void print(){
	}
	
	protected ZLS getContext() {
		return new BZZZ();
	}
}
