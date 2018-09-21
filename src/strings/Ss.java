package strings;

public class Ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="find biggest element sdsdsdfdds";
		String[] a=s.split(" ");
		
		String max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(max.length()<a[i].length())
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
