package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cs {
public static void main(String args[])throws IOException
{
	
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.division\nenter ur choice");
		int choice=Integer.parseInt(r.readLine());
		switch(choice)
		{
			case 1:
				System.out.println("enter two num to add");
			int num1=Integer.parseInt(r.readLine());
			int num2=Integer.parseInt(r.readLine());
			int add=num1+num2;
			System.out.println("sum of two number is"+add);
			case 2:
				
				System.out.println("enter two num to add");
			float num=Float.parseFloat(r.readLine());
				float no=Float.parseFloat(r.readLine());
				float   sub=num-no;
				System.out.println("sum of two number is"+sub);
			case 3:
				System.out.println("enter two number");
				int m1=Integer.parseInt(r.readLine());	
				int m2=Integer.parseInt(r.readLine());
				int mul=m1*m2;
				
				
				System.out.println(mul);
			case 4:
				System.out.println("enter two number");
				int d1=Integer.parseInt(r.readLine());
				int d2=Integer.parseInt(r.readLine());
				int divl=d1/d2;
				System.out.println(divl);
			

		}
	}

}

