package com.example.practicesecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practicesecurity.entity.Expense;
import com.example.practicesecurity.repository.ExpenseRepository;

@Service
public class ExpenseService {
	@Autowired
    private ExpenseRepository expenseRepository;

    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public Optional<Expense> updateExpense(Long id, Expense expense) {
        if (expenseRepository.existsById(id)) {
            expense.setId(id);
            return Optional.of(expenseRepository.save(expense));
        } else {
            return Optional.empty();
        }
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}
