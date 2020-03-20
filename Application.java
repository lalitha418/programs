import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Application {
	
	static List<String> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static Set<String> set = new LinkedHashSet<>();

	public static void main(String[] args) {
		list.add("Chrome");
		list.add("AW");
		list.add("Yocoboard");
		list.add("FaceBook");
		list.add("Google");

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
			case 2:
				addToFavourites();
				break;
			case 3:
				printFavourites();
				break;
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

	public static void printList() {
		
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {

			String s = list.get(i);
			
			Character c = new Character(s.charAt(0));

			int len = s.length();
			if (c.equals('<')) {
				s = s.substring(1, s.length() - 1);
				list.set(i,s);
	}}
		System.out.println(" enter the site you want to visit ");
		String k = sc.next();
		for (String s : list) {
			int i = list.indexOf(s);
			if (s.equals(k)) {
				String ss = method(s);
				System.out.print(ss + "\t");
				list.set(i, ss);

			} else {
				System.out.print(s + "\t");
			}
		}
		}

	public static void printActions() {
		System.out.println("\n1.print list\n 2.added to favourit\n 3.print FAvourites\n 4.ShiftLeft\n 5.shiftRight");
	}

	public static void printFavourites() {

		System.out.println("favourite sites" + set);
	}

	public static void addToFavourites() {
		List list1 =new ArrayList<>(set);
		for (int i = 0; i < list.size(); i++) {

			String s = list.get(i);
			
			Character c = new Character(s.charAt(0));

			int len = s.length();
			if (c.equals('<')) {
				s = s.substring(1, s.length() - 1);
				set.add(s);
				System.out.println("present site successfully added to faourite list");
			}
		}
	}

	public static void shiftingLeft() {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (count == 0) {

				String s = list.get(i);

				char c = s.charAt(0);
				if (c == '<') {
					s = s.substring(1, s.length() - 1);
					list.set(i, s);
					count++;

					// System.out.println(list);

					int k = i - 1;

					if ((i - 1) < 0) {
						// System.out.println(list.size());
						k = i + list.size() - 1;
						s = list.get(k);

					} else {
						s = list.get(i - 1);
					}

					String ss = method(s);
					list.set(k, ss);
					System.out.println(list);
				}
			}
		}
	}

	public static void shiftingRight() {
		int count = 0;

		if(count==0) {
					count = count + 1;
					int i=method1();
					String s;

					int k = i + 1;

					if ((i + 1) > (list.size() - 1)) {
						k = (i % (list.size() - 1));
						System.out.println(k);
						s = list.get(k);

					} else {
						s = list.get(k);

					}

					System.out.println(s);

					String ss = method(s);
					list.set(k, ss);
					System.out.println(list);

				}
			}
		}
	}

	public static String method(String s) {
		StringBuilder str1 = new StringBuilder(s);
		StringBuilder str2 = str1.insert(s.length(), ">");
		StringBuilder str3 = str2.insert(0, "<");
		String ss = new String(str3);
		return ss;

	}
	public static int method1()

	{
		int k=0;
		for (int i = 0; i < list.size(); i++) {

			String s = list.get(i);
			
			Character c = new Character(s.charAt(0));

			int len = s.length();
			if (c.equals('<')) {
				s = s.substring(1, s.length() - 1);
				list.set(i,s);
				k=i;
				
			
	}}
		return k;
	}

