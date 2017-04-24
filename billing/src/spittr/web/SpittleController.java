/**
 * 
 */
package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import spittr.dao.SpittrRepository;

/**
 * @author SR4PXM
 *
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

	private SpittrRepository spitttRepository;

	/**
	 * @param spitttRepository
	 */
	@Autowired
	public SpittleController(SpittrRepository spitttRepository) {
		this.spitttRepository = spitttRepository;
	}
	
	@RequestMapping( method=GET)
	public String spittle(Model model){
		model.addAttribute(spitttRepository.findSpittr(Long.MAX_VALUE, 20));
		return "spittles";
	}
	
	@RequestMapping(value="/register", method=GET)
	public String register(Model model){
		return "registrationForm";
	}
	
	
}
