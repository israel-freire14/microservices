package com.freiredev.hr_payroll.controllers

import com.freiredev.hr_payroll.services.PaymentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class AbstractController {

    @Autowired
    lateinit var paymentService: PaymentService

    @Autowired
    lateinit var restTemplate: RestTemplate

    @Value("{hr-worker.host}")
    lateinit var workerHost: String
}