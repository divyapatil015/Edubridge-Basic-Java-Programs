package Loops;

import java.util.Scanner;

public class FactorialofNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int Number = sc.nextInt();
		double factorial = 1;
		for(int i =1;i<=Number;i++) {
			factorial = factorial*i;
		}
		System.out.println("Factorail of Number is : "+factorial);

	}

}
