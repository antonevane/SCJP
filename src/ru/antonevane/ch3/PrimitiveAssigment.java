package ru.antonevane.ch3;

public class PrimitiveAssigment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte _byte = 127;
		
		Byte b1 = new Byte((byte)127);
		Short s1 = new Short((short)127);
		
		Byte bs2 = 1;
		Long l = (long) 1;
//		System.out.println(bs2 == l);
		
		Byte bs1 = 1;
		System.out.println(bs1.equals(l));
		
		Byte b2 = new Byte((byte)127);
		System.out.println(b1 == b2);
		
		Short s2 = new Short((short)111111);
		System.out.println(s1 == s2);
		
		short _short = 1234;
		int _int = 127;
		char _char = 127;
		float _float = 127.1f;
		long _long = 127L;
		double _double = 127;
		_long = (long) _float;
		
		_float = _char;
		_double = _float;
		
		_double = _long;
		
		Byte _Byte = new Byte((byte) 1);
		Short _Short = new Short((short) 1);
		Long _Long = new Long(1);
		System.out.println(_Byte.equals(_Long));
	}

}
