package next;

import java.util.Scanner;

public class tables {
	public static void main(String args[])
	{
		int  w;
		Scanner s=new Scanner(System.in);
		System.out.println("enter which  tables u want");
		w=s.nextInt();
		for (int  i=1;i<=10;i++)
		{
			System.out.println(w+"\t*\t"+i+"\t"+"=\t"+w*i);
		}
	}

}
