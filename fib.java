package next;

import java.util.Scanner;

public class fib {
public static void main(String ars[])
{Scanner s =new Scanner(System.in);
	System.out.println("enter how many number to print");
	int num=s.nextInt();
	int a=0;
	int b=1;
	System.out.print("fibonaci series\n" +a+"\n"+b+"\n");
	for(int i=2;i<=num-1;i++)
	{
		System.out.print((i-1)+(i-2)+"\n");
	}
	
}
}
