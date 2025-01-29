package Nov11;

import java.util.Scanner;

class Student{
	//instance variables
	int sid;
	String sname;
	float sfees; 

	void inputData(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name");
	sname=sc.nextLine();
	System.out.println("Enter id");
	sid=sc.nextInt();
	System.out.println("Enter fees");
	sfees = sc.nextFloat();
	}

	void Display(){
	System.out.println("Name="+sname);
	System.out.println("ID="+sid);
	System.out.println("fees="+sfees);
	}

	}

public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stobj = new Student();
		stobj.inputData();
		stobj.Display();

	}

}
