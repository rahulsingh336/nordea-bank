package com.example.thirdparty.service

import org.springframework.cloud.contract.spec.Contract

    Contract.make {
        description "should return monthly statement for valid input account number"
        request {
            method GET()
            url("/accounts/336/statements") {
                queryParameters {
                    parameter("number", "2")
                }
            }
        }
        response {
            body("{}")
            status 200
        }

    }