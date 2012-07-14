package ru.antonevane.ch1;

public class Refs {
	public void change(Person p) {
		p = new Person();
		p.setName("Mike");
	}

	public static void main(String[] args) {
		Refs r = new Refs();
		Person p = new Person();
		p.setName("John");
		r.change(p);
		System.out.println(p.getName());
	}
}

class Person {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

abstract interface Z {
}

abstract class D {
	D() {

	}

}