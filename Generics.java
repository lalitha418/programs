import java.util.Scanner;

public class Generics {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		int n=sc.nextInt();
		String[] str =new String[n];
	
		for(i=0;i<=n;i++) {
			//System.out.println("enetr numbers");
			str[i] =sc.nextLine();
		}
		sc.close();
		
		String[] intnum=str;
		String[]  stringnum= {"hiii","hloo","hey"};
		Double[] doublenum= {1.2,1.3,1.4,1.5};
		num(intnum);
		//num(stringnum);
		//num(doublenum);
		
	}

	public static <A> void num(A[] array)
    { 
		for(A elements :array)
		{
			System.out.println(elements);
			
		}
	}
}