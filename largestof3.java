package next;

import java.util.Scanner;

public class largestof3 {
	public static void main(String args[])
	{
		int a,b,c;
		System.out.println("enter numbers");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();

		if((a>b)&(a>c))
		 System.out.println(a);
		else if(b>c)
			System.out.println(b);
		else
			System.out.println(c);
	}

}
