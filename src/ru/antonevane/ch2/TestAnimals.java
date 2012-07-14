package ru.antonevane.ch2;

import java.io.FileNotFoundException;

public class TestAnimals {
	public static void main(String[] args) throws Exception {
		Animal1 a = new Animal1();
		Horse1 b = new Horse1(); // Animal ref, but a Horse object
		b.eat(); // Compiler happy
		a.eat(); // Compiler unhappy
	}
}

class Animal1 {
	protected void eat()  {
		System.out.println("Generic Animal Eating Generically");
	}
	
	protected void eat(Object o) throws Exception {
		System.out.println("Generic Animal Eating Generically");
	}
	
	protected void eat(Long l) throws Exception {
		System.out.println("Generic Animal Eating Generically");
	}
}

class Horse1 extends Animal1 {
	public void eat(int y) throws FileNotFoundException{
		System.out.println("Horse eating hay, oats, " + "and horse treats");
	}
}