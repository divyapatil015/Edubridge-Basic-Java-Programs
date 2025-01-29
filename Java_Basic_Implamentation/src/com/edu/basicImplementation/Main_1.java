package com.edu.basicImplementation;

class A {
	public void hello() {
		System.out.println("Hello i am in class A....");
	}
	
}
class B {
	public void hello() {
		System.out.println("Hello i am in class B....");
	}
}

class C {
	public static void hello() {
	System.out.println("Hello i am in class C...");
	}
}

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ao = new A();
		B bo = new B();
		ao.hello();
		bo.hello();
		// static keyword in method is used so we call method without creating objects*
		C.hello();
	}

}
