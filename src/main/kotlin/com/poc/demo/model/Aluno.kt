package com.poc.demo.model

import org.springframework.data.annotation.Id

data class Aluno(
    @Id
    val id: Long? = null,
    val name: String,
)