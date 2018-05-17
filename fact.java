package next;
import java.util.*;

public class fact {
	public static void main(String args[])
	{
		int fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}

}
