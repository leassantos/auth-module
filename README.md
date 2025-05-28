# Auth Module

Módulo de autenticação desenvolvido em Java com Spring Boot, seguindo uma arquitetura modular e orientada a DDD (Domain-Driven Design).  
O objetivo é criar um componente reutilizável, seguro e facilmente integrável com outros projetos.

Este repositório faz parte de um estudo guiado e contínuo com foco em boas práticas de desenvolvimento de software e separação de responsabilidades.

---

## 🚀 Funcionalidades atuais

- ✅ Estrutura inicial do projeto
- ✅ Endpoint de teste (`/hello`)

---

## 🧱 Tecnologias utilizadas

- Java 17+
- Spring Boot 3.x
- Maven
- Lombok
- Spring Web

---

## 📁 Estrutura de pacotes

```bash
src/main/java/com/leandro/auth
├── api             # Camada de entrada (controllers, DTOs)
├── application     # Casos de uso e lógica de aplicação
├── domain          # Entidades e lógica de domínio
└── infrastructure  # Conexões externas (DB, segurança, etc)
