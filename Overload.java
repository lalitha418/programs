
public class Overload {

	public static void main(String[] args) 
	{
		Animal a;
		a=new Dog();
		a.move();
		a=new Animal();
	
	
		

	}

}
class Animal
{

	void move()
	{
		System.out.println("animal move");
	}
	void eat()
	{
		System.out.println("animal eat");
	}
	
}
class Cow extends Animal
{
	void move(Animal x)
	{
		System.out.println("cow move");
	}
	void eat()
	{
		System.out.println("cow eat");
	}
}
class Dog extends Animal
{
	void move()
	{
		System.out.println("dog move");
	}
	void eat()
	{
		System.out.println("dog eat");
	}
}
class Cat extends Animal
{
	void move()
	{
		System.out.println("cat move");
	}
	void eat()
	{
		System.out.println("cat eat");
	}
}
