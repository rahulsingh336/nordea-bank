package com.nordea.statement.processor;

import com.nordea.statement.processor.controller.StatementProcessorController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@DirtiesContext
@AutoConfigureMessageVerifier
public class StatementProcessorBaseClass {

    @Before
    public void setUp() throws Exception {
        RestAssuredMockMvc.standaloneSetup(new StatementProcessorController());
    }
}
