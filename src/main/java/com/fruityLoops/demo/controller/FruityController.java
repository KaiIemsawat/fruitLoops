package com.fruityLoops.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fruityLoops.demo.model.Item;

@Controller
public class FruityController {
	
	@GetMapping("")
	public String index(Model m) {
		List<Item> fruits = new ArrayList<>();
		fruits.add(new Item("Kiwi", 1.5));
		fruits.add(new Item("Mango", 2.0));
		fruits.add(new Item("Goji Berries", 4.0));
		fruits.add(new Item("Guava", .75));
		
		m.addAttribute("fruits", fruits);
		return "index.jsp";
	}
	

	
}
