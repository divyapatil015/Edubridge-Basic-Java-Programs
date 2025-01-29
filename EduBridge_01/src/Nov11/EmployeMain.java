package Nov11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Employee{
	//instance variables
	int eid;
	String ename;
	float esalary;
	String edepatname;
	
	public Employee() {
		eid = 0;
		ename = null;
		esalary=0.0f;
		edepatname=null;
		}
	

	void inputData(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Employee name: ");
	ename=sc.nextLine();
	System.out.println("Enter Employee id : ");
	eid=sc.nextInt();
	System.out.println("Enter Salary");
	esalary = sc.nextFloat();
	System.out.println("Enter Department Name : ");
	sc.nextLine();
	edepatname = sc.nextLine();
	
	}

	void inputData2()throws NumberFormatException, IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter Employee name: ");
		ename=br.readLine();
		System.out.println("Enter Employee id : ");
		eid=Integer.parseInt(br.readLine());
		System.out.println("Enter Salary");
		esalary = Integer.parseInt(br.readLine());
		System.out.println("Enter Department Name : ");
		edepatname =br.readLine();
		
	}
	void display(){
	System.out.println("Employee name ="+ename);
	System.out.println("Employee ID="+eid);
	System.out.println("Employee Salary ="+esalary);
	System.out.println("Employee Department Name = "+edepatname);
	}
}
public class EmployeMain {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Employee eobject = new Employee();
		eobject.inputData2();
		eobject.display();
		

	}

}

