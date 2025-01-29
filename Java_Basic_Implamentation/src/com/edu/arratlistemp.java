package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	int empid;
    String name;
    String clasname;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name, String clasname) {
		super();
		this.empid = empid;
		this.name = name;
		this.clasname = clasname;
	}
    
}
public class arratlistemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"Divya","Patil");
		Employee e2 = new Employee(2,"Divyaf","Patif");
		ArrayList<Employee> ae = new ArrayList<Employee>();
		ae.add(e1);
		ae.add(e2);
		
		System.out.println(ae);
		
		Iterator itr = ae.iterator()
		;
		while(itr.hasNext()) {
			Employee et = (Employee)itr.next();
			System.out.println(et.empid);
			System.out.println(et.name);
			System.out.println(et.clasname);
		}
	}

}
