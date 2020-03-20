import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class App {
	static List<String> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static Set<String> set=new LinkedHashSet<>();

	public static void main(String[] args) {
	
	
		list.add("Chrome");
		list.add("AW");
		list.add("Yocoboard");
		list.add("FaceBook");
		list.add("Google");
		System.out.println(list);

		System.out.println(" \nenter the site you want to use ");
		
		String in = sc.nextLine();
		for (String s : list) {
			int i = list.indexOf(s);
			if (s.contains(in)) {
				String ss = Builder.method(s);
				System.out.print(ss + "\t");
				list.set(i, ss);

			} else {
				System.out.print(s + "\t");
			}}

		
		
		 

		boolean result = true;
//		System.out.println("\ndo you want to move \nclick < for fwd dir \n      > for bwd dir:");


		while (result)
		{
			
			for (int i = 0; i < list.size(); i++)
			{
				

				String s = list.get(i);

				Character c = new Character(s.charAt(0));

	
				if (c.equals('<'))
				{
					
					
					s = s.substring(1, s.length() - 1);
					list.set(i, s);
					System.out.println("\n do you want to add the current list to favourites");
					String st=sc.next();
					if(st.equals("yes"))
						{
						  set.add(s);
						}
					System.out.println(set);
					System.out.println(list);
					
				
					 
					// System.out.println(list);
					 System.out.println("enter < frwd dir\n    >bwd dir");
					 char input = sc.next().charAt(0);
				
					 

					if (input == '<') 
					{
						int k = i - 1;
						System.out.println(k);

						if ((i - 1) < 0)
						{
							//System.out.println(list.size());
							k = i +list.size()-1;
							s = list.get(k);
							

						}
						else
						{
							s = list.get(i - 1);
						}


						String ss = Builder.method(s);
						list.set(k, ss);
						System.out.println(list);

					} 
					else if (input == '>')
					{
						int k = i + 1;

						if ((i + 1) > (list.size()-1)) {
							k = (i % (list.size()-1));
							System.out.println(k);
							s = list.get(k);
							

						} else {
							s = list.get(k);
				
						}

						System.out.println(s);

						String ss = Builder.method(s);
						list.set(k, ss);
						System.out.println(list);

					}
					else
					{
						System.out.println("enter the valid input");
					}
					
				}

			}

		}
	}
	
}

class Builder extends App {
	public static String method(String s) {
		StringBuilder str1 = new StringBuilder(s);
		StringBuilder str2 = str1.insert(s.length(), ">");
		StringBuilder str3 = str2.insert(0, "<");
		String ss = new String(str3);
		return ss;

	}
}