package multithreading;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My a=new My();
		System.out.println(a.getId());
		a.setName("MySahana");
		System.out.println(a.getName());
		a.start();
       boolean t= a.isAlive();
		System.out.println(t);
		System.out.println("main thread");

	}

}
