
public class Abstraction {

	public static void main(String[] args)
	{
       I i;
       i=new A();
       i.walk();
       i.eat();
       i=new B();
       i.run();
       
       
	}

}
 class A implements I
{
	public void eat()
	{
		System.out.println("a eat");
	}
	public void drink()
	{
		System.out.println(" a drink");
	}
	@Override
	public void walk() {
	
		System.out.println("a walk");

	}
	@Override
	public void run() {
	
		
	}
}
 class B implements I
{
	public void eat()
	{
		System.out.println("b eat");
	}
	public void walk()
	{
		System.out.println(" b walk ");
	}
	@Override
	public void run() {
		System.out.println("b run");
	}

	
}
 interface I
{
	public void eat();
	public void walk();
	public void run();
}