package ru.antonevane.ch7;

import java.util.ArrayList;
import java.util.List;

public class PolymorphicGeneric {
	public static void main(String[] args) {
		PolymorphicGeneric polymorphicGeneric = new PolymorphicGeneric();
		
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat());
//		polymorphicGeneric.addAnimal(cats);
	}

	public void addAnimal(List<Animal> animals) {
		animals.add(new Dog()); // still OK as always
	}}

abstract class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
