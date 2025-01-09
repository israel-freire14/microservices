package com.freiredev.hr_payroll.feignClients

import com.freiredev.hr_payroll.entities.Worker
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import java.util.Optional

@Component
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")
interface WorkerFeignClient {

    @GetMapping("/{id}")
    fun findWorkerById (@PathVariable id: Long): Optional<Worker>


}