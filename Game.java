package teamProject;

import java.util.Scanner;
import java.util.Random;
public class Game {

	public static void main(String[] args) {
		String name;
		int gpa, health, choice;
		String places[] = {"Library", "Bookstore", "Commons"};
		
		health = 100;
		choice = 0;
		
		if(health > 100)
			health = 100;
		
		Scanner nameInput = new Scanner(System.in);
		
        System.out.println("Welcome to UMBC!");
        System.out.println("------------------------------------");
        System.out.print("Enter Your name: ");
		
		name = nameInput.nextLine();
		
		System.out.println("Hey " + name + "! Your first stop is the dorms where you'll be living for the semester. Whats the first thing you do?");
		System.out.println("Remember, everything you choose to do effects your health and grades!");
        System.out.println("------------------------------------");		
		System.out.println("1 for sleep. 2 for eat. 3 for collect supplied for class.");
		
		Scanner choiceInput = new Scanner(System.in);
		choice = choiceInput.nextInt();

		if (choice == 1)
			System.out.println("You chose to sleep.");
		if (choice == 2)
			System.out.println("You chose to eat some...");
		if (choice == 3)
			System.out.println("You chose to go to the (library/bookstore/commons for...)");

	}

}
