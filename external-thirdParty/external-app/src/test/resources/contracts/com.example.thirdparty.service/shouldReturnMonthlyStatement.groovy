package com.example.thirdparty.service

import org.springframework.cloud.contract.spec.Contract

    Contract.make {
        description "should return monthly statement for valid input account number"
        request {
            method GET()
            url("/accounts/336/statements") {
            }
        }
        response {
            body("{\n" +
                    "  \"transactions\" : [ {\n" +
                    "    \"amount\" : {\n" +
                    "      \"amount\" : \"336\",\n" +
                    "      \"currency\" : \"INR\"\n" +
                    "    },\n" +
                    "    \"creditDebitIndicator\" : \"CREDIT\",\n" +
                    "    \"creditDebitDate\" : \"2022-10-12\",\n" +
                    "    \"creditDebitDescription\" : \"Mock Transaction\",\n" +
                    "    \"closingBalance\" : \"336336\"\n" +
                    "  } ]\n" +
                    "}")
            status 200
            headers {
                contentType(applicationJson())
            }
        }

    }