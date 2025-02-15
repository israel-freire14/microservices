package com.freiredev.hr_user.controllers

import com.freiredev.hr_user.repositories.UserRepository
import com.freiredev.hr_user.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
abstract class AbstractController {

    @Autowired
    lateinit var userService: UserService;
}