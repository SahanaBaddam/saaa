package multithreading;
import java.util.*;

public class M2 extends Thread {
	
	public void run()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no:");
		int n=s.nextInt();
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}

}
