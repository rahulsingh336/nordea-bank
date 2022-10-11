package com.nordea.statement.processor.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AccountStatementDTO {

    private String accountId;
    private String statementId;
    private String accountName;
    private StatementType statementType;
    private List<Transaction> transactionList = new ArrayList<>();

}
