# Poc de eventos (TransactionalEventListener)

O objetivo desta **prova de conceito** e realizar testes do lançamento de eventos e usar nos listener a anotação `TransactionalEventListener`

# 1 - Docker compose

Para subir o banco de dados é necessário use na raiz do projeto, verifique se vc tem o docker compose instalado em sua máquina.

```yaml
$sudo docker compose up
```

# 2 - Flyway

Ao subir o projeto pela primeira vez será criado um schema de banco de dados de nome **POC** e uma tabela **aluno**

# 3 - SpringBoot

O projeto foi feito usando **SpringBoot e Kotlin**

## 4 - Fontes

[https://medium.com/@luksrn/eventos-em-transa%C3%A7%C3%B5es-do-spring-ec5db69c1006](https://medium.com/@luksrn/eventos-em-transa%C3%A7%C3%B5es-do-spring-ec5db69c1006)

[https://docs.spring.io/spring-framework/reference/data-access/transaction/event.html](https://docs.spring.io/spring-framework/reference/data-access/transaction/event.html)

[https://www.baeldung.com/spring-events](https://www.baeldung.com/spring-events)

[https://github.com/Lemoel/transactional-event-listener](https://github.com/Lemoel/transactional-event-listener)