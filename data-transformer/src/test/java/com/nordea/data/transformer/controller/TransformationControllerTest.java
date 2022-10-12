package com.nordea.data.transformer.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
@AutoConfigureStubRunner(stubsMode= StubRunnerProperties.StubsMode.LOCAL, ids = {"com.example.thirdparty:external-app:+:stubs:8090",
                                                                                "com.nordea.statement:statement-processor-webapp:+:stubs:8091"})
@DirtiesContext
public class TransformationControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    TransformationController transformationController;

    @Test
    public void should_allow_to_play_when_score_is_above_500() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/accounts/{accountId}/statements/{frequency}", "336", "monthly")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{'status':'OK'}"));
    }



}
