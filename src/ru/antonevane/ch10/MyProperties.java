package ru.antonevane.ch10;

import java.util.Properties;

public class MyProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		properties.setProperty("OWN", "1");
		properties.list(System.out);
		//properties.getProperty(key, defaultValue)

	}

}
