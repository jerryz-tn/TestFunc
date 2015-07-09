package main.func;

import model.func.ModelB;

public class Main {

	public static void main(String[] args) {
		Function fn = new Function();
		//add code for test
		fn.getInfo();
		
		System.out.println("2 + 3 = " + Function.add(2, 3));
		
		System.out.println("Test 1.");
		System.out.println("Test 2.");
		System.out.println("Test 3.");
		
		ModelB.showInfo();
	}

}
