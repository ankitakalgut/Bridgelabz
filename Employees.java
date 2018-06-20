package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.Utility.Utility;

/**********************************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 *
 * Purpose: Prototype design pattern to create multiple Employee Object.
 *
 **********************************************************************************************************/
public class Employees implements Cloneable
{
	private List<String> empList;
	
	public Employees()
	{
		empList = new ArrayList<String>();
	}
	
	public Employees(List<String> list)
	{
		this.empList=list;
	}
	public void loadData()
	{  
		Utility u=new Utility();
		System.out.println("Enter the number of employees to add :");
		int n=u.getInteger();
		for(int i=0;i<n;i++)
		{
			//read all employees from database and put into the list	
			empList.add(u.getString());
		}
	}
	public List<String> getEmpList() 
	{
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Employees(temp);
	}
}