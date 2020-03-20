import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

public class Applicationn {
	static List<Appp> appList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static int k = 0;
	//static ListIterator li;
 static	ListIterator li = appList.listIterator();


	public static void main(String[] args) {
		// Appp app=new Appp("eclipse",true,"no");
		int action = 0;

		while (true)

		{
			System.out.println("enter input");

			try {
				action = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("enter valid input");
			}

			switch (action) {
			case 1:
				method();
				break;
			case 2:
				print();
				break;
			case 3:
				shiftleft();
				break;
			case 4:
				shiftRight();
				break;
			case 5:
				printFAvourites();
				break;
			}
		}

	}

	public static void setCurrentApp(int index) {
		for (int ind = 0; ind < appList.size(); ind++) {
			if (ind != index) {
				// System.out.println("index:"+index+", "+"ind:"+ind);
				appList.get(ind).currentApp = false;
			}
		}

	}

	public static void method() {

		Appp app = new Appp(null, false, false);

		System.out.println("enetr the App name");
		app.appName = sc.next();

		System.out.println("enter fav or not(boolean true/false");
		boolean result = true;
		while (result) {
			try {
				app.fav = sc.nextBoolean();
				result = false;
			} catch (InputMismatchException e) {
				System.out.println("enter valid input");
			}
		}
		System.out.println("enter curent website(true/false");
		app.currentApp = sc.nextBoolean();
		appList.add(app);
		setCurrentApp(appList.indexOf(app));
//		ListIterator li = appList.listIterator();

		System.out.println(appList);

	}

	public static void shiftleft() {

		 ListIterator li=appList.listIterator();

		if (li.hasNext()) {

			System.out.println(li.next());
		} else {

			li = appList.listIterator(0);
			// li.next();
			System.out.println(li.next());
		}

	}

	public static void shiftRight()

	{
		 ListIterator li=appList.listIterator();

		if (li.hasPrevious()) {
			System.out.println(li.previous());
		} else {
			li = appList.listIterator(appList.size());
			System.out.println(li.previous());
		}

	}

	public static void printFAvourites() {
		for (int i = 0; i < appList.size(); i++) {
			if (appList.get(i).getFav() == true) {
				System.out.println(appList.get(i).getAppName());
			}
		}
	}

	public static void print() {

		for (int i = 0; i < appList.size(); i++) {
			System.out.println("appName:  " + appList.get(i).getAppName() + "      Fav:   " + appList.get(i).getFav()
					+ "  currentWebsite:  " + appList.get(i).getCurrentApp());
		}

	}

}
