package com.poornima.oms.controller.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.poornima.oms.controller.OrderController;

@RunWith(SpringRunner.class)
@WebMvcTest(OrderController.class)
public class OrderControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void getOrder() throws Exception
	{
		RequestBuilder req = MockMvcRequestBuilders
				.get("/order")
				.accept(MediaType.APPLICATION_JSON);
			MvcResult result = mockMvc.perform(req).andReturn();
			assertEquals("{\"id\":1,\"desc\":\"first\",\"amount\":20,\"isDispatched\":false,\"noOfBricks\":3}", result.getResponse().getContentAsString());
				
	}
	
}
