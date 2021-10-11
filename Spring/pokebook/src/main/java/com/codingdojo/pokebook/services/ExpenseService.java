package com.codingdojo.pokebook.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.pokebook.models.Expense;
import com.codingdojo.pokebook.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
	public List<Expense> allExpenses() {
		return expenseRepository.findAll();
		}
	
	public Expense createExpense(Expense expense) {
		return expenseRepository.save(expense);
	}
	
	public Expense singleExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		}
		else {
			return null;
		}
	}
	
	public Expense updateExpense(Long id, String expenseName, String vendor, Integer amount, String description) {
		Optional <Expense> optionalExpense = expenseRepository.findById(id);
		if(optionalExpense.isPresent()) {
			Expense expense = optionalExpense.get();
			expense.setExpenseName(expenseName);
			expense.setVendor(vendor);
			expense.setAmount(amount);
			expense.setDescription(description);
			return expenseRepository.save(expense);
		}
		else {
			return null;
		}
	}
	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}

}
