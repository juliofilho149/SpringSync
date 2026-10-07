Projeto Sync

API REST desenvolvida em Java utilizando o framework Spring Boot e Docker.

A aplicação consulta os posts da API pública JSONPlaceholder, persiste os dados no PostgreSQL e disponibiliza endpoints REST para consulta e sincronização.

Tecnologias utilizadas

- Java 25
- Spring Boot 4.1.1
- Spring Data JPA
- PostgreSQL
- Docker
- Docker Compose
- Maven
- Springdoc OpenAPI / Swagger

Pré-requisitos

Para executar o projeto, é necessário ter instalado:

- Java 25
- Docker
- Docker Compose

Como executar o projeto

1. Instalação do Docker

Caso ainda não possua o Docker instalado, faça o download pelo site oficial:

https://docs.docker.com/desktop/setup/install/windows-install/

Após baixar o instalador, conclua a instalação.

2. Verificar o PostgreSQL

Caso você já tenha o PostgreSQL instalado na máquina, é importante verificar se ele está utilizando a porta `5432`.

Para evitar conflitos com o PostgreSQL executado pelo Docker:

1. Pressione `Windows + R`.
2. Digite `services.msc`.
3. Procure pelo serviço do PostgreSQL, por exemplo `postgresql-x64-18`.
4. Clique com o botão direito no serviço e selecione **Parar**.

A versão do serviço pode variar de acordo com a versão do PostgreSQL instalada.

3. Clonar o projeto

Clone o repositório do projeto em sua máquina e abra a pasta do projeto.

Também é necessário manter o Docker Desktop aberto.

### 4. Iniciar o PostgreSQL pelo Docker

Abra o terminal na pasta do projeto e execute: docker compose up -d

Inicie o projeto após a conclusão da configuração do Docker.

```bash

