package com.example.thirdparty.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Statement
 */

@Data
public class Statement {

  @JsonProperty("transactions")
  private List<Transaction> transaction = new ArrayList<>();

}

