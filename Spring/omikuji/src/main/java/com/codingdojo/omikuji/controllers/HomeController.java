package com.codingdojo.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="action",method=RequestMethod.POST)
	public String create(@RequestParam(value="number")int number,
						@RequestParam(value="city")String city,
						@RequestParam(value="name")String name,
						@RequestParam(value="hobby")String hobby,
						@RequestParam(value="animal")String animal,
						@RequestParam(value="comment")String comment,
						HttpSession session, Model model) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby",hobby);
		session.setAttribute("animal", animal);
		session.setAttribute("comment", comment);
		
		return "redirect:/omikuji/show";
	}
	
	
	@RequestMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		model.addAttribute("number",session.getAttribute("number"));
		model.addAttribute("city",session.getAttribute("city"));
		model.addAttribute("name",session.getAttribute("name"));
		model.addAttribute("hobby",session.getAttribute("hobby"));
		model.addAttribute("animal",session.getAttribute("animal"));
		model.addAttribute("comment",session.getAttribute("comment"));
		
		
		return "show.jsp";
	}

}
