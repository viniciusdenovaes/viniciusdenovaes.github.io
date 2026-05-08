USE PizzariaNapoliV2;
GO

-- Populando a tabela de clientes
INSERT INTO Clientes (nome, telefone, endereco, bairro) VALUES ('Alice', '11', 'Rua Flores', 'Centro');
INSERT INTO Clientes (nome, telefone, endereco, bairro) VALUES ('Bruno', '12', 'Av. Principal', 'Sul');
INSERT INTO Clientes (nome, telefone, endereco, bairro) VALUES ('Caio', '19', 'Rua Baixa', 'Oeste');
INSERT INTO Clientes (nome, telefone, endereco, bairro) VALUES ('Daniel', '13', 'Rua Alta', 'Oeste');
INSERT INTO Clientes (nome, telefone, endereco, bairro) VALUES ('Emilia', '19', 'Rua Baixa', 'Oeste');
INSERT INTO Clientes (nome, telefone, endereco, bairro) VALUES ('Fernanda', '14', 'Rua Alta', 'Oeste');

GO

-- Emilia eh cliente vip agora 
UPDATE Clientes
SET vip = 1
WHERE id_cliente = 5;

GO

-- Populando a tabela de pizzas
INSERT INTO Pizzas (nome, preco, categoria) VALUES ('Frango', 45.00, 'Tradicional');
INSERT INTO Pizzas (nome, preco, categoria) VALUES ('Calabresa', 50.00, 'Tradicional');
INSERT INTO Pizzas (nome, preco, categoria) VALUES ('Chocolate Branco', 60.00, 'Doce');
INSERT INTO Pizzas (nome, preco, categoria) VALUES ('Chocolate ao Leite', 60.00, 'Doce');
INSERT INTO Pizzas (nome, preco, categoria) VALUES ('Frango com Mel', 55.00, 'Doce');
INSERT INTO Pizzas (nome, preco, categoria) VALUES ('Lombo com Abacaxi', 35.00, 'Doce');
INSERT INTO Pizzas (nome, preco, categoria) VALUES ('Lombo', 55.00, 'Tradicional');

GO

-- Pedidos da Alice (ID 1)
INSERT INTO Pedidos (id_cliente, id_pizza, status_pedido) VALUES (1, 1, 'Em Preparacao');
INSERT INTO Pedidos (id_cliente, id_pizza, status_pedido) VALUES (1, 2, 'Em Preparacao');

-- Pedidos do Bruno (ID 2)
INSERT INTO Pedidos (id_cliente, id_pizza, status_pedido) VALUES (2, 2, 'Em Preparacao');
INSERT INTO Pedidos (id_cliente, id_pizza, status_pedido) VALUES (2, 3, 'Em Preparacao');

-- Pedidos do Caio (ID 3)
INSERT INTO Pedidos (id_cliente, id_pizza, status_pedido) VALUES (3, 1, 'Em Preparacao');
INSERT INTO Pedidos (id_cliente, id_pizza, status_pedido) VALUES (3, 3, 'Em Preparacao');

-- Pedidos da Emilia (ID 5)
INSERT INTO Pedidos (id_cliente, id_pizza, status_pedido) VALUES (5, 4, 'Em Preparacao');
INSERT INTO Pedidos (id_cliente, id_pizza, status_pedido) VALUES (5, 7, 'Em Preparacao');
INSERT INTO Pedidos (id_cliente, id_pizza, status_pedido) VALUES (5, 7, 'Em Preparacao');
