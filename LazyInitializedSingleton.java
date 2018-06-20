package DesignPatterns;

/*************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 * 
 *purpose:Lazy initialization method to implement Singleton pattern creates the instance in
  		  the global access method. 
 *************************************************************************************/
public class LazyInitializedSingleton 
{
	    private static LazyInitializedSingleton instance;
	    
	    private LazyInitializedSingleton()
	    {
	    	
	    }
	    
	    public static LazyInitializedSingleton getInstance()
	    {
	        if(instance == null)
	        {
	            instance = new LazyInitializedSingleton();
	        }
	        return instance;
	    }
}


