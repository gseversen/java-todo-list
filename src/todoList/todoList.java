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
			
			//option 1
			if(response == 1)
			{
				addTask(stdIn);
			}
			//option 2
			else if(response == 2)
			{
				changeTaskName(stdIn);
			}
			//option 3
			else if(response == 3) 
			{
				markAsCompleted(stdIn);
			}
			else if(response == 4)
			{
				printList(list);
			}
			
			
		}//end of while loop
	}//end of main
	
	public static void printList(ArrayList<task> list)
	{
		for(task t : list)
		{
			System.out.println(t.toString());
		}
	}
	
	public static void markAsCompleted(Scanner in)
	{
		if (list.isEmpty()) {
	        System.out.println("No tasks to change.");
	        return;
	    }

	    System.out.print("Name of task to change: ");
	    String oldName = in.nextLine();

	    for (task t : list) {
	        if (t.getName().equals(oldName)) {

	            t.setStatus(true);
	            System.out.println("Task marked as complete " + t.getStatus());
	            return; // done
	        }
	    }

	    System.out.println("Task not found: " + oldName);
	}
	
	/**
	 * Reads a name from the user to add to the list
	 * <p>
	 * This method reads a name and description of a task
	 * to be added to the todo list.
	 * @param in Scanner used to read input
	 */
	public static void addTask(Scanner in) {
		System.out.print("Name of task to add: ");
		String name = stdIn.nextLine();
		
		task newTask = new task(name);
		list.add(newTask);
		System.out.println("Added: " + newTask.toString());
	}
	
	/**
	 * Reads a task name from the user to change in the list
	 * <p>
	 * This method prompts the user for a name of an existing task
	 * to change within the list. If there is nothing in the list or 
	 * it cannot find the name it will let the user know.
	 * @param in Scanner used to read input
	 */
	public static void changeTaskName(Scanner in) {
	    if (list.isEmpty()) {
	        System.out.println("No tasks to change.");
	        return;
	    }

	    System.out.print("Name of task to change: ");
	    String oldName = in.nextLine();

	    for (task t : list) {
	        if (t.getName().equals(oldName)) {

	            System.out.print("Enter new task name: ");
	            String newName = in.nextLine();

	            t.setName(newName);
	            System.out.println("Task renamed to: " + t.getName());
	            return; // done
	        }
	    }

	    System.out.println("Task not found: " + oldName);
	}
	
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
	        if (!(val >= min && val <= max)) {
	        	System.out.print("Choose a number listed");
	        }else {
	        	return val;
	        }
		}
	}//end of getMenuChoice
	
}//end of class