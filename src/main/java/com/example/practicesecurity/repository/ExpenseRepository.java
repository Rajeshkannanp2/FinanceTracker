package com.example.practicesecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practicesecurity.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	
}
