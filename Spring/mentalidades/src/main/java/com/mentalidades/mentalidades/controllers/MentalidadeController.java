package com.mentalidades.mentalidades.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidades")
public class MentalidadeController {

	@GetMapping
	public String mentalidades() {
		
		return "Orientação ao futuro, persistência";
	}
}
