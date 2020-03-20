
public class Encapsualtion {
	public static void call()
	{
		System.out.println("hii");
	}

	public static void main(String[] args)
	{
//		//samsaung s= new samsaung();
//		//iphone i=new iphone();
//		Encapsualtion ph;//=new phone();
//		ph=new iphone();
//		ph=new samsaung();
//		((iphone) ph).call();
//		ph=new samsaung();
//		ph.call();
//		ph=new iphone();
//		ph.call();
//		//ph.call();
//		//ph.print();
	    Encapsualtion e=new samsaung();
	    e.call();
	    samsaung s=(samsaung) new Encapsualtion();
	    s.call();
	}

}
class  samsaung extends Encapsualtion
{
	public  static void call()
	{
		System.out.println("samsaung call");
	}
	public void camera()
	{
		System.out.println("samsaung camera");
	}
}
class iphone extends Encapsualtion
{
    public static void call() {
    	System.out.println("ipone call");
    }
    public void camera()
    {
    	System.out.println("iphone camera");
    }
}