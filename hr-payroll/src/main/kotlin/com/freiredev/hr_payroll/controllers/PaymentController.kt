package com.freiredev.hr_payroll.controllers

import com.freiredev.hr_payroll.entities.Payment
import com.freiredev.hr_payroll.entities.Worker
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.HttpClientErrorException.NotFound
import kotlin.jvm.Throws

@RestController
@RequestMapping("/payments")
class PaymentController: AbstractController(){


    @GetMapping("/{workerId}/days/{days}")
    fun getPayment(@PathVariable workerId: Long, @PathVariable days: Int): Payment{
        return paymentService.getPayment(workerId, days)
    }


}