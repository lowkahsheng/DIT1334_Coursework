package w1_LabPratical1;//my Package name
//Author name: Low Kah Sheng
//Date create: 11.09.2025
//Purpose of Code: Week 1 - Lab Practical

//Library that being imported when necessary

import java.util.Scanner;
public class SimpleAddition{//"public class" is fixed, but the "SimpleAddition" can be changed as your wish because it is the name of your class
	public static void main(String[]args) {//this line is compulsory
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter first number:");
			int num1 = input.nextInt();
			
			
			System.out.print("Enter second number:");
			int num2 = input.nextInt();
			
			
			int sum = num1 + num2;
			System.out.println("The sum is: " + sum);
		}// this line is compulsory to complete the public class try-with-resources's "{"
	}// this line is compulsory to complete the public class void main's "{"
}// this line is compulsory to complete the public class's' "{"