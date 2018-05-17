package next;

import java.util.Scanner;

public class fibno {
	public static void main(String args[])
	{Scanner   s=new Scanner(System.in);
		int a=0,b=1,c=0;
		System.out.println("enter num to find fibnoci");
		int num=s.nextInt();
		for(int i=2;i<num;i++)
		{
			c=(i-1)+(i-2);
		}
		System.out.println("fib of "+num+"is"+c);
	}

}
