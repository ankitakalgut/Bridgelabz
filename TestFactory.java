package DesignPatterns;

/************************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 14-jun-2018
 * 
 * Purpose: Use Factory Pattern to create a Computer Factory that can Produce PC, Laptop and  
			Server Class Computers. Create an Abstract Computer Class and PC, Laptop and
			Server inherit from Computer and ComputerFactory  is able to create the corresponding 
			Computer Object on request.
 ************************************************************************************************/
public class TestFactory 
{
	public static void main(String[] args) 
	{
		Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}
}

