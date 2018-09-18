package saa;

import java.util.Scanner;

public class PanValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		String a=sc.nextLine();
		
		if(a.length()==10){
			int c=0,cc=0;
			for(int i=0;i<a.length();i++)
			{
				if((a.charAt(i)>=48) && (a.charAt(i)<=58))
						
				{
					c++;
				}
				
				if((a.charAt(i)>=65) && (a.charAt(i)<=90))
				{
					cc++;
				}
					
				}
			
			if((c+cc)!=0 && c!=0 && cc!=0)
			{
				System.out.println("accept");
			}
		
			else{
				System.out.println("not accept" );
			}
					
		
		}
		else{
			System.out.println("invalid");
		}
	}
}
		
		

	
	
	
	


