package de.itemis.customer;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import de.itemis.customer.controller.CustomerController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {FontendApplication.class}, webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class FrontendTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldOpenWelcomePage() throws Exception {
		this.mockMvc.perform(get(CustomerController.ROOT_PAGE)).andExpect(status().isOk());
	}
}
