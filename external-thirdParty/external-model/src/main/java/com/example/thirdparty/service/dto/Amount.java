package com.example.thirdparty.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Amount
 */

@Data
public class Amount {

  @JsonProperty("amount")
  private String amount;

  @JsonProperty("currency")
  private String currency;

}

