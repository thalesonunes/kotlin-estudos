package com.mercadolivro.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("hello")
class CustomerController {

    @GetMapping
    fun helloWorld(): String{
        return "Hello World!"
    }

    @GetMapping("/up")
    fun helloWorldUp(): String{
        return "Hello World!".toUpperCase()
    }


}