package todoList;

public class task {
	private String name;
	private boolean completed;
	
	public task()
	{
		name = null;
		completed = false;
	}
	
	public task(String label, boolean done)
	{
		this.name = label;
		this.completed = done;
	}
	
	public task(String label)
	{
		this.name = label;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public boolean getStatus()
	{
		return this.completed;
	}
	
	//change task name
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	//mark task as done or not
	public void setStatus(boolean status)
	{
		this.completed = status;
	}
	
	public String toString() {
		String incomplete = "[ ] ";
		String complete = "[X] ";
		
		if(this.getStatus() == false)
		{
			return incomplete + this.getName();
		}
		else
		{
			return complete + this.getName();
		}
	}
}//end of class task



