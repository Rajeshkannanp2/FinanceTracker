# Personal Finance Tracker

## Introduction

This is a Spring Boot-based RESTful API service for a basic Personal Finance Tracker. The application allows users to record expenses and incomes, generate financial reports, set up budgets, and retrieve books with filters for searching.

## Features

1. Record a new expense.
2. Update an existing expense.
3. Delete an expense.
4. Record a new income.
5. Generate a financial report.
6. Set up a new budget.
7. Retrieve all budgets.
8. Retrieve all books with filters for searching.

## Technologies Used

- Java 17
- Spring Boot
- Hibernate
- Maven

## Prerequisites

- Java 8
- Maven

### Clone the Repository

[git clone https://github.com/yourusername/personal-finance-tracker.git](https://github.com/Rajeshkannanp2/FinanceTracker.git)
cd personal-finance-tracker

API Endpoints
Expenses
POST /api/expenses - Record a new expense.
PUT /api/expenses/{expenseId} - Update an existing expense.
DELETE /api/expenses/{expenseId} - Delete an expense.
Incomes
POST /api/incomes - Record a new income.
Reports
GET /api/reports - Generate a financial report.
Budgets
POST /api/budgets - Set up a new budget.
GET /api/budgets - Retrieve all budget
