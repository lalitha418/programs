import java.util.Scanner;
import java.util.regex.*;

public class CheckWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String s = scan.next();
		int count=0;
        String format="[^A-Za-z0-9\\s]";
		Pattern p = Pattern.compile(format);
		Matcher match = p.matcher(s);
		while(match.find()) {
			count++;
			//System.out.println("hii");
			//System.out.println(match.matches());
		} 
		System.out.println(count);
		scan.close();
	}

}
