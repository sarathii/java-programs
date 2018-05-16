package calculator;

import java.util.Scanner;

public class reverse {
	public static void main(String args[])
	{
		int num;
		int rem,rev=0;
		Scanner s=new  Scanner (System.in);
		num=s.nextInt();
		int init=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if (init==rev)
			System.out.println("same");
		else
			System.out.println("not same");
		}
	}


