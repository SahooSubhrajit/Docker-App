package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	public WelcomeRestController() {
		logger.info("***** WelcomeRestController::Constructor *****");
	}

	@GetMapping(value = "/welcome/{name}")
	public String welcomeMsg(@PathVariable("name") String name) {
		if(name.equals("kaibalya")) {
			String fname1 = name+" Will you marry to XYZ";
			return fname1;
		}
		
		String fname = name+" WelCome to Citiustech";
		return fname;
	}

	
}
