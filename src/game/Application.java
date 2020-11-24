package game;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		final Scanner SCAN = new Scanner(System.in);
		
//		User field size declaration is not supported yet
		
//		System.out.println("How big do you want the court to be? Enter a number between 1 and 99");
//		int size = SCAN.nextInt();
		
		System.out.println("How many rounds do you wanna play? Enter a number between 1 and 99");
		int rounds = SCAN.nextInt();
		SCAN.close();

		System.out.println(" ====================== ");

		Field field = new Field();
		field.play(rounds);
			
	}
	
	
	
}
