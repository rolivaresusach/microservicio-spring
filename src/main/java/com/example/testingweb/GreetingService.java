package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	/**
	 *
	 */
	private static final String OUTPUT_MESSAGE = "Finaliza el curso DevOps Foundation v2 - Rodrigo Olivares";

	public String greet() {
		return OUTPUT_MESSAGE;
	}
}
