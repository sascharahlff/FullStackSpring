package de.itemis.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	public static final String ROOT_PAGE = "/api/welcome";
	
	@GetMapping(ROOT_PAGE)
	public String welcome() {
		return "index";
	}
}
