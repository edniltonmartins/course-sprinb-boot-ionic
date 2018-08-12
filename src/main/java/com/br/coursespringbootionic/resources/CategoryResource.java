package com.br.coursespringbootionic.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="categories")
public class CategoryResource {
	
	@GetMapping
	public String testInit() {
		return "Ok";
	}

}
