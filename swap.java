package next;
import java.io.*;
public class swap {
public static void main(String args[])throws IOException
{
	
	int a,b,c;
System.out.println("enter two numbers to swap");
BufferedReader s= new BufferedReader(new InputStreamReader(System.in));
a=Integer.parseInt(s.readLine());
b=Integer.parseInt(s.readLine());
System .out.println("a is "+a);
System .out.println("b is "+b);

c=a;
a=b;
b=c;
System.out.println("after swaping");
System .out.println("a is "+a);
System .out.println("b is "+b);
}
}