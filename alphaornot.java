package calculator;

import java.util.Scanner;

public class alphaornot {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
	char a=s.next(). charAt(0);
	if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
		System.out.println(a+"is a alphabhet");
	else
		System.out.println("not a alphabhet");
	
}
}