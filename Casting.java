
public class Casting {

	public static void main(String[] args)
	{
         Bike b=new Bike();
         b.moving();
         
         
         
         Vehicle v=new Vehicle();
         v.moving();
         
         
         
         Vehicle v1= new Bike();
         v1.moving();
         
         
         
         
        
         Bike B1=(Bike)v1;
         B1.moving();
         B1.goMoving();
         v1.run();
         B1.run();
         b.run();//inheriting
      // v.goMoving(); doesnot contain the method
  //     v1.goMoving();


	}

}
class Bike extends Vehicle
{
	void moving() {
	System.out.println("hii");}
	void goMoving()
	{
		System.out.println(" bike");
	}
	
}

class Vehicle
{
	void moving()
	{
		System.out.println("hlo");
	}
	void run()
	{
		System.out.println("vehicle");
	}
}