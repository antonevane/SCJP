package ru.antonevane.ch6;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IO {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		File f = new File("");

		File dir = new File("ch6Test");
		dir.mkdir();

		File f2 = new File(dir, "File");

		FileInputStream fis = new FileInputStream(f2);
		BufferedInputStream bif = new BufferedInputStream(fis);

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	public boolean equals(IO obj, int a) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	

}
