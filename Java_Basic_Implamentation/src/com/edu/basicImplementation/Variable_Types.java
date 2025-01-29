package com.edu.basicImplementation;

public class Variable_Types {
	//instance variable
    int x= 10;	
   
    static int y =20; // static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z= 30; // local variable
		//++ int m;
		Variable_Types iv = new Variable_Types();
		System.out.println("Instace variable x is" +iv.x);
		System.out.println("Static variable y is "+y);
		System.out.println("Local Variable z is "+z);
		//System.out.println(m);
	}

}
