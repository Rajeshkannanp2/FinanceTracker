package com.example.practicesecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practicesecurity.entity.Income;

public interface IncomeRepository extends JpaRepository<Income, Long> {

}
