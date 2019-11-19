package com.class21;

public class Forest {

	public static void main(String[] args) {
		
		Wolf wolf1=new Wolf();
		wolf1.name="Demon";
		wolf1.color="Black";
		wolf1.age=6;
		Wolf.numberOfWolves=1;
		wolf1.displayInfo();
		
		Wolf wolf2=new Wolf();
		wolf2.name="Snowflake";
		wolf2.color="Grey";
		wolf2.age=8;
		wolf2.numberOfWolves=2;
		wolf2.displayInfo();
		
		Wolf wolf3=new Wolf();
		wolf3.name="Alabai";
		wolf3.color="Dark blue";
		wolf3.age=7;
		wolf3.numberOfWolves=3;
		wolf3.displayInfo();
		
		System.out.println("Welcome to our forest!!!");
		System.out.println("Total number of wolves in the forest  :" +Wolf.numberOfWolves);
		System.out.println("First wolf is "+wolf1.color+" and his age is "+wolf1.age+" and his name is " + wolf1.name);
		System.out.println("Second wolf is "+wolf2.color+" and his age is "+wolf2.age+" and his name is " + wolf2.name);
		System.out.println("Third wolf is "+wolf3.color+" and his age is "+wolf3.age+" and his name is " + wolf3.name);	
					
		System.out.println("*********************************");
		Fox fox1=new Fox();
		fox1.color="Orange";
		fox1.speed=150;
		fox1.age=2;
		Fox.numberOfFoxes=1;
		
		
		Fox fox2=new Fox();
		fox2.color="Dark yellow";
		fox2.speed=200;
		fox2.age=3;
		Fox.numberOfFoxes=2;
		
		Fox fox3=new Fox();
		fox3.color="Black";
		fox3.speed=170;
		fox3.age=4;
		Fox.numberOfFoxes=3;
		
		System.out.println("Total number of foxes in the forest is :"+Fox.numberOfFoxes);
		System.out.println("First fox is "+fox1.color+" and his age is "+fox1.age+" his max speed is " + fox1.speed);
		System.out.println("Second fox is "+fox2.color+" and his age is "+fox2.age+" and his max speed is " + fox2.speed);
		System.out.println("Third fox is "+fox3.color+" and his age is "+fox3.age+" and his max speed is " + fox3.speed);
		System.out.println("**********************************");
		
		Bear bear1=new Bear();
		bear1.type="Polar bear";
		bear1.weight=500;
		Bear.numberOfBears=1;
		
		Bear bear2=new Bear();
		bear2.type="Brown bear";
		bear1.weight=450;
		Bear.numberOfBears=2;
		
		System.out.println("Total number of bears in the forest : "+ Bear.numberOfBears);
		System.out.println("First bear is "+bear1.type+" and his weight " + bear1.weight);
		System.out.println("Second bear is "+bear2.type+" and his weight " + bear2.weight);
		
		
		
		
				

		
	}

}
