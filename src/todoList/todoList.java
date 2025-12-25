package todoList;

import java.util.ArrayList;
import java.util.Scanner;

public class todoList {

	//variables and data structure
	static ArrayList<task> list = new ArrayList<task>();
	static Scanner stdIn = new Scanner(System.in);
	public static final int MIN_MENU_CHOICE = 1;
	public static final int MAX_MENU_CHOICE = 4;

	public static void main (String []args)
	{	
		//loop to start list
		while(true) {
			int response = 0;
			//list prompt
			System.out.println("----------------------------");
			System.out.println("Select a choice");
			System.out.println("1. Add Task\n2. Change Task\n3. Mark as completed\n4. Show all tasks");
			System.out.println("----------------------------");
			
			//user input
			response = getMenuChoice(stdIn, MIN_MENU_CHOICE, MAX_MENU_CHOICE);
			System.out.println(response);
			
			//option 1
			if(response == 1)
			{
				System.out.print("Name of task to add: ");
				String name = stdIn.nextLine();
				
				System.out.print("Description of task: ");
				String details = stdIn.nextLine();
				
				task newTask = new task(name, details);
				list.add(newTask);
				
			}
			
			
		}
	}//end of main
	
	/**
	 * Reads and validates a numeric menu choice from the user.
	 * <p>
	 * This method repeatedly prompts for input until the user enters
	 * an integer value within the specified inclusive range.
	 * Non-integer input is safely discarded without throwing an exception.
	 * @param in  the Scanner used to read user input
	 * @param min the minimum valid menu option (inclusive)
	 * @param max the maximum valid menu option (inclusive)
	 * @return a valid integer choice between {@code min} and {@code max}
	 */
	public static int getMenuChoice(Scanner in, int min, int max){
		while (true) {
			//if not an int value
	        if (!in.hasNextInt()) {
	            in.nextLine();
	            System.out.print("Choose a number listed.");
	            continue;
	        }
	        int val = in.nextInt();
	        in.nextLine();
	        if (val >= min && val <= max) return val;
		}
	}//end of getMenuChoice
	
}//end of class