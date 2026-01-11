package com.api.TODO_LIST_J_u_5_PRACTICE.Controller1_Test;

//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.awt.print.Printable;

import com.api.TODO_LIST_J_u_5_PRACTICE.Controller1.Hello_world_controller;

import ch.qos.logback.core.status.Status;
import jdk.javadoc.internal.doclets.toolkit.Content;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@WebMvcTest(Hello_world_controller.class)
public class Hello_world_controller_Test 
{
	@Autowired
	private MockMvc mockmvc;
	
	@Test
	public void testGetEndpoint() throws Exception
	{
		
		mockmvc.perform(get("/Helloworld/javaDev"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(status().is(200))
			.andExpect(content().string("Hello javaDev"));
	}
	

}
