package calculator;

import java.io.BufferedReader;
import java.io.*;

public class vowel {
	public static void main(String args[])throws IOException
	{
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		char a=(char)s.read();
				if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
					System.out.print("vowel");
				else
					System.out.println("not a vowel");
	
	}

}
