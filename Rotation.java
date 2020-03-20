//import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class Rotation {
	 static List<Appp> set=new LinkedList<>();
//	 static ListIterator it=set.listIterator();
	
	 static Scanner sc=new Scanner(System.in);
//	 static ListIterator li=set.listIterator();

	public static void main(String[] args) 
	{
		Appp app=new Appp("google",false,true);
		set.add(new Appp("AnywhereWorks",false,true));
		set.add(new Appp("YocoBoard",false,true));
		set.add(new Appp("SetMore",true,true));
		set.add(new Appp("AnswerConnect",false,true));
		set.add(app);
		 ListIterator li=set.listIterator();
		// System.out.println(set);
		System.out.println("enter the input\n1.for righr shift\n 2.for left shift\n 3.to print favoutites\n");
		
		while(true) {
		int input=sc.nextInt();
		if(input==1)
			
		{
			if(li.hasNext())
			{
				
				System.out.println(li.next());
			} else {
				
				li=set.listIterator(0);
				//li.next();
				System.out.println(li.next());
			}

		}
		else if(input==2)
		{
			if(li.hasPrevious())
			{
				System.out.println(li.previous());
			} else {
				li=set.listIterator(set.size());
				System.out.println(li.previous());
			}
		
		}
		
		else if(input==3)
		{
			for(int i=0;i<set.size();i++)
			{
		       if(set.get(i).fav==true)
		       {
		    	   System.out.println(set.get(i).appName);
		       }
			}
			
		}
		
		
		

	}}
//		public static void setCurrentApp(int index) {
//			for (int ind = 0; ind < set.size(); ind++) {
//				if (ind != index) {
//					// System.out.println("index:"+index+", "+"ind:"+ind);
//					set.get(ind).currentApp = false;
//				}
//			}
//
//		}

	
	

}
