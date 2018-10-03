package multithreading;

public class M3 implements Runnable {
	public void run()
	{
		System.out.println("custom thread");
		for(int i=1;i<=100;i++){
			System.out.println(i+" ");
		}
	}

}
