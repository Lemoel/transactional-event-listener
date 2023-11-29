package com.poc.demo.controller

import com.poc.demo.model.Aluno
import com.poc.demo.usecase.TempUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")

class TempResource(
    val tempUseCase: TempUseCase,
) {
    @PostMapping
    fun post(): ResponseEntity<Aluno> {
        return tempUseCase.execute()
            .run { ResponseEntity.ok().body(this) }
    }
}
