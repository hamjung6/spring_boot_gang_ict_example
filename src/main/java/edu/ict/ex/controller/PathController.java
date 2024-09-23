package edu.ict.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PathController {

	@GetMapping("/path")
	public String shop(Model model) {
		
		return "path/path";
	}
	
	@GetMapping("/path/img")
	public String pathImg(Model model) {
		
		return "path/path";
	}
}
