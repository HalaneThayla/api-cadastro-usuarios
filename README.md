
# 📌 API de Cadastro de Usuários

## 📋 Descrição

Esta é uma API REST desenvolvida em Java com o framework Spring Boot, com o objetivo de realizar operações básicas de cadastro de usuários. É possível adicionar, listar, buscar e deletar usuários.

---

## 🚀 Tecnologias Utilizadas

- Java 23  
- Spring Boot 3.4.7  
- Banco de dados H2 (em memória)  
- Postman (para testes)  

---

## 🛠️ Funcionalidades da API

- Criar um novo usuário (`POST`)
- Listar todos os usuários (`GET`)
- Buscar um usuário por ID (`GET`)
- Deletar um usuário por ID (`DELETE`)

---

## ⚙️ Etapas do Desenvolvimento

### 1. Criação do Projeto
- Projeto gerado pelo [Spring Initializr](https://start.spring.io/)
- Dependências adicionadas:
  - Spring Web
  - Spring Data JPA
  - H2 Database

### 2. Configuração
- Configuração do banco de dados H2 no `application.properties`
- Habilitação do console H2 para visualização dos dados

### 3. Implementação

#### 📌 Entidade (`User.java`)
- Criação da classe `User` com `@Entity`
- Atributos do usuário (nome, email, etc.)
- Chave primária com `@Id` e `@GeneratedValue`
- Construtores, getters e setters

#### 📌 Repositório (`UserRepository.java`)
- Interface estendendo `JpaRepository`

#### 📌 Controller (`UserController.java`)
- Anotação `@RestController`
- Injeção do repositório com `@Autowired`
- Endpoints: POST, GET (todos e por ID), DELETE

---

## 🧪 Testes

- Todos os endpoints foram testados com o **Postman**
- Banco de dados H2 acessado via console em `http://localhost:8080/h2-console`

---

## 📂 Estrutura do Projeto (resumida)

```
src
└── main
    └── java
        └── com.cadastrodousuario
            ├── controller
            │   └── UserController.java
            ├── entity
            │   └── User.java
            └── repository
                └── UserRepository.java
```

---

## 💻 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/HalaneThayla/api-cadastro-usuarios.git
   ```

2. Navegue até o projeto:
   ```bash
   cd api-cadastro-usuarios
   ```

3. Execute com sua IDE ou com:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse o console H2:
   ```
   http://localhost:8080/h2-console
   ```
