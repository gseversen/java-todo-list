package todoList;

public class task {
	private String name;
	private boolean completed;
	private String info;
	
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
	
	public task(String label, String description)
	{
		this.name = label;
		this.info = description;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public boolean getStatus()
	{
		return this.completed;
	}
	
	public String getDetails()
	{
		return this.info;
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
	
	//set detail variable
	public void setDetails(String detail)
	{
		this.info = detail;
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



