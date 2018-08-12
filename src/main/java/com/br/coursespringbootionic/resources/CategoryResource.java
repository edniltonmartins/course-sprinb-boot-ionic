package com.br.coursespringbootionic.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.coursespringbootionic.domain.Category;

@RestController
@RequestMapping(value = "categories")
public class CategoryResource {

	@GetMapping
	public List<Category> list() {
		Category category = new Category(1, "Test");
		Category category2 = new Category(2, "Dev");
		
		List<Category> categories = new ArrayList<Category>();
		
		categories.add(category);
		categories.add(category2);
		
		return categories;
	}

}
