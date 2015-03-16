package boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PersonController {
	
	@RequestMapping("/")
	@ResponseBody
	public String getPerson(){
		return "En person";
	}

}
