package com.nordea.data.transformer.external.rest;

import com.example.thirdparty.service.dto.ResponseStatementDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
@AllArgsConstructor
public class ExternalThirdPartyService {

    private final RestTemplate restTemplate;

    public ResponseStatementDTO fetchAccountStatement(String id, String startDate, String accountId){
        //external call to third party service
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<ResponseStatementDTO> response = this.restTemplate.exchange(
                RequestEntity
                        .get("http://localhost:8090/accounts/336/statements", accountId)
                        .headers(headers)
                        .build()
                        , ResponseStatementDTO.class);
        return response.getBody();
    }

}
