package saa;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size:");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter key:");
		int k=s.nextInt();
		int r=bSearch(a,k);
		System.out.println(r);

	}
	
	public static int bSearch(int[] a,int k)
	{
		int low=0,high=a.length-1,mid=0;
		 mid=(low+high)/2;
		 while(low<=high)
		 {
		if(a[mid]==k)
		{
			return mid;
		}
		
		if(a[mid]>k)
		{
			high=mid-1;
		}
		else{
			low=mid+1;
		}
		mid=(low+high)/2;
	}
		 return -1;
	}
}
