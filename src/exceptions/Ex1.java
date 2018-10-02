package exceptions;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		System.out.println("st1");
		System.out.println("st2");
		try{
		System.out.println(5/n);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exc2");
		}
		catch(Exception e)
		{
			System.out.println("exc");
		}
		
		finally{
			System.exit(0);
			System.out.println("sahana");
		}
		}

	}


