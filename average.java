package calculator;
import java.io.*;
public class average {
	public static void main(String args[])throws IOException
	{
		int tot=0;
	BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter no of sub to find");
	int n=	Integer.parseInt(s.readLine());
	int mark[] = new int[n];
	for (int i=0;i<=n-1;i++)
	{
		mark[i]=Integer.parseInt(s.readLine());
		tot+=mark[i];
	}
int avg=tot/n;
System.out.println(avg);

}
}