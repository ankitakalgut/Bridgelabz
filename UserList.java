package com.bridgelabz.ObjectOriented;

import java.util.ArrayList;

public class UserList 
{
	ArrayList<UserDetails> userList = new ArrayList<UserDetails>();

	/**
	 * @return the userList
	 */
	public ArrayList<UserDetails> getUserList()
	{
		return userList;
	}

	/**
	 * @param userList
	 *            the userList to set
	 */
	public void setUserList(ArrayList<UserDetails> userList) 
	{
		this.userList = userList;
	}
}


