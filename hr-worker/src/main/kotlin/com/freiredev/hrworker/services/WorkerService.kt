package com.freiredev.hrworker.services

import com.freiredev.hrworker.entities.Worker
import com.freiredev.hrworker.repositories.WorkerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class WorkerService {

    @Autowired
    private lateinit var workerRepository: WorkerRepository

    fun getAllWorkers(): List<Worker>{
        return workerRepository.findAll()
    }

    fun getWorkerById(id: Long): Optional<Worker> {
        return workerRepository.findById(id)
    }
}