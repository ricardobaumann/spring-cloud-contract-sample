package com.github.ricardobaumann.springcloudcontractsample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")
    fun testIt(@RequestParam name: String) = "we got you, $name"

}