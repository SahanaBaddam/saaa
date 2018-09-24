package car;

public class Car {
	final static String manufacture_com="TATA";
	static int car_object_count;
	private String car_no;
	private int car_fuel_capacity;
	private int car_max_speed_limit;
	private int running_speed;
	private int fuel_in_tank;
	private boolean head_lights;
	private String destination;
	private String from;
	private String start_time;
	private Driver driver;
	
	
	
	public void fillFuel(int fuel)
	{
		if(fuel_in_tank < car_fuel_capacity)
		{
			fuel_in_tank=fuel_in_tank+fuel;
		
		if(fuel_in_tank == car_fuel_capacity)
		{
		   System.out.println("tank is full");
		}
		else
		{
			System.out.println("tank is not full");
		}
	}}
	
	
	public void accelarate(int speed)
	{
		if(running_speed<car_max_speed_limit)
		{
			running_speed=running_speed+speed;
			fuel_in_tank--;
			System.out.println(running_speed+"");
			System.out.println(fuel_in_tank+"");
			
		if(running_speed>car_max_speed_limit)	
		{
			System.out.println("car extended the max speed limit");
		}
		else
		{
			System.out.println("car speed is in control");
		}
		}
	}
	
	
	public void isLigthsOn()
	{
		if(head_lights==true)
		{
			System.out.println("car ligths are in on position");
		}
		else{
			System.out.println("car lights are in off position");
		}
		
	}
	
	
	
	
	

	public void setCarObjectCount(int car_object_count)
	{
		this.car_object_count=car_object_count;
	}
	public int getCarObjectCount()
	{
		return car_object_count;
	}
	
	
	
	
	public void setCarNumber(String car_no)
	{
		this.car_no=car_no;
	}
	public String getCarNumber()
	{
		return car_no;
	}
	
	
	
	public void setCarFuelCapacity(int car_fuel_capacity)
	{
		this.car_fuel_capacity=car_fuel_capacity;
	}
	public int setCarFuelCapacity()
	{
		return car_fuel_capacity;
	}
	
	
	
	
	public void setCarMaxSpeedLimit(int car_max_speed_limit)
	{
		this.car_max_speed_limit=car_max_speed_limit;
	}
	public int getCarMaxSpeedLimit()
	{
		return car_max_speed_limit;
	}
	
	
	
	
	public void setRunningSpeed(int running_speed)
	{
		this.running_speed=running_speed;
	}
	public int getRunningSpeed()
	{
		return running_speed;
	}
	
	
	
	
	public void setFuelInTank(int fuel_in_tank)
	{
		this.fuel_in_tank=fuel_in_tank;
	}
	public int getFuelIntank()
	{
		return fuel_in_tank;
	}

	
	
		
	public void setHeadLights(boolean head_lights)
	{
		this.head_lights=head_lights;
	}
	public boolean getHeadLights()
	{
		return head_lights;
	}

		
	
	
	public void setDestination(String destination)
	{
		this.destination=destination;
	}
	public String getDestination()
	{
		return destination;
	}
	
	
	
	public void setFrom(String from)
	{
		this.from=from;
	}
	public String getFrom()
	{
		return from;
	}
	
	
	
	public void setStartTime(String start_time)
	{
		this.start_time=start_time;
	}
	public String getStartTime()
	{
		return start_time;
	}
	
	
	
	public void setDriver(Driver driver)
	{
		this.driver=driver;
	}
	public Driver getDriver()
	{
		return driver;
	}
	
	
	
	public void printCarStatus()
	{
		System.out.println(car_object_count+" "+
	                       car_no+" "+car_fuel_capacity+" "+car_max_speed_limit+" "+
				           running_speed+" "+fuel_in_tank+" "+head_lights+" "+
	                       destination+" "+from+" "+start_time+" "+driver);
	}




}
