package strings;

public class S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ADC45F1JK";
		char[] ch=s.toCharArray();
		   System.out.println(big(ch));

	}
	
	public static String big(char[] ch)
	{
		String s1="";
		String s2="";
		String s3="";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				s1=s1+ch[i];
			}
			
			if(ch[i]>=48 && ch[i]<=57)
			{
				s2=s2+ch[i];
			}
		}
		
		s3=s1+s2;
		return s3;
	}

}
