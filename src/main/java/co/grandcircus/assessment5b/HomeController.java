package co.grandcircus.assessment5b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	private age a;

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("age-selection");
	}
	
	@RequestMapping("submit-age")
	public ModelAndView addAge(@RequestParam("age") int userAge) {
//		age newAge = new age(userAge);
		if (userAge < 400) {
			return new ModelAndView("sorry", "message", "Sorry, you're too young");
		}
		else if (userAge > 900) {
			return new ModelAndView("sorry", "message", "Sorry, you're too old" );
		} else {
			return new ModelAndView("spaceship-selection");
		}
	}
	
	@RequestMapping("spaceship")
	public ModelAndView toSpace(String id) {
		if (id == "bb") {
		return new ModelAndView("spaceship-display", "test", "rawr");
		} else {
			return new ModelAndView("spaceship-display");
		}
	}
	
//	@RequestMapping("age-selection")
//	public ModelAndView ageVerification() {
//		if (a.getAge() < 400) {
//			return new ModelAndView("sorry", "young", "Sorry, you're too young");
//		}
//		else if (a.getAge() > 900) {
//			return new ModelAndView("sorry", "old", "Sorry, you're too young" );
//		} else {
//			return new ModelAndView("spaceship-selection");
//		}
//	}
}
