package com.freiredev.hr_payroll.services

import com.freiredev.hr_payroll.entities.Payment
import com.freiredev.hr_payroll.entities.Worker
import com.freiredev.hr_payroll.feignClients.WorkerFeignClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class PaymentService {

    @Autowired
    lateinit var workerFeignClient: WorkerFeignClient

    fun getPayment (workerId: Long, days: Int): Payment{
        val worker: Worker = workerFeignClient.findWorkerById(workerId).get()
        return Payment(worker.name, worker.dailyIncome, days)
    }
}