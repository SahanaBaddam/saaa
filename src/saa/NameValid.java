package saa;

import java.util.Scanner;

public class NameValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String a=sc.nextLine();
		nameValidation(a);
	}
	
	public static boolean nameValidation(String s)
	{
		
		int c=0;
		int r=s.length();
		
		if(r>=3)
		{
			
			for(int i=0;i<s.length();i++)
			{
			if((s.charAt(0)>=65) &&(s.charAt(0)<=90))
			{
					if((s.charAt(i)=='a') ||(s.charAt(i)=='e') ||(s.charAt(i)=='i') ||(s.charAt(i)=='o') ||(s.charAt(i)=='u'))
					{
						c++;
					}
				}
			}
			if(c>0)
			{
				System.out.println("valid");
			}
		}
		
		else{
			System.out.println("invalid");
			
		}
		
		return false;
	}

}
