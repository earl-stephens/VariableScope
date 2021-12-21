package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Scope - where in the program can you refer to the variable
		// scope is limited to the first pair of {} that encloses the variable
		int value = 0;
		System.out.println(value);

		/*
		 * The above works because the println uses the variable declared in the same
		 * set of {}
		 * 
		 * The below will not work because the variable is declared in a separate set of
		 * {}
		 */

		// {int value2 = 0;}
		// System.out.println(value2);

		Scanner scanner = new Scanner(System.in);

		/*
		 * Below does not work because input is declared in the do {} but is referenced
		 * outside those {} 
		 * 
		 * do { String input = scanner.nextLine(); }
		 * while(!input.equals("quit"));
		 */

		//declaring input outside of the do loop will work
		
		String input = null;
		do {
			System.out.println("type 'quit' to quit the program.");
			input = scanner.nextLine();
		} while(!input.equals("quit"));
		scanner.close();
		
		/* while it looks like i is declared outside of the {}
		 * in Java the for loop allows for i to be declared in the
		 * () conditional
		 */
		for(int i=0; i<4; i++) {
			System.out.println(i);
		}

	}
}