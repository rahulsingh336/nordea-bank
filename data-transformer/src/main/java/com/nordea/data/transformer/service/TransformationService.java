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

    public String transform(String accountId, String frequency) {
        //1. Assumtion is when monthly statement is requested
        //   the end day would be when statement is requested,
        //   start day = end day - 30
        // 2. Calculate start and end date accordingly and pass to external service
        String startDate = null;
        String endDate = null;
        externalThirdPartyService.fetchAccountStatement(accountId, startDate, endDate);
        // Transform/Parse fields here
        //      From            -->      TO
        // ResponseStatementDTO --> AccountStatementDTO
        AccountStatementDTO accountStatementDTO = new AccountStatementDTO();
        statementProcessorService.postStatement(accountStatementDTO);
        return "OK";
    }
}
