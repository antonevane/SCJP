package ru.antonevane.ch3;

public class PolymorphicArray {
	public static void main(String[] args) {
		arrayStoreException();
	}

	public static void arrayStoreException() {
		Animal[] catArr = new Cat[1];
		catArr[0] = new Dog();
	}
}

abstract class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}