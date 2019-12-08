package com.class29;

public abstract class Building {
public void Demolish() {
	System.out.println("Demolishing house");
}
public void Paint() {
	System.out.println("Painting sealing");
}
public abstract void Close();
}
class Roofing extends Building{

	@Override
	public void Close() {
		// TODO Auto-generated method stub
		
	}
	
}