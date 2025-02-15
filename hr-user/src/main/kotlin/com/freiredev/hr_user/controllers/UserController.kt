package com.freiredev.hr_user.controllers

import com.freiredev.hr_user.entities.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/users")
class UserController: AbstractController(){

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<User>{
        val userById: User = userService.findById(id)
        return ResponseEntity.ok(userById)
    }

    @GetMapping("/search")
    fun findByEmail(@RequestParam email: String): ResponseEntity<User>{
        val userByEmail: User = userService.findByEmail(email)!!
        return ResponseEntity.ok(userByEmail)
    }
}