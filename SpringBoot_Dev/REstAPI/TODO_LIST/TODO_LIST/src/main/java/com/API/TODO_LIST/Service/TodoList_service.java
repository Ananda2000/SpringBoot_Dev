package com.API.TODO_LIST.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.API.TODO_LIST.Model.Todo_list;

//@Service
public interface TodoList_service 
{
	
	public List<Todo_list> getAll_TodoList();
	public int Add_todolist(Todo_list todo_list_addStudent);
	public int Delete_todolist(String name);
	public int update_todolist(Todo_list todolist_update);
	public List<Todo_list> getSingleREcord(String workname);
	public int patch_update(String workname);
	public List<Todo_list> get_similar_statuscodes_Data(String Status_code);
	
	

}
