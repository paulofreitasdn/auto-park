# Auto Park

Auto Park é uma API projetada para facilitar o gerenciamento eficiente de veículos em um estacionamento!

## Funcionalidades

### Gerenciamento de Veículos:

- Registro de entrada e saída de veículos
- Consulta de status do estacionamento
- Histórico de entradas e saídas de veículos
- Cálculo do valor do estacionamento baseado no tempo de permanência

### Gerenciamento de Usuários:

- Cadastro de usuários com e-mail único
- Definição de perfis de administrador ou cliente
- Alteração de senha
- Listagem e recuperação de dados de usuários pelo administrador
- Recuperação de dados próprios pelo cliente

### Autenticação:

- Sistema de autenticação com JSON Web Token (JWT)
- Proteção de rotas para garantir acesso seguro aos recursos

### Gerenciamento de Clientes:

- Cadastro de clientes vinculados a usuários
- Recuperação e listagem de dados de clientes
- Ações permitidas apenas para clientes autenticados

### Gerenciamento de Vagas:

- Cadastro e monitoramento de vagas
- Alteração do status das vagas
- Localização de vagas pelo código único

### Controle de Estacionamentos:

- Registro de entrada e saída de veículos com informações detalhadas
- Geração de número de recibo único para cada registro de estacionamento
- Desconto aplicado após 10 estacionamentos concluídos
- Listagem de estacionamentos por CPF do cliente
- Geração de relatórios em PDF

## Tecnologias Utilizadas

- **[Java 17](https://www.oracle.com/br/java/)**
- **[Spring (Boot, Web, Data, Security)](https://spring.io)**
- **[MySQL](https://www.mysql.com)**
- **[Swagger](https://swagger.io)**
- **[Maven](https://maven.apache.org)**
- **[JasperSoft Studio](https://www.jaspersoft.com/products/jaspersoft-community)**
- **[H2 Database](https://www.h2database.com/html/main.html)**
- **[Bean Validation](https://beanvalidation.org)**

## Autor

- **[Paulo Freitas](https://www.linkedin.com/in/paulofreitasdn/)**
