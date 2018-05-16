package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class prime {
public static void main(String args[])throws IOException
{
	int num;
	int count=0;
	BufferedReader 	 s=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter number");
	
	num=Integer.parseInt(s.readLine());
	for (int i=2;i<num;i++)
	{
		if(num%i==0)
			count++;
	}
	if(count==0)
	{
		System.out.println("it is a prime number");
		
	}
	else 
		System.out.println("not a prime number");
	
}
}
