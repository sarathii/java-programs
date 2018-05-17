package next;
import java .util.*;
public class hcf {
public static void main(String args[])
{
	int num1,num2;
	Scanner s=new Scanner(System.in);
	System.out.println("enter number to find");
	num1=s.nextInt();
	num2=s.nextInt();
int n,gcd=0;
if( num1<num2)
	n=num1;
else
	n=num2;
for(int i=1;i<=n;i++)
{
	if((num1%i==0)&(num2%i==0))
		gcd=i;
	
}
System.out.println(gcd);
int lcm=(num1*num2)/gcd;
System.out.println("lcm is"+lcm);
  


}
}
