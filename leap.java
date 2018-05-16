package calculator;

import java.util.Scanner;

public class leap {
public static void  main(String args[])
{Scanner s=new Scanner(System.in);
System.out.println("ente year");
	int year=s.nextInt();
	if(year%4==0 &&  year%100!=0)
	{
		System.out.println("leap year");
		
	}
	else if(year%400==0)
	{
		System.out.println("leap year");
	}
	else 
		System.out.println("not a leap year");
	
}
}
