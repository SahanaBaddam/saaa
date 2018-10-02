package exceptions;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		c();
		}
		catch(Exception e){
			System.out.println("main");
			e.printStackTrace();
			
	}

	}
	public static void a()throws Exception
	{
		System.out.println("a");

		throw new Exception();
			}
    public static void b()throws Exception
    {
    	System.out.println("b");

    	a();
    }
    public static void c()throws Exception
    {
    	System.out.println("c");

    	b();
    }
}
