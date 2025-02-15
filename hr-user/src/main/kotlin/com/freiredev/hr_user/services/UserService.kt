package com.freiredev.hr_user.services

import com.freiredev.hr_user.entities.User
import com.freiredev.hr_user.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository;

    fun findById(id: Long): User {
      return userRepository.findById(id).get()
    }

    fun findByEmail(email: String): User? {
        return userRepository.findByEmail(email).get()
    }
}