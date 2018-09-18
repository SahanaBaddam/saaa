package saa;
import java.util.*;
public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email:");
		String s=sc.nextLine();
		emailValid(s);
		
	}	
		
	public static boolean emailValid(String s)
	{
		int i=0;
		String[] a=s.split("@");
		
		if(a.length==2)
		{
			
			String[] b=a[1].split("//.");
			
		if(a[0].length()<=10 && b[0].length()<=5 && b[1].length()<=3 )
		{
			System.out.println("valid mail:");
		}
		else{
			System.out.println("invalid:");
		}
		}
	
		return false;

	}

}
