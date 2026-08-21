#  API REST com Spring Boot & Padrões de Projeto (GoF)

API REST desenvolvida como projeto final do bootcamp da **Digital Innovation One (DIO)**. O objetivo é demonstrar na prática a aplicação de **Design Patterns (Padrões de Projeto GoF)** em um ecossistema Java moderno alimentado pelo Spring Framework.

---

## Padrões de Projeto Implementados

* **Singleton:** Gerenciamento do ciclo de vida dos componentes e injeção de dependências mantidos pelo Spring IoC Container (`@Service`, `@RestController`, `@Repository`).
* **Strategy:** Interfaces de repositório do Spring Data JPA (`CrudRepository`) que encapsulam diferentes estratégias de persistência de dados.
* **Facade:** A classe `ClienteServiceImpl` atua como uma fachada, abstraindo para o cliente a complexidade da consulta/persistência local (Banco H2) e da integração com o serviço web externo (ViaCEP).

---

## Tecnologias e Recursos Utilizados

* **Java 17**
* **Spring Boot 3**
* **Spring Data JPA**
* **Spring Validation (Bean Validation):** Validação de campos obrigatórios (`@NotBlank`, `@Valid`) diretamente no Controller e Entidade.
* **Spring Cloud OpenFeign:** Cliente HTTP declarativo para consumo da API externa do ViaCEP.
* **H2 Database:** Banco de dados em memória para testes e persistência relacional.
* **SpringDoc OpenAPI / Swagger UI:** Documentação interativa e visual para testes de endpoints.
* **Maven:** Gerenciamento de dependências e build do projeto.

---

Estrutura do Projeto

```text
src/main/java/one/digitalinnovation/gof/
 ├── controller/        # Endpoints REST com validações de entrada (@Valid)
 ├── model/             # Entidades JPA com regras de validação e Repositórios
 ├── service/           # Camada de Negócio (Facade) e Feign Client (ViaCEP)
 └── Application.java   # Execução do projeto Spring Boot