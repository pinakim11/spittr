/**
 * 
 */
package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import javax.validation.Valid;

import spittr.dao.SpittrRepository;
import spittr.vo.Spitter;

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
    model.addAttribute("spitter", new Spitter());
		return "registrationForm";
	}
	
	@RequestMapping(value="/register", method=POST)
	public String register(@Valid Spitter spitter, Errors errors){
		
		if(errors.hasErrors()){
			return "registrationForm";
		}
		spitttRepository.save(spitter);
		return "redirect:/spittles/" + spitter.getUsername();
	}
	
	@RequestMapping(value="/{username}",method=GET)
	public String showSpitterProfile(@PathVariable String username, Model model){
		Spitter spitterUser = spitttRepository.findUser(username);
		model.addAttribute("spitter", spitterUser);
		return "profile";
	}
}
