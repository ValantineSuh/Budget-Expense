package com.example.enums;

import lombok.Getter;

@Getter
public enum AddExpense {
    INSTANCE;

    private AddExpense() {}

    public void execute(Expense expense) {
        // Your code for adding expenses goes here
        System.out.println("Executing AddExpense...");
        System.out.println("Added Expense: " + expense);
    }
}
