package com.saraya.app.controller;

import java.sql.Date;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.app.entity.PersonInfo;
import com.saraya.app.repositoy.PersonRepo;

@Controller
public class PersonController {
	@Autowired
	PersonRepo personRepo;
	
	@GetMapping("/")
	public String showPersons(ModelMap model) {
		model.addAttribute("persons", personRepo.findAll());
		return "index";
	}
	
	@PostMapping("/addPerson")
	public String addPerson(@RequestParam String date, @RequestParam String name,@RequestParam String sexe ) throws ParseException {
		
		personRepo.save(new PersonInfo(date, name, sexe));
		return "redirect:/";
	}
}
