package ru.antonevane.ch4;

public class StringBufferString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "123456789009813131311313131137654321";
		StringBuffer sb = new StringBuffer(s);
		
		s.substring(10);
		sb.substring(10);
		
		s.substring(10, 12);
		sb.substring(10, 12);
		
		s.charAt(1);
		sb.charAt(1);
		
		s.length();
		sb.length();
		
		StringBuffer sb1 = new StringBuffer("1");
		StringBuffer sb2 = new StringBuffer("1");
		System.out.println(sb1.equals(sb2));
		
		StringBuffer sb12 = new StringBuffer("1");
		StringBuffer sb22 = new StringBuffer(sb12);
		sb12 =sb22;
		System.out.println(sb12.equals(sb22));
	}

}
