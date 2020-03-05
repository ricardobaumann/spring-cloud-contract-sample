package com.github.ricardobaumann.springcloudcontractsample

import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.web.servlet.setup.MockMvcBuilders

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@DirtiesContext
@AutoConfigureMessageVerifier
class SpringCloudContractSampleApplicationTests {

    @Autowired
    lateinit var testController: TestController

    @BeforeEach
    fun setup() {
        RestAssuredMockMvc.standaloneSetup(MockMvcBuilders.standaloneSetup(testController))
    }

    @Test
    fun contextLoads() {
    }

}
