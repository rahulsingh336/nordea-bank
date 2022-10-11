package com.nordea.statement.processor.controller;

import com.nordea.statement.processor.dto.AccountStatementDTO;
import com.nordea.statement.processor.dto.AccountStatementResponseDTO;
import com.nordea.statement.processor.dto.ProcessedResponseStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StatementProcessorController {

    @PostMapping("process")
    public AccountStatementResponseDTO processStatement(@RequestBody @Nullable AccountStatementDTO accountStatementDTO) {
        //1. validate Input
        //2. pass to service layer for further processing
        //log.info("Successfully processed account statement ::::: {}", accountStatementDTO.getStatementId());
        return AccountStatementResponseDTO.builder().status(ProcessedResponseStatus.OK).build();
    }
}
