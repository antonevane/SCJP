package ru.antonevane.ch2;

public class Poly {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		Animal horseAnimal = new Horse();
		//This is polimorphism
		//cuz overriden not Overloaded
		horseAnimal.eat();
		Horse horse = (Horse) new Animal();
		horse.buck();
	}

}

class Animal {
	public Animal() {
	}

	public void eat() {
		System.out.println("Animal");
	}
}

class Horse extends Animal {
	public Horse() {
		super();
	}

	public void eat() {
		System.out.println("Horse");
	}

	public void eat(String s) {
		System.out.println("Horse:" + s);
	}

	public void buck() {
		System.out.println("Buck");
	}
}

interface EatInterface {
	void eat();
}
