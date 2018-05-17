package next;
import java.util.*;
public class countposnegzero {
public static void main(String args[])
{
	int pos=0,neg=0,ze=0;
	System.out.println("how many umbers do u want to check");
	Scanner s=new Scanner(System.in);
	int  num=s.nextInt();
	int check[]=new int[num];
	for(int i=0;i<=num-1;i++)
	{
	check[i]=s.nextInt();
	if(check[i]<0)
		neg++;
	else if(check[i]>0)
		pos++;
	else
		ze++;
	}
	System.out.println("positive"+pos);
	System.out.println("negative"+neg);
	System.out.println("zeeroo"+ze);

}
}
