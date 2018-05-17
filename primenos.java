package next;

import java.util.Scanner;

public class primenos {
	public static void main(String args[])

	{
		Scanner s=new Scanner(System.in);
		int num =s.nextInt();
		for(int i=1;i<=num;i++)
		{ int count=0;
			for(int j=2;j<i;j++)
			{
				if(num%i==0)
					count++;
			}
			if(count==0)
				System.out.println(i);
		}
		
	}
}
