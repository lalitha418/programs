import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		String s="laitha";
		 String s1=new String("lalitha");
		  s1=s1.concat("lal");
		  System.out.println(s1);
//		System.out.println(character("advanced java"));
//		String a="text";
//		a="book";
//		System.out.println(a);
//
//	}
//
//	public static int character(String str) {
//
//		
//
//		// str.charAt(76);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter");
//		char c = sc.next().charAt(0);
//		 char[] ch=str.toCharArray();
//		 int i=0;
//		 int n=str.length();
//		 while(i<n)		 
//		 {
//			 if(ch[i]==c)
//			 {
//				 return i;
//			 }
//			 else
//			 {
//				 i++;
//			 }
//
//		 }
//		 return i;
//		
//			 
//			
//		 
			 
//		// int result=str.indexOf('a');
//		String result1 = str.substring(n, n + 1);
//		return result1;
	}
}





























// public static void main(String args[]){
// StringBuffer sb=new StringBuffer();
// System.out.println(sb.capacity());//default 16
// sb.append("Hello");
//
// System.out.println(sb.capacity());//now 16
// sb.append("java is my favourite language");
// System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
// //now no change
// System.out.println(sb.capacity());//now 34
// sb.ensureCapacity(50);//now (34*2)+2
// System.out.println(sb.capacity());//now 70
// }
//
