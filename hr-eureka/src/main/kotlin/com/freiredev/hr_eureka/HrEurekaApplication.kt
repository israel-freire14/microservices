package com.freiredev.hr_eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class HrEurekaApplication

fun main(args: Array<String>) {
	runApplication<HrEurekaApplication>(*args)
}
