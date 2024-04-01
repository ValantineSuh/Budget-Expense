package com.example;

import com.example.enums.Expense;
import com.example.enums.ExpenseRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExpenseRepository expenseRepository = new ExpenseRepository();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter writer = new PrintWriter(System.out, true)) {

            while (true) {
                writer.println("""

                Welcome to the Expense Tracker!

                Expense Tracker Menu
                ---------------------
                1. Add Expense
                2. View Expenses
                3. Exit

                Enter your choice
                """);
                int choice = 0;
                try {
                    choice = Integer.parseInt(reader.readLine());
                } catch (NumberFormatException e) {
                    writer.println("Invalid input. Please enter a valid number from the menu; 1, 2 or 3");
                    continue; // Skip the rest of the loop iteration
                }
                switch (choice) {
                    case 1:
                        addExpense(reader, writer, expenseRepository);
                        break;
                    case 2:
                        viewExpenses(writer, expenseRepository);
                        break;
                    case 3:
                        writer.println("""

                            Thank you, for using our Expense Tracker
                            Goodbye!
                            """);
                        return;
                    default:
                        writer.println("Invalid choice. Please select from the menu range of 1 to 3.");
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        }
    }

    private static void addExpense(BufferedReader reader, PrintWriter writer, ExpenseRepository expenseRepository) throws IOException {
        writer.println("Enter expense date (DD-MM-YYYY): ");
        String date = reader.readLine();

        writer.println("Enter expense description: ");
        String description = reader.readLine();

        double amount = 0;
        boolean validAmount = false;
        while (!validAmount) {
            try {
                writer.println("Enter expense amount (frs): ");
                amount = Double.parseDouble(reader.readLine());
                validAmount = true;
            } catch (NumberFormatException e) {
                writer.println("Invalid input. Please enter a valid amount (numeric value).");
            }
        }

        Expense expense = new Expense(date, description, amount);
        expenseRepository.saveExpense(expense);
        writer.println("Expense added successfully!");
    }

    private static void viewExpenses(PrintWriter writer, ExpenseRepository expenseRepository) {
        List<Expense> expenses = expenseRepository.getAllExpenses();
        if (expenses.isEmpty()) {
            writer.println("No expenses to display.");
        } else {
            writer.println("Expenses:");
            for (Expense expense : expenses) {
                writer.println(expense);
            }
        }
    }
}
