package com.example.thirdparty.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseStatementDTO {

    @JsonProperty("statement")
    private Statement statement;

}
