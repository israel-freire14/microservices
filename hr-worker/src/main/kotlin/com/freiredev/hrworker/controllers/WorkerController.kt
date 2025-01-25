package com.freiredev.hrworker.controllers

import com.freiredev.hrworker.entities.Worker
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Optional

@RefreshScope
@RestController
@RequestMapping("/workers")
class WorkerController: AbstractController() {

    @GetMapping
    fun getAll(): ResponseEntity<List<Worker>>{
      return ResponseEntity.ok(workerService.getAllWorkers())
    }

    @GetMapping("/configs")
    fun getConfigs(): ResponseEntity<Unit>{
        logger.info("CONFIG = $testConfig")
        return ResponseEntity.noContent().build()
    }

    @GetMapping("/{id}")
    fun getWorkerById(@PathVariable id: Long): Optional<Worker> {
        logger.info("PORT = ${env.getProperty("local.server.port")}")
        return workerService.getWorkerById(id)
    }

}