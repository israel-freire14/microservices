package com.freiredev.hr_payroll.controllers

import com.freiredev.hr_payroll.entities.Payment
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payments")
class PaymentController: AbstractController(){

    @CircuitBreaker(name = "PAYMENT", fallbackMethod = "getCachePayment")
    @GetMapping("/{workerId}/days/{days}")
    fun getPayment(@PathVariable workerId: Long, @PathVariable days: Int): ResponseEntity<Payment>{
        val payment:Payment = paymentService.getPayment(workerId, days)
        return ResponseEntity.ok(payment)
    }

    fun getCachePayment(workerId: Long, days: Int, e: Throwable): ResponseEntity<Payment>{
        val payment: Payment = Payment("Cezar", 400.0, days)
        return ResponseEntity.ok(payment)
    }
}
