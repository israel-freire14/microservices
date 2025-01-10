package com.freiredev.hrworker.controllers

import com.freiredev.hrworker.services.WorkerService
import lombok.extern.slf4j.Slf4j
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.stereotype.Component

@Component
class AbstractController {

    @Autowired
    lateinit var env: Environment

    var logger: Logger = LoggerFactory.getLogger(AbstractController::class.java)

    @Autowired
    lateinit var workerService: WorkerService

}