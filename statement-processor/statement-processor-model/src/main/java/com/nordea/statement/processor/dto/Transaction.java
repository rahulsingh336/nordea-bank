package com.nordea.statement.processor.dto;

import lombok.Data;

@Data
public class Transaction {

    private String transactionType;
    private String transactionAmount;

}
