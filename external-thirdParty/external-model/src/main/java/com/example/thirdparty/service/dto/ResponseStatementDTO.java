package com.example.thirdparty.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseStatementDTO {

    @JsonProperty("Statement")
    private Statement statement;

}
