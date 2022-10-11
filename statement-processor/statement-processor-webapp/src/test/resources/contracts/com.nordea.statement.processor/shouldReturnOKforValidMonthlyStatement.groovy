package contracts

import org.springframework.cloud.contract.spec.Contract

    Contract.make {
        description "should return OK for valid input"
        request {
            method GET()
            url("/process") {
            }
        }
        response {
            body("{status: OK}")
            status 200
        }

    }