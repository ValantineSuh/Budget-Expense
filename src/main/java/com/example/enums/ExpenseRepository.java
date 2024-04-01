package com.example.enums;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExpenseRepository {
    private static final String CSV_FILE = "expenses.csv";

    public void saveExpense(Expense expense) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CSV_FILE, true))) {
            writer.println(expense.getDate() + "," + expense.getDescription() + "," + expense.getAmount());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Expense> getAllExpenses() {
        List<Expense> expenses = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String date = parts[0];
                String description = parts[1];
                double amount = Double.parseDouble(parts[2]);
                expenses.add(new Expense(date, description, amount));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return expenses;
    }
}
