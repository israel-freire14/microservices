package com.freiredev.hr_user

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class HrUserApplication

fun main(args: Array<String>) {
	runApplication<HrUserApplication>(*args)
}
