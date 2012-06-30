package ru.antonevane.ch6;

import java.io.File;
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

	}

}
