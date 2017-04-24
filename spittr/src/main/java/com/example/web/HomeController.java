/**
 * 
 */
package com.example.web;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SR4PXM
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping(value="/",method=GET)
	public String home(){
		return "home";
	}

}
