package com.example.thirdparty.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Amount
 */

@Data
public class Amount {

  @JsonProperty("Amount")
  private Long amount;

  @JsonProperty("Currency")
  private String currency;

}

