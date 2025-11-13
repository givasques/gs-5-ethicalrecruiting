# GS2 3SIR - Ethical Recruiting 
## Integrantes do Grupo

- Giovanna Vasques Alexandre – RM: 99884
- Wemilli Nataly Lima de Oliveira – RM: 552301

## Descrição do Tema
O **Ethical Recruiting** (sistema de recrutamento ético) propõe o uso de **inteligência artificial** e **análise de dados** para tornar os processos seletivos mais justos, transparentes e livres de vieses humanos.

A ideia é:
- Promover diversidade e equidade nas contratações.
- Aumentar a confiança entre candidatos e empresas.

## Sobre a API
A API fornece um endpoint único (``GET/info``) para fornecer dados sobre o projeto:
- Tema do projeto;
- Integrantes da equipe;
- Descriçao do tema.

## Instruções de Execução Local
- Executar com Maven

    Para rodar a aplicação localmente usando Maven:

    ```
    mvn spring-boot:run
    ```
- Executar com Docker Compose

    1. Abrir DockerDesktop;

    2. Executar o comando:
    
        ```
        docker compose up
        ```
- Acessar a documentação

    Após iniciar a aplicação, abra o navegador e acesse a documentação Swagger:
    ```
    http://localhost:8081/swagger-ui/index.html
    ```

## DockerHub
É possível executar a API através de um container docker. A imagem está disponível em:

- [Imagem Docker - API Ethical Recruiting ](https://hub.docker.com/repository/docker/givasques1101/gs-5-ethicalrecruiting/general)

## Workflows
### Release-Please

O workflow Release-Please automatiza o versionamento da aplicação, criando tags automáticas sempre que há alterações significativas no código.

Além disso, ele gera automaticamente changelogs, documentando de forma organizada todas as mudanças implementadas no projeto.

### Continuous Integration (CI)

O workflow de Continuous Integration é responsável por garantir que o projeto se mantenha funcional a cada alteração. Ele realiza:

- Build da aplicação;

- Execução de testes unitários;

- Build da imagem Docker para validação.

### Continuous Delivery (CD)

O workflow de Continuous Delivery cuida da publicação da aplicação, enviando a versão atualizada da imagem Docker para o Docker Hub, garantindo que a versão mais recente esteja disponível para uso ou implantação.

