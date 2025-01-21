package com.freiredev.hr_config_server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HrConfigServerApplication

fun main(args: Array<String>) {
	runApplication<HrConfigServerApplication>(*args)
}
