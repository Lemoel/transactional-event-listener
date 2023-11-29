package com.poc.demo.repository

import com.poc.demo.model.Aluno
import java.util.UUID
import org.springframework.data.repository.CrudRepository

interface AlunoRepository: CrudRepository<Aluno, UUID>