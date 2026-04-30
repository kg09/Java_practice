package java_practice;

//multilevel inheritance 

class car
{
	public void vehicle_type()
	{
		System.out.println("4 wheeler");
	}
	
}

class maruti extends car 
{
	public void company()
	{
		System.out.println("maruti");
	}
	public void start_date()
	{
		System.out.println("1980");
	}
	
}

class maruti800 extends maruti
{
	public void model()
	{
		System.out.println("800");
	}
}


public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  maruti800 m800 = new maruti800();
	  m800.model();
	  m800.company();
	  m800.start_date();
	  m800.vehicle_type();
	   
		
	
	}
	

}
