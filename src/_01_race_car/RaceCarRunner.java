package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		RaceCar RaceCar = new RaceCar("BELTER",5,true);// 1. Create a RaceCar and place it in 5th position
	
		System.out.println(5);// 2. Print the RaceCar's position in the race

		RaceCar.crash();// 3. Crash the RaceCar
		
		RaceCar.pit();
		
		RaceCar.overtake();
		RaceCar.overtake();
		RaceCar.overtake();
		RaceCar.overtake();
		RaceCar.overtake();
		RaceCar.overtake();
		RaceCar.overtake();
		// 4. If the car is damaged. Bring it in for a pit stop.
		
		// 5. Help the car move into first place.

	}
}
