package com.kani.Corejavaoops;

public class LoginDetails {
	public void userLogin(String uname,String pass)
	{
		System.out.println("UserName:"+uname);
		System.out.println("Password:"+pass);
	}
	public void userLogin(String uname,String pass,String capcha)
	{
		System.out.println("UserName:"+uname);
		System.out.println("Password:"+pass);
		System.out.println("Capcha:"+capcha);
	}
	public void userLogin(int mobile,String pass)
	{
		System.out.println("Mobile:"+mobile);
		System.out.println("Password:"+pass);
		
	}
	public int userLogin()
	{
		return 100;
		
		
	}
	public static void main(String[] args) {
	LoginDetails ld=new LoginDetails();
	ld.userLogin("sai"," sai@123");
	ld.userLogin("Ravi"," Rai@123","ABC");
	ld.userLogin(12345678,"Ram@123");
	int t=ld.userLogin();
	System.out.println(t);
	
	

	}

}
