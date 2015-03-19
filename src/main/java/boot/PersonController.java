package boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PersonController {
	
	@RequestMapping(value = "/person")
	public String getPerson(Model model){
		model.addAttribute("name", "Ditt navn");
		model.addAttribute("age", "Din alder");
		model.addAttribute("food", "Din favorittmat");
		
		return "page";
	}

}
