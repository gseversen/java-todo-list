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
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public void setStatus(boolean status)
	{
		this.completed = status;
	}
	
	public void setDetails(String detail)
	{
		this.info = detail;
	}
}//end of class task
