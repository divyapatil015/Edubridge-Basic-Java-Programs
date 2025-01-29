 package nov16;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class Employee {
	private int eId;
	private String ename;
	private float esalary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eId, String ename, float esalary) {
		super();
		this.eId = eId;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

}


public class EmployeeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> elist = new LinkedList<Employee>();
		Employee e1 = new Employee(1, "Divya", 46437);
		Employee e2 = new Employee(2, "Manoj", 54654);
		Employee e3 = new Employee(3, "Pooja", 675895);
		Employee e4 = new Employee(4, "Manoj", 14876);
		Employee e5 = new Employee(15, "Shalu", 14876);
		Employee e6 = new Employee(12, "Kiran", 4876);
		Employee e7 = new Employee(7, "Deepa", 7876);

		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
		elist.add(e6);
		elist.add(e7);

		System.out.println(elist);
		Iterator<Employee> itobj = elist.iterator();

		System.out.println("eid\tename\tesalary");
		System.out.println("----------------------");
		while (itobj.hasNext()) {
			Employee e = itobj.next();
			// System.out.println(itobj.next());
			System.out.println(e.geteId() + "\t" + e.getEname() + "\t" + e.getEsalary());
			
			
			

		}

	}
}
