# Explorador de Dados da NASA

Este projeto é uma aplicação Java desenvolvida em parceria com João Ryan, que integra-se à API da NASA para fornecer informações atualizadas sobre missões espaciais, imagens e outros dados astronômicos.

## 🚀 Funcionalidades

- **Integração com a API da NASA**: Consumo de dados em tempo real sobre missões espaciais e imagens astronômicas.
- **Documentação com Swagger**: Interface interativa para visualização e teste dos endpoints da API.
- **Interface Gráfica**: Visualização dinâmica do histórico de missões espaciais com detalhes e imagens.

## 🛠 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Swagger**
- **Maven**

## 📌 Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- **Java 17 ou superior**
- **Maven**

## 📥 Instalação e Execução

1. Clone o repositório:

   ```bash
   git clone https://github.com/Mayronsf/consumindo-api.git
   ```

2. Acesse o diretório do projeto:

   ```bash
   cd consumindo-api
   ```

3. Instale as dependências e compile o projeto:

   ```bash
   mvn clean install
   ```

4. Execute a aplicação:

   ```bash
   java -jar target/consumindo-api-0.0.1-SNAPSHOT.jar
   ```

5. Acesse a documentação Swagger em:  
   [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## ⚠ Problemas Conhecidos

Durante o desenvolvimento, identificamos que a porta `8080` pode estar em uso por outro processo, impedindo a inicialização da aplicação. Para resolver isso, você pode:

- Identificar e finalizar o processo que está utilizando a porta `8080`.
- Alterar a porta padrão da aplicação modificando o arquivo `application.properties`:

  ```properties
  server.port=8081
  ```

## 🤝 Contribuições

Contribuições são bem-vindas! Para colaborar:

1. Faça um fork do repositório.
2. Crie uma nova branch:  
   ```bash
   git checkout -b minha-nova-feature
   ```
3. Faça suas alterações e commit:  
   ```bash
   git commit -m "Adiciona nova funcionalidade"
   ```
4. Envie as alterações:  
   ```bash
   git push origin minha-nova-feature
   ```
5. Abra um Pull Request 🚀

## 📜 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

## 👨‍💻 Autores

- **Mayron Silva** - [GitHub](https://github.com/Mayronsf)
- **João Ryan** - [GitHub](https://github.com/Ryannzadas)

---
