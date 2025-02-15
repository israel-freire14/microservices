package com.freiredev.hr_user.services

import com.freiredev.hr_user.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
abstract class AbstractService {

    @Autowired
    lateinit var userRepository: UserRepository;
}