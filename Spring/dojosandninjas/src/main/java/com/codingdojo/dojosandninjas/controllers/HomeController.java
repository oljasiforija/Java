package com.codingdojo.dojosandninjas.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.DojoService;
import com.codingdojo.dojosandninjas.services.NinjaService;

@Controller
public class HomeController {
	private final NinjaService ninjaService;
	private final DojoService dojoService;
	
	public HomeController(NinjaService ninjaService, DojoService dojoService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	@RequestMapping("/")
	public String index(Model model) {
		List<Ninja> allNinjas = ninjaService.allNinjas();
		model.addAttribute("ninjas",allNinjas);
		model.addAttribute("dojos", dojoService.allDojos());
		model.addAttribute("ninja", new Ninja());
		return "index.jsp";
	}
	@RequestMapping(value="/ninja/create",method = RequestMethod.POST)
	public String create( @ModelAttribute("ninja") Ninja ninja, Model model) {
			ninjaService.createNinja(ninja);
			return "redirect:/";
	}
	
	@RequestMapping(value="/dojos/new")
	public String newDojo(Model model) {
		model.addAttribute("dojo", new Dojo());
		return "newDojo.jsp";
	}
	@RequestMapping(value="/dojos/create",method=RequestMethod.POST)
	public String createDojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
		dojoService.createDojo(dojo);
		return "redirect:/";
	}
	@RequestMapping(value="/dojo/{id}")
	public String singleDojo(@PathVariable("id")Long id,Model model) {
		model.addAttribute("dojo",dojoService.singleDojo(id));
		return "singleDojo.jsp";
	}
	
	
	
	
}

