package com.inter1.secondweek16_11_23;

import com.inter.secondweek16_11_23.Vehicle;
interface Benz{
	int value=20;//No, we can't change the value of an interface field because
			   //interface fields are final and static by default
	public void drive();
	public void harn();
	public void openDoor();//interface always contains abstract methods
}
 abstract class Audi implements Benz{ 
	 public void engine() {
		 System.out.println("engine is working");
	 }
	 public abstract void music();
 }
public class Car implements Benz
{
    
	@Override
	public void drive() {
		System.out.println("driver drive the car");
	}

	@Override
	public void harn() {
		System.out.println("while clicking the harn button");
	}

	@Override
	public void openDoor() {
		System.out.println("opening door");
	}
	public static void main(String[] args) {
		Benz car = new Car();
		car.drive();
		car.harn();
		car.openDoor();
		System.out.println(car.value);
		
		
		Audi  audi = new Audi() {
			
			@Override
			public void openDoor() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void harn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drive() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void music() {
				// TODO Auto-generated method stub
				
			}
		};
		audi.engine();
		audi.music();
	
	}
	
}

