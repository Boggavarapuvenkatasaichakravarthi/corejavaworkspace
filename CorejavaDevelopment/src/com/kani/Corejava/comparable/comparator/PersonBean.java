package com.kani.Corejava.comparable.comparator;

public class PersonBean  

{
	int age;
	String firstName;
	String lastName;
	Integer i;
	
	public PersonBean(String firstName,String lastName,int age)
	{
		this.firstName=firstName;
		this.lastName =lastName;
		this.age=age;
		
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public int getAge()
	{
		return age;
	}
	public String getLastName()
	{
		return lastName;
	}
	 public String toString()
	    {
	        return firstName + ":" + lastName + ":" + age;
	    }
	
}
