import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


/*class App {
	appname
	fav
	currentapp
}

App ap = new App();
ap.appname
fav
currentapp

List<App> applist

applist.add(ap);*/


public class Lalitha {
	static List<String> list=new LinkedList<>();
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		list.add("Tv");
		list.add("mobile");
		list.add("iphone");
		list.add("gadgets");
		while (true) {
			printActions();
			int action = 0;
			try {
				action = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("enter valid input");
			}

			switch (action) {
			case 1:
				printList();
				break;
//			case 2:
//				addToFavourites();
//				break;
//			case 3:
//				printFavourites();
//				break;
			case 4:
				shiftingLeft();
				break;
	   	case 5:
				shiftingRight();
				break;

			default:
				System.out.println("enter valid input");

			}

		
	}
		
	}

	public static void printActions() {
		System.out.println("\n1.print list\n 2.added to favourit\n 3.print FAvourites\n 4.ShiftLeft\n 5.shiftRight");
	}
	public static String printList()
	{
		System.out.println(list);
		String s=sc.next();
		int h=list.indexOf(s);
		shifting(h);
		System.out.println(s);
		return s;
		}

	public static void shiftingLeft()
	{
		int k;
		System.out.println(printList());
		

		String value=printList();
		System.out.println( "value"+value);
		System.out.println(value);
		int v= list.indexOf(value);
		System.out.println(v);
			if ((v- 1) < 0) {
				k = v + list.size() - 1;
				shifting(k);
			
			} else {
				shifting(v-1);
				System.out.println("hi");
				
			}
		

		
	}
	public static void shiftingRight()
	{
        int k;
		String value=printList();
		int v= list.indexOf(value);

		if ((v + 1) > (list.size() - 1)) {
			k = (v % (list.size() - 1));
			shifting(k);
			

		} else {
			shifting(v+1);
			

		}
	}
	
	public static void shifting(int v)
	{
		
		for(int i=0;i<list.size();i++)
		{
			if(v==i)
			{
				System.out.print("<"+list.get(i)+">\t");
			}
			else
			{
				System.out.print(list.get(i)+"\t");
			}
		}
	}
}
