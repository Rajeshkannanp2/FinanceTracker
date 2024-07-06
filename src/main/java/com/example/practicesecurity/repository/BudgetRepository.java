package com.example.practicesecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practicesecurity.entity.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long> {

}
