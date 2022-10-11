package com.example.thirdparty.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Transaction
 */
@Data
public class Transaction {

  @JsonProperty("Amount")
  private Amount amount;

  @JsonProperty("CreditDebitIndicator")
  private String creditDebitIndicator;

  @JsonProperty("CreditDebitDate")
  private String creditDebitDate;

  @JsonProperty("CreditDebitDescription")
  private String creditDebitDescription;

  @JsonProperty("Type")
  private String type;

}

