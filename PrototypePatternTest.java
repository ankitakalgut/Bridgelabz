package DesignPatterns;

import java.util.List;

import com.bridgelabz.Utility.Utility;

/****************************************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 *
 *Purpose: Prototype design pattern to create multiple Employee Object.  
 ****************************************************************************************************************/
public class PrototypePatternTest
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employees emps = new Employees();
		emps.loadData();
		Utility u=new Utility();
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add(u.getString());
		List<String> list1 = empsNew1.getEmpList();
		list1.remove(u.getString());
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List after adding : "+list);
		System.out.println("empsNew1 List after removing : "+list1);
	}
}
