package com.class28;

public class UserTest extends User{

	

	private static int mobileNumber;
	private String adress;

	UserTest(String name,String adress) {
		super(name, mobileNumber);
		this.adress=adress;
	}

	public void UserDetails() {
		
		System.out.println(name+" "+adress+" "+mobileNumber);
	}
	public static void main(String[] args) {
		UserTest obj=new UserTest("Kanat","12000 Village Sq terrace");
		obj.UserDetails();
	}
}

