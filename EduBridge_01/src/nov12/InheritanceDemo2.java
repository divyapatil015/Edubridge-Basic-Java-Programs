package nov12;

interface Intf1{
	int i=10;
	void m1();
	void m2();
}

class MyClass implements Intf1{

	@Override
	public void m1() {
		System.out.println("m1 Method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		System.out.println("m2 Method");
		// TODO Auto-generated method stub
		
	}
	
}

public class InheritanceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyClass obj = new MyClass();
        obj.m1();
        obj.m2();
	}

}
