package DesignPatterns;

import java.lang.reflect.Constructor;

/***************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 14-Jun-2018
 * 
 *Purpose:Reflection can be used to destroy all the above singleton implementation approaches. 
 ****************************************************************************************/
public class ReflectionSingletonTest 
{
	 public static void main(String[] args) 
	 {
	        EagerInitialization instanceOne = EagerInitialization .getInstance();
	        EagerInitialization instanceTwo = null;
	        try 
	        {
	            Constructor[] constructors =  EagerInitialization .class.getDeclaredConstructors();
	            for (Constructor constructor : constructors)
	            {
	                //Below code will destroy the singleton pattern
	                constructor.setAccessible(true);
	                instanceTwo = ( EagerInitialization ) constructor.newInstance();
	                break;
	            }
	        } catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	        System.out.println(instanceOne.hashCode());
	        System.out.println(instanceTwo.hashCode());
	    }

	}

