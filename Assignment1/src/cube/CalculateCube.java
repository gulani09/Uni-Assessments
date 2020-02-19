// File : CalculateCube.java
// Course Name : ITC538 - Programming in Java 1
// Assessment Item : Assignment 1
// Instructor Name : Recep Ulusoy
// Date : 12 March 2017
// Due on : 17 March 2017
// Student Id : 11619843
// Student Name : Gulani Senthuran

package cube;

import java.util.Scanner;

/**
 * This file used to implement the calculation of cube of each numeric numbers
 * 
 * 
 * @author Gulani Senthuran
 * 
 */
public class CalculateCube {
	public static void main(String[] args) {
		// Display welcome message
				System.out.println("Welcome to Cubing Program!");
				System.out.println("\nPlease enter two numbers!!!First number being smaller than second number..");

				// Create scanner object to get input from user
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the first number : ");
				// Get first number from user
				int firstNumber = input.nextInt();
				System.out.println("enter the second number : ");
				// Get second number from user
				int secondNumber = input.nextInt();

				System.out.println("Number\t\tCube\n");
				// iterate second (number - first number) times
				for (int i = firstNumber; i <= secondNumber; i++) {
					int cubeValue = i * i * i;
					System.out.println(i + "\t\t" + cubeValue + "\n");
				}
	}

}
