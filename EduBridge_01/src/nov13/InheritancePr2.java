package nov13;

class Shape{
	public void draw() {
		System.out.println("Draw a shape ");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Draw a Circle ");
	}
}

class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Draw a Triangle ");
	}
}
public class InheritancePr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle();
		Shape triangle = new Triangle();
		circle.draw();
		triangle.draw();

	}

}
