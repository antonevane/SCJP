package ru.antonevane.ch1.pr2;

import ru.antonevane.ch1.pr1.Parent;

public class Child extends Parent {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.x);
		System.out.println(child.protectedMethod());
	}
}
