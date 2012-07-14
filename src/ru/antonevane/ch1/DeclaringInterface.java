package ru.antonevane.ch1;

import java.io.Serializable;

abstract public interface DeclaringInterface extends Runnable, Serializable {
	void bounce();

	abstract void bounce1();

	public void bounce2();

	abstract public void bounce3();

	public static final Apple APPLE = new Apple();

	int x = 10;

	public int y = 10;

	public static int z = 10;

}
