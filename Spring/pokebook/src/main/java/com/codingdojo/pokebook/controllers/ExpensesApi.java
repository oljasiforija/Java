package com.codingdojo.pokebook.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.pokebook.models.Expense;
import com.codingdojo.pokebook.services.ExpenseService;

@RestController
public class ExpensesApi {
	private final ExpenseService expenseService;
	public ExpensesApi(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	@RequestMapping(value="/api/expenses")
	public List<Expense>index (){
		return expenseService.allExpenses();
	}
	@RequestMapping(value="/api/expenses/create",method=RequestMethod.POST)
	public Expense create(Expense e) {
		return expenseService.createExpense(e);
	}
	
	@RequestMapping(value="/api/expenses/{id}")
	public Expense singleExpense(@PathVariable("id")Long id) {
		return expenseService.singleExpense(id);
	}
	@RequestMapping(value="/api/expenses/update/{id}",method=RequestMethod.PUT)
	public Expense update(
			@PathVariable("id")Long id,
			@RequestParam(value="expenseName")String expenseName,
			@RequestParam(value="vendor")String vendor,
			@RequestParam(value="amount")Integer amount,
			@RequestParam(value="description")String description) {
		Expense expenses = expenseService.updateExpense(id, expenseName, vendor, amount, description);
		return expenses;
	}
	@RequestMapping(value="/api/expenses/delete/{id}",method=RequestMethod.DELETE)
	public void destroy(@PathVariable("id")Long id) {
		expenseService.deleteExpense(id);
	}

}
