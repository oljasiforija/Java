package com.codingdojo.pokebook.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.pokebook.models.Expense;
import com.codingdojo.pokebook.services.ExpenseService;

@Controller
public class HomeController {
	private final ExpenseService expenseService;
	public HomeController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Expense> allExpenses = expenseService.allExpenses();
		model.addAttribute("expenses",allExpenses);
		model.addAttribute("expense",new Expense());
		return "index.jsp";
	}
	@RequestMapping(value="/expenses/create",method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> allExpenses = expenseService.allExpenses();
			model.addAttribute("expenses",allExpenses);
			return "index.jsp";
		}
		else {
			expenseService.createExpense(expense);
			return "redirect:/";
		}
	}
	@RequestMapping(value="/edit/{id}")
	public String edit(@PathVariable("id")Long id, Model model) {
		Expense expense = expenseService.singleExpense(id);
		model.addAttribute("expense",expense);
		return "update.jsp";
	}
	@RequestMapping(value="/update/{id}",method = RequestMethod.PUT)
	public String update(@PathVariable("id")Long id, @Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "redirect:/";
		}
		else {
			expenseService.updateExpense(id, expense.getExpenseName(),expense.getVendor(),expense.getAmount(),expense.getDescription());
			return "redirect:/";
		}
	}
	@RequestMapping(value="/delete/{id}")
	public String destroy(@PathVariable("id")Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/";
	}
	@RequestMapping(value="/{id}")
	public String singleExpense(@PathVariable("id")Long id, Model model) {
		model.addAttribute("expense",expenseService.singleExpense(id));
		return "singleExpense.jsp";
		
	}
}
