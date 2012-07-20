package ru.antonevane.ch2;

public class PrivateMethods {

	public static void main(String[] args) {
		OutOfIntf outOfIntf = new OutOfIntf();
		
		if(outOfIntf instanceof Runnable){
			
		}
	}

}

interface Intr {
	
}
class MainIn implements Intr{
	public int	i;

	protected MainIn(int i) {

	}
}

class ChildIn extends MainIn  implements Intr{
	private ChildIn(int i) {
		super(i);
	}
}

class OutOfIntf {
	
}