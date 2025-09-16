package w1_LabPratical1;//my Package name
//Author name: Low Kah Sheng
//Date create: 11.09.2025
//Purpose of Code: Week 1 - Lab Practical

//Library that being imported when necessary


import java.util.Scanner;

public class EvenOddCheck{//"public class" is fixed, but the "EvenOddCheck" can be changed as your wish because it is the name of your class
	public static void main (String[]args) {//this line is compulsory
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			
			
			if (number % 2==0) {
				System.out.println(number + "is Even.");
			}else {
				System.out.println(number + "is Odd.");
				
			}// this line is compulsory to complete the public class else 's' "{"
		}// this line is compulsory to complete the public class try-with-resources 's' "{"
	}// this line is compulsory to complete the public class void main 's' "{"
}// this line is compulsory to complete the public class 's' "{"
