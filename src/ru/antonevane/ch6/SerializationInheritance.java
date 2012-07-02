package ru.antonevane.ch6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationInheritance {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		B b = new B(10);
		b.a = 10;

		FileOutputStream fileOutputStream = new FileOutputStream("C:\\inher.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		objectOutputStream.writeObject(b);

		objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("C:\\inher.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		B ba = (B) objectInputStream.readObject();

		objectInputStream.close();

		System.out.println(ba.a);
		System.out.println(ba.b);
	}
}

class A {
	int	a	= 1;

	A() {
		System.out.println("A");
		System.out.println(a);
	}
}

class B extends A implements Serializable {
	int	b	= 10;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public B(int b) {
		this.b = b;
		System.out.println("B");
	}

}
