package strings;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5,6};
		char[] c={'a','b','c','d','e'};
		System.out.println(getReverseArray(a));

	}
	
	public static int[] getReverseArray(int[] a)
	{
		int[] b=new int[6];
		for(int i=a.length-1;i>=0;i--)
		{
		      b[i]=a[i];
		}
		

}
	return b;
	

}