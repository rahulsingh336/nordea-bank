package com.example.thirdparty.service.controller;

import com.example.thirdparty.service.dto.ResponseStatementDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(
            value = "/accounts/{accountId}/statements",
            produces = { "application/json" }
    )
    public ResponseStatementDTO getAccountStatement(@PathVariable String accountId){
        return new ResponseStatementDTO();
    }
}
