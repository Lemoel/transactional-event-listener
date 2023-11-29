package com.poc.demo.usecase

import com.poc.demo.AlunoCreatedEvent
import com.poc.demo.model.Aluno
import com.poc.demo.repository.AlunoRepository
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class TempUseCase(
    private val alunoRepository: AlunoRepository,
    private val eventPublisher: ApplicationEventPublisher,
) {
    @Transactional
    fun execute(): Aluno? {
        val aluno = Aluno(name = "Aluno_1")
        return alunoRepository.save(aluno).let {
            eventPublisher.publishEvent(AlunoCreatedEvent(it.id!!))
            it
        }
    }
}
