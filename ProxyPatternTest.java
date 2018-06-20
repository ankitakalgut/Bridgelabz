package DesignPatterns;

/*******************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 * 
 *Purpose:Create a Command Executor Program that will execute certain system commands based on the user
  		  type is admin or otherwise
 *
 *****************************************************************************************************************/
public class ProxyPatternTest
{
	public static void main(String[] args)
	{
		CommandExecutor executor = new CommandExecutorProxy("Anklita", "wrong_pwd");
		try 
		{
			executor.runCommand("ls -l");
			executor.runCommand(" rm -rf rty.pdf");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}

}