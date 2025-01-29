package nov13;

abstract class Vehical{
	abstract public  void move();
}
class Car extends Vehical{
	@Override
	public void move() {
		System.out.println("Car moveing");
	}
	
}
class Bike extends Vehical{
	@Override
	public void move() {
		System.out.println("Bike moveing");
	}
	
}

public class PracticeQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehical Objcar = new Car();
		Vehical Objbike = new Bike();
		
		Objcar.move();
		Objbike.move();

	}

}
