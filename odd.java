package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class odd {
	public static void main(String args[])throws IOException
	{
		int num;
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter no to find odd number");
		num=Integer.parseInt(b.readLine());
		if(num%2==0)
			System.out.println(num+" is a even number");
		else
			System.out.println(num+"is a odd no");
	}
	
}
