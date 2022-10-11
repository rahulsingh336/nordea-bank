package com.nordea.data.transformer.external.rest;

import com.nordea.statement.processor.dto.AccountStatementDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StatementProcessorService {

    public String postStatement(AccountStatementDTO accountStatementDTO){
        // post to external endpoint
        return "OK";
    }
}
