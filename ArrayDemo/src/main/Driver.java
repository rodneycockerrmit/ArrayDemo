package main;

import app.Manager;

public class Driver {

	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println(manager.findDog("Thai"));
		System.out.println(manager.findDog("Cain"));
		System.out.println(manager.findDog("Henry"));
		System.out.println(manager.findDog("Henry"));
		System.out.println(manager.findDog("Henry"));
		System.out.println(manager.findDog("Henry"));
	}

}
