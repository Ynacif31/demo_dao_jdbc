# Projeto de Sistema de Vendas

Este projeto é um sistema básico de vendas desenvolvido em Java, utilizando JDBC para conexão com o banco de dados. O sistema permite gerenciar vendedores (sellers) e departamentos (departments), com operações de CRUD (Create, Read, Update, Delete).

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

- **Gerenciamento de Vendedores (Sellers):**
  - Inserção de vendedores no banco de dados
  - Atualização de informações de vendedores
  - Exclusão de vendedores por ID
  - Consulta de vendedores por ID, por departamento ou listagem de todos os vendedores

- **Gerenciamento de Departamentos (Departments):**
  - Inserção de departamentos no banco de dados
  - Atualização de informações de departamentos
  - Exclusão de departamentos por ID
  - Consulta de departamentos por ID

## Estrutura do Projeto

- `model.entities`: Contém as classes de entidade que representam os dados do sistema, como `Seller` e `Department`.
- `model.dao`: Interface que define as operações de acesso ao banco de dados para vendedores e departamentos.
- `model.dao.impl`: Implementações JDBC das interfaces DAO, como `SellerDaoJDBC` e `DepartmentDaoJDBC`.
- `db`: Classe `DB` responsável por gerenciar a conexão com o banco de dados e manipular recursos.
- `application`: Contém as classes principais para execução dos testes do sistema.

## Pré-requisitos

- Java JDK 8 ou superior
- MySQL ou outro banco de dados compatível
- Biblioteca JDBC para conexão com o banco de dados

## Configuração do Banco de Dados

Certifique-se de configurar corretamente o banco de dados antes de executar o sistema. O banco de dados deve conter as seguintes tabelas:

```sql
CREATE TABLE department (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100)
);

CREATE TABLE seller (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100),
    Email VARCHAR(100),
    BirthDate DATE,
    BaseSalary DOUBLE,
    DepartmentId INT,
    FOREIGN KEY (DepartmentId) REFERENCES department(Id)
);
