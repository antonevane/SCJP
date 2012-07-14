package ru.antonevane.ch1;

public class WuthEnum {
	enum A {
		a(1);

		private int z;

		public int getZ() {
			return z;
		}

		A(int z) {
			this.z = z;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static {
		String a = A.a.name();
	}

}
