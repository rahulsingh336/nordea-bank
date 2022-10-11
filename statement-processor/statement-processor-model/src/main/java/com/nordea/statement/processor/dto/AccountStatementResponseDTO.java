package com.nordea.statement.processor.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountStatementResponseDTO {

    private ProcessedResponseStatus status;
}
