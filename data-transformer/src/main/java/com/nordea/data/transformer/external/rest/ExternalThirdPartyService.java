package com.nordea.data.transformer.external.rest;

import com.example.thirdparty.service.dto.ResponseStatementDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ExternalThirdPartyService {

    public ResponseStatementDTO fetchAccountStatement(String accountId){
        //external call to third party service
        return new ResponseStatementDTO();
    }

}
