package com.freiredev.hrworker.controllers

import com.freiredev.hrworker.services.WorkerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class AbstractController {

    @Autowired
    lateinit var workerService: WorkerService
}