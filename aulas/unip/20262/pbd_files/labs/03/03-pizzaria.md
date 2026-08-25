# Treinando Comandos `SELECT`

Neste laboratório vamos treinar os comandos `SELECT` aprendidos em aula.

Use o banco de dados criado nos últimos labs, caso queira criar um novo use a seguinte esquemática.

###### Banco de Dados Pizzaria
```sql
CREATE DATABASE IF NOT EXISTS Pizzaria;
USE Pizzaria;

-- Criação da tabela de Clientes
CREATE TABLE Clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20),
    endereco VARCHAR(255),
    bairro VARCHAR(50)
);

-- Criação da tabela de Pizzas
CREATE TABLE Pizzas (
    id_pizza INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    categoria VARCHAR(50)
);

-- Criação da tabela de Pedidos com Chaves Estrangeiras
CREATE TABLE Pedidos (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    id_pizza INT NOT NULL,
    status_pedido VARCHAR(50) DEFAULT 'EmPreparacao',
    data_pedido DATETIME DEFAULT CURRENT_TIMESTAMP,
    ADD COLUMN data_entrega DATETIME NULL;

    CONSTRAINT FK_Cliente FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente),
    CONSTRAINT FK_Pizza FOREIGN KEY (id_pizza) REFERENCES Pizzas(id_pizza)
);
```

### Adicionando Dados

Adicione no banco de dados:
- +3 tipos de pizza, uma `doce` e 2 `salgada` com preços variando entre 40 e 60
- +3 tipos de pizzas `salgadas` de frango, por exemplo:`frango com milho`, `frango teriaki`, etc... Com preços variando entre 20 e 40
- +3 Clientes, com **dois deles morando no mesmo bairro**
- +6 Pedidos

### Pesquisando dados

Faça as seguintes pesquisas
- Selecione todos os dados de todas as tabelas (são 3 comandos separados, 3 resultados diferentes).
- Pesquise todos os bairros **diferentes** que ocorrem na tabela de clientes.
- Pesquise todas as pizzas salgadas
- Pesquise todas as pizzas que não são salgadas
- Pesquise todas as pizzas com preço mais barato que 40.
- Pesquise todas as pizzas com preço entre 40 e 60.
- Pesquise todas as pizzas que contêm `frango` no nome
- Liste todas as pizzas em ordem da mais barata para a mais cara.


