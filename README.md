<div align="center">

# 🚀 API de Gerenciamento de Usuários
### Desenvolvida com Spring Boot + PostgreSQL

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.5-6DB33F?style=for-the-badge&logo=springboot)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=openjdk)](https://www.oracle.com/java/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-336791?style=for-the-badge&logo=postgresql)](https://www.postgresql.org/)

</div>

## 📚 Documentação Interativa

### 🎯 Teste a API Online
[![Abrir no Postman](https://img.shields.io/badge/🔗_Testar_no_Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)](https://documenter.getpostman.com/view/28360145/2sA2r627h4)


[📖 Documentação Interativa no Postman](https://documenter.getpostman.com/view/17112066/2sBXVhEB6Z)


## 🚀 Começando

### Pré-requisitos
- Java 17+
- Maven 3.6+
- PostgreSQL 15+

### Instalação
```bash
# Clone o repositório
git clone https://github.com/PauloSergio/API-de-cadastro-CRUD.git

# Configure o banco
cp src/main/resources/application.properties.example src/main/resources/application.properties
# Edite as credenciais do PostgreSQL

# Execute
mvn spring-boot:run
```

## 📡 Endpoints

### Usuários
| Método | Endpoint | Body | Descrição |
|--------|----------|------|-----------|
| `POST` | `/users` | `{nome, email}` | Criar usuário |
| `GET` | `/users` | - | Listar todos |
| `GET` | `/users/{id}` | - | Buscar por ID |
| `PUT` | `/users/{id}` | `{nome, email}` | Atualizar |
| `DELETE` | `/users/{id}` | - | Remover |

## 📝 Exemplos

### Criar Usuário
```bash
curl -X POST http://localhost:8080/users \
  -H "Content-Type: application/json" \
  -d '{"nome": "Maria Silva", "email": "maria@email.com"}'
```

**Resposta:**
```json
{
  "id": 1,
  "nome": "Maria Silva",
  "email": "maria@email.com"
}
```

## 🛠 Tecnologias

- **Backend**: Spring Boot 4, Spring Data JPA, Spring Web
- **Banco**: PostgreSQL
- **Documentação**: Postman

## 📄 Licença
Este projeto está sob a licença MIT. Veja [LICENSE](LICENSE) para detalhes.

---

<div align="center">
Feito com ❤️ por [Seu Nome](https://github.com/seu-usuario)
</div>
