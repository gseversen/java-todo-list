package todoList;

import java.util.ArrayList;
import java.util.Scanner;

public class todoList {

	//variables and data structures
	static Scanner stdIn = new Scanner(System.in);
	ArrayList<task> list = new ArrayList<task>();
	
	public static void main (String []args)
	{	
		//loop to start list
		
			System.out.println("----------------------------");
			System.out.println("Select a choice");
			System.out.println("1. Add Task\n2. Change Task\n3. Mark as completed\n4. Show all tasks");
			System.out.println("----------------------------");

	}
	
}//end of class
