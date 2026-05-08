USE PizzariaNapoli;
GO

CREATE TABLE Clientes (
    id_cliente INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20),
    endereco VARCHAR(255),
    bairro VARCHAR(50)
);
GO

CREATE TABLE Pizzas (
    id_pizza INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    categoria VARCHAR(50)
);
GO


CREATE TABLE Pedidos (
    id_pedido INT IDENTITY(1,1) PRIMARY KEY,
    id_cliente INT NOT NULL,
    id_pizza INT NOT NULL,
    status_pedido VARCHAR(50) DEFAULT 'Em Preparacao',
    data_pedido DATETIME DEFAULT GETDATE(),
    data_entrega DATETIME NULL,
    
    CONSTRAINT FK_Cliente FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente),
    CONSTRAINT FK_Pizza FOREIGN KEY (id_pizza) REFERENCES Pizzas(id_pizza)
);
GO

