## Estrutura Principal

**controller**: classes que recebem as requisições HTTP
**service**: regras de negócio e lógica de aplicação.
**repository**: interfaces que fazem a persistência de dados (geralmente com Spring Data JPA)
**model** ou **domain**: classes de domínio
**config**: classes de configuração (ex.: cors, segurança...)
**dto**: objeto simples (POJO) criado para transportar dados.

## Comandos Importantes

## Executar a aplicação
```bash

./mvnw spring-boot:run

```

## Testar a Aplicação
```bash

./mvnw test

```
