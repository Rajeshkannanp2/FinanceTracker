package com.example.practicesecurity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practicesecurity.entity.Budget;
import com.example.practicesecurity.entity.Expense;
import com.example.practicesecurity.entity.Income;
import com.example.practicesecurity.service.BudgetService;
import com.example.practicesecurity.service.ExpenseService;
import com.example.practicesecurity.service.IncomeService;

@RestController
@RequestMapping("/api")
public class FinanaceController {
	@Autowired
    private ExpenseService expenseService;

    @Autowired
    private IncomeService incomeService;

    @Autowired
    private BudgetService budgetService;

    @PostMapping("/expenses")
    public ResponseEntity<Expense> recordExpense(@RequestBody Expense expense) {
        return ResponseEntity.ok(expenseService.saveExpense(expense));
    }

    @PutMapping("/expenses/{expenseId}")
    public ResponseEntity<Expense> updateExpense(@PathVariable Long expenseId, @RequestBody Expense expense) {
        Optional<Expense> updatedExpense = expenseService.updateExpense(expenseId, expense);
        return updatedExpense.map(ResponseEntity::ok)
                             .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/expenses/{expenseId}")
    public ResponseEntity<Void> deleteExpense(@PathVariable Long expenseId) {
        expenseService.deleteExpense(expenseId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/incomes")
    public ResponseEntity<Income> recordIncome(@RequestBody Income income) {
        return ResponseEntity.ok(incomeService.saveIncome(income));
    }

    @PostMapping("/budgets")
    public ResponseEntity<Budget> setupBudget(@RequestBody Budget budget) {
        return ResponseEntity.ok(budgetService.saveBudget(budget));
    }

    @GetMapping("/budgets")
    public ResponseEntity<List<Budget>> getAllBudgets() {
        return ResponseEntity.ok(budgetService.getAllBudgets());
    }

    @GetMapping("/reports")
    public ResponseEntity<String> generateReport() {
        // Implement the logic to generate a financial report
        return ResponseEntity.ok("Report generated");
    }

    @GetMapping("/books")
    public ResponseEntity<String> getAllBooks() {
        // Implement the logic to retrieve all books with filters
        return ResponseEntity.ok("Books retrieved");
    }
}
