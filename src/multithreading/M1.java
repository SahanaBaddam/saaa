package multithreading;

public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M2 m=new M2();
		m.start();
		System.out.println("main thread");

	}

}
