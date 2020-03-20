
public class Casting1 {

	public static void main(String[] args) {
	 
		
		
	 Parent p=new Parent();
	 p.move();
	 
	 
	 Parent p1=new Child();  //upcasting
	 p1.move();
	 
	 
	 
	 Child c=(Child)p1;   //downcasting
	 c.move();
	 c.small();
	 c.large();
	 
	 
	 
	 Parent p2=new Child();
	 p2.move();
	// p2.large();-
	//p2.small();
	 
	 
      
	}

}
class Parent
{
	  void move()
	{
		System.out.println("parent");
	}
	void large()
	{
		System.out.println("parent 1");
	}
}
class Child extends Parent
{
	  void move()
	{
		System.out.println("child ");
	}
	void small()
	{
		System.out.println("child 1");
	}
}