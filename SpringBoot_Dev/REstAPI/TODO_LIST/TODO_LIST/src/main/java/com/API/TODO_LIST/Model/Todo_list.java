package com.API.TODO_LIST.Model;

public class Todo_list 
{
	private String workName;
	private String Status1;
	
	
	 public Todo_list()
	 {
		 super();
	 }
	 
	 public Todo_list(String workName, String Status)
	 {
		 this.workName = workName;
		 this.Status1 = Status;
	 }
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public String getStatus1() {
		return Status1;
	}

	public void setStatus1(String status1) {
		Status1 = status1;
	}
	
	
	//@Override
	/*public String toString()
	{
		return ("work Name--"+workName +"status--"+Status);
	}
*/
	
}
