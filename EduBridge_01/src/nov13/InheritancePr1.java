package nov13;


class Animal{
	public void Sound() {
		System.out.println("Some Sound");
		}
	
}
class Dog extends Animal{
	public  void Sound() {
		System.out.println("Bark");
		}
	
}
class Cat extends Animal {
	public  void Sound() {
		System.out.println("Meow");
		}
	
}
public class InheritancePr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		Animal cat = new Cat();
		dog.Sound();
		cat.Sound();

	}

}
