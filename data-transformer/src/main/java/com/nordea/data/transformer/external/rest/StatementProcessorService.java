package com.nordea.data.transformer.external.rest;

import com.nordea.statement.processor.dto.AccountStatementDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@AllArgsConstructor
public class StatementProcessorService {

    private final RestTemplate restTemplate;

    public String postStatement(AccountStatementDTO accountStatementDTO){
        // post to external endpoint
        return "OK";
    }
}
