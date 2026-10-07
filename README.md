Projeto Sync

API Rest desenvolvida em Java utilizando o Spring boot framework e Docker.
A aplicação consulta os posts da API JSONPlaceholder, persiste os dados no PostgreSQL e disponibiliza endpoints REST para consulta.

Tecnologias utilizadas: 

- Java 25
- Spring Boot 4.1.1
- Spring DATA jpa
- PostgreSQL 
- Docker
- Maven
- Springdoc OpenAPI / Swagger

Pré-requisitos para executar o programa:

* Java 25
* Docker
* Docker compose

Como iniciar o Docker:
1 - Faça a instalação do Docker no site oficial: https://docs.docker.com/desktop/setup/install/windows-install/ 

2 - Após baixar o arquivo executável, complete a instalação por ele.

3 - Caso Você tenha o PostgreSQL instalado na maquina, é importante parar o serviço dele, vou deixar um passo a passo básico aqui:
    Aperte windows + R e digite "services.msc" >> Procure pelo serviço "postgresql-x64-18", ou algo semelhante, podendo mudar dependendo da sua versão
    >> Aperte nele com o botão direito do mouse, e selecione "parar", assim o servidor do docker será o único postgreSQL em sua máquina, evitando conflitos
    de ter 2 portas padrões iguais (5432).

4 - Após seguir o passo anterior, realize o git clone desse repositório em sua maquina e abra o arquivo e o docker desktop.

5 - Execute o seguinte comando no terminal para subir a imagem do docker: docker compose up -d e espera a conclusão.

6 - Após executar o container muito provavelmente já terá subido a imagem do banco de dados em seu Docker Desktop, execute arquivo: "SyncProjectApplication"

7 - Acesse o seguinte link após o servidor estar ativo: http://localhost:8080/swagger-ui.html


TESTES

O projeto contém 4 testes disponíveis:
    Dois testes que estão no PostRepositoryTest no caminho: \SyncProject\SyncProject\src\test\java\com\segsat\syncproject\repository que é responsável salvar e também consultar os posts cadastrados.
    Mais dois testes em PostController no caminho: SyncProject\SyncProject\src\test\java\com\segsat\syncproject\controller que é responsável por tentar realizar a busca de um post que não existe, e retornar uma mensagem de erro 404.
