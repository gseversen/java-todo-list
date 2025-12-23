package todoList;

public class task {
	String name;
	boolean completed;
	String info;
	
	public task()
	{
		name = null;
		completed = false;
		info = null;
	}
	
	public task(String label, boolean done, String description)
	{
		this.name = label;
		this.completed = done;
		this.info = description;
	}
}//end of class task
