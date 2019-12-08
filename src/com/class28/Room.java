package com.class28;

public class Room extends Building {

	int roomNumber;
	
	Room(String adress, int floor,int roomNumber){
		super(adress,floor);
		this.roomNumber=roomNumber;
	}
	
	public void print() {
		System.out.println(adress+" "+floor+" "+roomNumber);
	}
	
	public static void main(String[] args) {
		
		Room room =
		new Room("121 Test Driver",10,101);
		room.print();
	}
}
