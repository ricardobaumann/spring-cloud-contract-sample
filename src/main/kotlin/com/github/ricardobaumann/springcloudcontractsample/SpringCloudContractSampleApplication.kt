package com.github.ricardobaumann.springcloudcontractsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudContractSampleApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudContractSampleApplication>(*args)
}
