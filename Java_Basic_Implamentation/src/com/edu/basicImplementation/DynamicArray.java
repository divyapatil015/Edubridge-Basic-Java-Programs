package com.edu.basicImplementation;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int r, c, sum =0;
		System.out.println("Enter a no of rows ");
		r= sc.nextInt();
		System.out.println("Enter the no of columns");
		c = sc.nextInt();
				
	   int x[][] = new int[r][c];
	   System.out.println("Enter the "+r*c+"Values");
	   for(int i =0; i<r;i++) {
		   for(int j=0 ; j<c;j++) {
			   x[i][j]=sc.nextInt();
		   }
	   }
	   
	   System.out.println("Enter values are ");
	   for(int i =0; i<r;i++) {
		   for(int j=0 ; j<c;j++) {
			   System.out.print(" "+x[i][j]);
			   sum = sum+x[i][j];
		   }
		   System.out.println("\n");
	   }
		
	   System.out.println("Sum of elements is :"+sum);
	}

}
