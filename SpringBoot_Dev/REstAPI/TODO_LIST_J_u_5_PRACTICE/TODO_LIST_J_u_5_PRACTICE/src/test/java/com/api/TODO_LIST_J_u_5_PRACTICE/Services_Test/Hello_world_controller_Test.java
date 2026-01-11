package com.api.TODO_LIST_J_u_5_PRACTICE.Services_Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.data.jpa.repository.query.EqlParser.When_clauseContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import com.api.TODO_LIST_J_u_5_PRACTICE.Services.HelloWorld_Service;

@ExtendWith(MockitoExtension.class)
public class Hello_world_controller_Test 
{
	@Mock
	HelloWorld_Service hellowordl_service;

	@Test
	public void Test_HelloWorld_sercie_NameReturn()
	{
		String value ="This is anand";
		when(hellowordl_service.NameReturn("This is anand1")).thenReturn(value);
		String value1 =hellowordl_service.NameReturn(value);
		assertEquals("This is anand", value1);
		System.out.println("testing");
//verify(mock, mode)
	}
}
