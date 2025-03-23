# PROJETO DE WORKSHOP UTILIZANDO SPRING BOOT E MONGODB
Projeto de workshop utilizando Spring Boot e MongoDB para fins didáticos e apresentar meu conhecimento.

# DOCUMENTAÇÃO

## Documentação da Classe `UserResource`

### Pacote
`com.izadev.workshopmongo.resources`

### Descrição
1. A classe `UserResource` é um controlador REST no contexto de uma aplicação Spring Boot. Ela expõe um endpoint para listar usuários.
2. Retorna uma lista de usuários simulada.

### Retorno
`ResponseEntity<List<User>>` - Responde com um código HTTP 200 e uma lista de objetos `User`.

### Implementação
1. Cria dois usuários fictícios (Maria Silva e Alex Silva).
2. Adiciona os usuários a uma lista.
3. Retorna uma lista encapsulada em um `ReponseEntity.ok()`.

### Dependências
1. `ResponseEntity`: Padroniza a resposta HTTP.
2. `@GetMapping`: Mapea requisições HTTP do tipo GET.
3. `User`: Classe de domínio representado um usuário.

### Anotações
- `@RestController`: Indica que a classe é um controlador REST, tornando seus métodos capazes de lidar com requisições HTTP.
- `@RequestMapping(value="/users")`: Define o caminho base do recurso como `/users`.

### Métodos

#### `findAll()`
```java
@GetMapping
public ResponseEntity<List<User>> findAll()
```

