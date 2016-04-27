package Stringvars;

import java.util.Scanner;

public class StringVariables {
	private static Scanner user_input;

	public static void main(String[] args) {
		user_input = new Scanner(System.in);
		String first_name;
		System.out.println("Enter your first name: ");
		first_name = user_input.next();

		String family_name;
		System.out.println("Enter your family name: ");
		family_name = user_input.next();

		String full_name;
		full_name = first_name + " " + family_name;

		System.out.println("You are " + full_name);
	}
}
