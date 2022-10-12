package com.example.thirdparty.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Transaction
 */
@Data
public class Transaction {

  @JsonProperty("amount")
  private Amount amount;

  @JsonProperty("creditDebitIndicator")
  private String creditDebitIndicator;

  @JsonProperty("creditDebitDate")
  private String creditDebitDate;

  @JsonProperty("creditDebitDescription")
  private String creditDebitDescription;

  @JsonProperty("closingBalance")
  private String closingBalance;

}

