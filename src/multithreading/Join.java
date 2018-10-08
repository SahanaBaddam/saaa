package multithreading;

public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
J1 c=new J1();
J2 d=new J2();
c.start();
d.start();
d.aa();
try{
c.join(2000);
}
catch(Exception e)
{
	System.out.println("rrr");
}


try{
d.join(2000);
}
catch(Exception e)
{
	System.out.println("rrr");
}

System.out.println("fffff");

	
	}
}
