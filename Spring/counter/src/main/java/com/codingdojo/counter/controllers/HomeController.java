package com.codingdojo.counter.controllers;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/your_server")
	public String index(HttpSession session) {
		int increment = (int)session.getAttribute("count");
		increment++;
		session.setAttribute("count", increment);
		return "index.jsp";
	}
	
	@RequestMapping("/your_server/count")
	public String showCount(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("countToShow",currentCount);
		return "showCount.jsp";
	}
	
	

}
