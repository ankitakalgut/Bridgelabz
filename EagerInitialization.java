package DesignPatterns;

/**********************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 *Purpose:Instance of class is created at the time of class loading.
 *************************************************************************************/
public class EagerInitialization 
{
	    private static final EagerInitialization  instance = new EagerInitialization();
	    
	    //private constructor to avoid client applications to use constructor
	    private EagerInitialization ()
	    {
	    	
	    }

	    public static EagerInitialization getInstance()
	    {
	        return instance;
	    }
	    
	    public static void main(String args[])
	    {
	    	System.out.println(instance);
	    }
	}

