package Series.fib.in;

import java.util.Scanner;

public class Fib_Scn {

	public static void main(String[] args) {
		int n1=0,n2=1,n3=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a count");
		int count=obj.nextInt();
		 System.out.print(n1 + " " + n2);
		 for(int i=2;i<count;i++)
		 {
			 n3=n1+n2;
			 n1=n2;
			 n2=n3;
			 System.out.print(" " + n3);
			 
		 }

	}

}
