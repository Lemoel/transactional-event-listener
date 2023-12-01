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