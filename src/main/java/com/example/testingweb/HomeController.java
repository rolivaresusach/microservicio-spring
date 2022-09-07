package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	/**
	 *
	 */
	private static final String OUTPUT_MESSAGE = "Finaliza el curso DevOps Foundation v2 - Rodrigo Olivares";

	@GetMapping("/")
	public @ResponseBody String greeting() {
		return OUTPUT_MESSAGE;
	}

}
