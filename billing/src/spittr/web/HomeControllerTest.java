/**
 * 
 */
package spittr.web;

import static org.junit.Assert.*;
import static
org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static
org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static
org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.ResultActions;

/**
 * @author SR4PXM
 *
 */
public class HomeControllerTest {

	@Test
	public void testHomePage() throws Exception {
		HomeController controller = new HomeController();
		MockMvc mockMvc = standaloneSetup(controller).build();
		//mockMvc.perform(get("/").and(view().name("home")));
		mockMvc.perform( get("/")).andExpect(view().name("home"));
	}

}
