package multithreading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M3 mm=new M3();
		Thread t=new Thread(mm);
		t.start();
		M4 ma=new M4();
		Thread tt=new Thread(ma);
		tt.start();
		
		System.out.println("main thread:");
		for(int i=100;i>=1;i--)
		{
			System.out.println(i+" ");
		}
	}

}
