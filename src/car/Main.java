package car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		
		
		Driver d=new Driver();
		Driver d1=new Driver();
		Driver d2=new Driver();
		Driver d3=new Driver();
		
		
		
		d.setId(1);
		d.setName("sahana");
		
		
		//d1.setId(2);
		//d1.setName("rajani");

		
		//d.setId(3);
		//d.setName("navi");

		
		//d.setId(4);
	//	d.setName("mouni");
		
		c.setDriver(d);
		System.out.println(c);
		//c1.setDriver(d1);
		//c2.setDriver(d2);
		//c3.setDriver(d3);


        c.setCarObjectCount(8);
        c.setCarNumber("AP29Ax4653");
        c.setCarMaxSpeedLimit(200);
        c.setCarFuelCapacity(500);
        c.setRunningSpeed(120);
        c.setFuelInTank(200);
        c.setHeadLights(true);
        c.setDestination("nizamabad");
        c.setFrom("hyderabad");
        c.setStartTime("8'clock");


        c1.setCarObjectCount(9);
        c1.setCarNumber("AP29Ax4654");
        c1.setCarMaxSpeedLimit(200);
        c1.setCarFuelCapacity(500);
        c1.setRunningSpeed(100);
        c1.setFuelInTank(290);
        c1.setHeadLights(true);
        c1.setDestination("kammam");
        c1.setFrom("hyderabad");
        c1.setStartTime("9'clock");
        
        
        c2.setCarObjectCount(10);
        c2.setCarNumber("AP29Ax4655");
        c2.setCarMaxSpeedLimit(200);
        c2.setCarFuelCapacity(500);
        c2.setRunningSpeed(140);
        c2.setFuelInTank(300);
        c2.setHeadLights(false);
        c2.setDestination("adilabad");
        c2.setFrom("hyderabad");
        c2.setStartTime("2'clock");
        
        
        c3.setCarObjectCount(11);
        c3.setCarNumber("AP29Ax4656");
        c3.setCarMaxSpeedLimit(200);
        c3.setCarFuelCapacity(500);
        c3.setRunningSpeed(90);
        c3.setFuelInTank(500);
        c3.setHeadLights(true);
        c3.setDestination("nizamabad");
        c3.setFrom("hyderabad");
        c3.setStartTime("3'clock");

        
        c.fillFuel(6);
        c.accelarate(4);
        c.isLigthsOn();
        c.printCarStatus();
       

       c1.fillFuel(10);
        c1.accelarate(5);
        c1.isLigthsOn();
       
        
        c2.fillFuel(10);
        c2.accelarate(7);
        c2.isLigthsOn();
        
        Car[] a=new Car[4];
        a[0]=c;
        a[1]=c1;
        a[2]=c2;
        a[3]=c3;
        
        
        Main m=new Main();
        m.findCars(a,"nizamabad");
	}  
	
	
	
        public static Car[] findCars(Car[] a, String destination)
        {
        	int c=0;
        	String s="";
        	for(int i=0;i<a.length;i++)
        	{
        		if(a[i].getFrom()=="hyderabad" && a[i].getDestination()=="nizamabad")
        		{
        			s=a[i].getStartTime()+" "+a[i].getCarNumber();
        			c++;
        		}
        	}
        		if(c>=1)
            	{
            		System.out.println(s);
            	}
            	else
            	{
            		System.out.println("no cars are available");
            	}
        	
        	
        	
        	return a;
        }
       
	}


