package com.API.TODO_LIST.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.API.TODO_LIST.Model.Todo_list;
import com.API.TODO_LIST.Repository.Todolist_repo_data;
import com.sun.org.apache.bcel.internal.generic.RETURN;

@Service
public class TodoList_service_implementation implements TodoList_service
{
	@Autowired
	Todolist_repo_data read_data;

	
// THIS METHOD DISPLAY ALL THE RECORDS PRESENT IN TODOLIST TABLE....
	@Override
	public List<Todo_list> getAll_TodoList() {
		List<Todo_list> aa= read_data.readAllrecords();
		
		for (Todo_list todo_list : aa) 
		{
			System.out.println(todo_list.getWorkName());
			System.out.println(todo_list.getStatus1());
			System.out.println("--------------------------------------");
		}
		return aa;
	}

// METHOD USED TO ADD/POST THE DATA INTO DATABASE....
	@Override
	public int Add_todolist(Todo_list todo_list_addStudent) {
		int data =read_data.creatingting_todo_list(todo_list_addStudent);
		return data;
	}

// METHOD USED TO DELETE A RECORD FROM DATA BASE USING @DELETEMAPPING...
	@Override
	public int Delete_todolist(String workname) {
		// TODO Auto-generated method stub
		int jj =read_data.Delete_record_tdlist(workname);
		return jj;
	}

	
// METHOD USED TO UPDATE THE RECORD IN TODO LIST...
	
	public int update_todolist(Todo_list todolist_update) {
		// TODO Auto-generated method stub
		return read_data.update_record(todolist_update);
		 
	}
// FETCH THE SINGLE RECORD..
	@Override
	public List<Todo_list> getSingleREcord(String workname) {
		return read_data.singleRecord(workname);
		
	}
	
// PATCH CALL TO UPDATE SINGLE RECORD...
	public int patch_update(String workname)
	{
		Todo_list zzz_tdlist = new Todo_list();
		int zzzz=0;
	List<Todo_list> kk= read_data.singleRecord(workname);
	if(kk.size() >0)
	{
	for (Todo_list todo_list1 : kk) 
	{
		zzz_tdlist.setStatus1("anand");
		zzz_tdlist.setWorkName(workname);
	}
/*	System.out.println("This is testing ----------------------------------");
		System.out.println(zzz_tdlist.getStatus1());
		System.out.println(zzz_tdlist.getWorkName());*/
	}
	if(zzz_tdlist !=null)
		{
			zzzz=read_data.partialUpdate(zzz_tdlist);
		}
		
		return zzzz;
	}

	
	@Override
	public List<Todo_list> get_similar_statuscodes_Data(String Status_code) {
		// TODO Auto-generated method stub
		return read_data.Similar_Status_Code_Data(Status_code);
	}

}
