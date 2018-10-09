package multithreading;

public class Daemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dem d=new Dem();
		d.setDaemon(true);
		d.start();
		
		System.out.println("main thread");

	}

}
