package exceptions;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4 e=new Ex4();
		//try{
		e.setAge(-10);	
		//}
		//catch(Exception a)
		//{
		//	System.out.println("exe");
		//}
		System.out.println(e.age);
		
	}
	
	private int age;
	private String name;
	public String mesg;

	
	
	public void setAge(int age)
	{
		if(age<0)
		{
			throw new InvalidAgeException();
		}
		else{
			this.age=age;
		}
	}
	

}
