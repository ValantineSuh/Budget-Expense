package com.example.enums;

import lombok.Getter;
import java.util.List;

@Getter
public enum ViewExpense {
    INSTANCE;

    private ViewExpense() {}

    public void execute(List<Expense> expenses) {
        if (expenses.isEmpty()) {
            System.out.println("No expenses to display.");
        } else {
            System.out.println("Expenses: ");
            for (Expense expense : expenses) {
                System.out.println(expense );
            }
        }
    }
}
