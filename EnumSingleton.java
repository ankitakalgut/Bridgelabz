package DesignPatterns;

/*****************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 *
 *Purpose:Use of Enum to implement Singleton design pattern as Java ensures that any enum value 
 		  is instantiated only once in a Java program.
*******************************************************************************************/
public enum EnumSingleton
{
	    INSTANCE;
	    public static void doSomething()
	    {
	        //do something
	    }
	    public static void main(String args[])
	    {
	    	System.out.println(INSTANCE);
	    }
}

