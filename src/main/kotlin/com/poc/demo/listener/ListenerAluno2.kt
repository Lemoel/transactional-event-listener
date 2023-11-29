package com.poc.demo.listener

import com.poc.demo.AlunoCreatedEvent
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component
import org.springframework.transaction.event.TransactionalEventListener

@Component
class ListenerAluno2 {

    @Async
    @TransactionalEventListener(AlunoCreatedEvent::class)
    fun onboardingCreated(event: AlunoCreatedEvent) {
        println("ListenerAluno1: ${event}")
    }

}