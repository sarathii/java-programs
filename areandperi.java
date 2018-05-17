package next;
import java.io.*;
public class areandperi {
	public static void main(String args[])throws IOException
	{System.out.println("radius of the circle??..");
		int radius ;
		float p=3.14f;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		radius=Integer.parseInt(br.readLine());
		float area=p*radius*radius;
		float peri=2*p*radius;
		System.out.println("area of the circle"+area+"\nperimeter of the circle"+peri);;
	}

}
