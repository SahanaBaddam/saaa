package multithreading;

public class Inturupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intu i=new Intu();
		i.start();
		i.interrupt();
		boolean c=i.isInterrupted();
		System.out.println(c);

		
	}

}
