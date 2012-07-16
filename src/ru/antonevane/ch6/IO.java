package ru.antonevane.ch6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IO {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		File fileToWrite = new File("FileToWrite.txt");
		FileWriter fileWriter = new FileWriter(fileToWrite);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("Hello");
		bufferedWriter.newLine(); // добавляет \n
		bufferedWriter.write("Hello1");
		bufferedWriter.flush();
		bufferedWriter.close();

		File fileToRead = new File("FileToWrite.txt");
		FileReader fileReader = new FileReader(fileToRead);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		System.out.println(bufferedReader.readLine());
		bufferedReader.close();

		File toRename = new File("rename.txt");
		fileToRead.renameTo(toRename);

		FileWriter fw = new FileWriter(toRename);
		PrintWriter pw = new PrintWriter(fw);
		// println запись в файл
		pw.println("data");
		pw.println(1);
		pw.println('c');
		pw.println(1l);
		pw.println(1f);
		pw.println(1d);
		pw.printf("%1d", 1, 2);
		pw.flush();
		pw.close();
		
	}
	
	public void A() {
		File f1 = new File("");
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
