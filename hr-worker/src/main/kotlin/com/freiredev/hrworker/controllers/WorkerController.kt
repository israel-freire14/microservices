package com.freiredev.hrworker.controllers

import com.freiredev.hrworker.entities.Worker
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Optional

@RestController
@RequestMapping("/workers")
class WorkerController: AbstractController() {

    @GetMapping("/getAll")
    fun getAll():List<Worker>{
      return workerService.getAllWorkers()
    }

    @GetMapping("/{id}")
    fun getWorkerById(@PathVariable id: Long): Optional<Worker> {
        logger.info("PORT = " + env.getProperty("local.server.port"))
        return workerService.getWorkerById(id)
    }

}