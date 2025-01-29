package nov4;

import java.util.Scanner;

public class LargestOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter the Second number: ");
		int b = sc.nextInt();	
		
		System.out.print("Enter the Third number: ");
		int c = sc.nextInt();
		
		System.out.print("Enter the Fourth number: ");
		int d = sc.nextInt();
		 
		int big =(a>b && a>c && a>d)?a:(b>a && b>c && b>d)?b:(c>a && c>b && c>d)?c:d;
		System.out.println(big);
		
		System.out.println("Largest Number among Four number  is :"+big);
		

	}

}
