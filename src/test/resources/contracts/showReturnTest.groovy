import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return test"
    request {
        method GET()
        url("/test") {
            queryParameters {
                parameter("name", "john doe")
            }
        }
    }
    response {
        body("we got you, john doe")
        status 200
    }
}