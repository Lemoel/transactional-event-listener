package com.poc.demo.listener

import com.poc.demo.AlunoCreatedEvent
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class ListenerAluno1 {

    @Async
    @EventListener(AlunoCreatedEvent::class)
    fun onboardingCreated(event: AlunoCreatedEvent) {
        println("ListenerAluno1: ${event}")
    }

}