package com.nordea.data.transformer.controller;

import com.nordea.data.transformer.dto.TransformerResponseDto;
import com.nordea.data.transformer.service.TransformationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class TransformationController {

    private TransformationService transformationService;

    @GetMapping("accounts/{accountId}/statements/{frequency}")
    public TransformerResponseDto postMonthlyStatement(@PathVariable String accountId, @PathVariable String frequency){
        //validate account id/number
        transformationService.transform(accountId, frequency);
        return  new TransformerResponseDto("OK");
    }
}
