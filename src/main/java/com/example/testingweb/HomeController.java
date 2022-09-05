package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	/**
	 *
	 */
	private static final String OUTPUT_MESSAGE = "Finaliza el curso DevOps Foundation v2 - Rodrigo Olivares";

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public @ResponseBody String greeting() {
		return OUTPUT_MESSAGE;
	}

}
