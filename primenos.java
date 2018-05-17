package next;

import java.util.Scanner;

public class primenos {
	public static void main(String args[])

	{
		Scanner s=new Scanner(System.in);
		int num =s.nextInt();
	
	for(int j=1;j<=num;j++)
	{
		int count=0;
	for(int i=2;i<j;i++)
	{
		if(j%i==0)
			count++;
		
	}
	if(count==0)
	{
		System.out.println(j);
	}
	}
	}
}
