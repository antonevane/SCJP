package ru.antonevane.ch6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog dog = new Dog(10);
		Cat cat = new Cat(1, dog);
		File catSerializationFile = new File("C:\\Cat.ser");
		FileOutputStream fileOutputStream = new FileOutputStream(catSerializationFile);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		objectOutputStream.writeObject(cat);
		objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream(catSerializationFile);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		Cat deserCat = (Cat) objectInputStream.readObject();
		System.out.println(deserCat.getAge());
		objectInputStream.close();

	}
}

class Dog {

	Dog(int size) {
		this.size = size;
	}

	private int	size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}

class Cat implements Serializable {

	private int				age	= 10;

	private transient Dog	dog;

	public Cat(int age, Dog dog) {
		super();
		this.age = age;
		this.dog = dog;
	}

	public int getAge() {
		return age;
	}

	private void witeObject(ObjectOutputStream objectOutputStream) {
		// throws IOException {
		try {
			objectOutputStream.defaultWriteObject();
			objectOutputStream.writeInt(dog.getSize());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream is) {
		// throws IOException, ClassNotFoundException { // 4
		try {
			is.defaultReadObject();// 5
			dog = new Dog(is.readInt()); // 6
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 5660138061652468915L;

}