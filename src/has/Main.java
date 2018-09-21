package has;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer c=new Computer();
		c.cp=new CPU(); 
		c.cp.bl=new Bill();
		c.cp.bl.finalPrice=54.43;
		c.display();
		
	}

}
