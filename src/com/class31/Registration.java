package com.class31;
class RegistrationClass{
	private String email,userName,password;
	
	public void setEmail(String email) {
		if(email.contains("gmail.com")) {
			this.email=email;
		}else {
			System.out.println("Invalid email type.Email must be gmail");
		}	
	}
	//getting email
	public String getEmail() {
		return email;
	}
	//setting userName
	public void setUsername(String userName) {
		if (!userName.isEmpty())  {
			if (userName.length()>6) {
				this.userName=userName;
			
		}else {
			System.out.println("Username should have more than 6 characters");
		}
	}else {
			System.out.println("Username cannot be empty");
		}
	}
//get the userName
public String getUserName() {
	return userName;
	}

//set password
public void setPassword(String password) {
	
	if (!password.isEmpty()) {
		if (password.length()>6) {
			if (password.contains(userName)) {	
			}else {
				System.out.println("Password cannor contain username");
			}
		}else {
			System.out.println("Password should have more than 6 characters");
		}
		
	}else {
		System.out.println("Password cannot be empty");
}
}
//get password
public String getPassword() {
	return password;
}
}

public class Registration {
public static void main(String[] args) {
	
	RegistrationClass obj = new RegistrationClass();
	obj.setUsername("John12345");
	System.out.println(obj.getUserName());
	
}
}

