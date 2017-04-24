/**
 * 
 */
package spittr.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import spittr.dao.SpittrRepository;

/**
 * @author SR4PXM
 *
 */
public class SpittleControllerTest {
	
	private SpittrRepository spitttRepository;

	/**
	 * Test method for {@link spittr.web.SpittleController#register(org.springframework.ui.Model)}.
	 */
	@Test
	public final void testRegister() {
		SpittleController controller = new SpittleController(this.spitttRepository);
		MockMvc mvc = standaloneSetup (controller).build();
		//mvc.perform(get("/spitter/register").andExpect(view().name("registerForm")));
	}

	/**
	 * @param spitttRepository the spitttRepository to set
	 */
	@Autowired
	public void setSpitttRepository(SpittrRepository spitttRepository) {
		this.spitttRepository = spitttRepository;
	}

}
