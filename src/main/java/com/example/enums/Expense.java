package com.example.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString

public class Expense {

    private final String date;
    private final String description;
    private final double amount;

}

    

