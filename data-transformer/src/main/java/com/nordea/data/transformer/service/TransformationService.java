package com.nordea.data.transformer.service;

import com.nordea.data.transformer.external.rest.ExternalThirdPartyService;
import com.nordea.data.transformer.external.rest.StatementProcessorService;
import com.nordea.statement.processor.dto.AccountStatementDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class TransformationService {

    private ExternalThirdPartyService externalThirdPartyService;
    private StatementProcessorService statementProcessorService;

    public String transform(String accountId) {
        externalThirdPartyService.fetchAccountStatement(accountId);
        // Transform/Parse fields here
        //      From            -->      TO
        // ResponseStatementDTO --> AccountStatementDTO
        AccountStatementDTO accountStatementDTO = new AccountStatementDTO();
        statementProcessorService.postStatement(accountStatementDTO);
        return "OK";
    }
}
