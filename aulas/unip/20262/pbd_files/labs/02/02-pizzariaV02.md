# Pizzaria V02

#### Data Definition Language

Na aula passada definimos o seguinte esquema de banco de dados:

![Pizzaria Versão 01](bdPizzaria01.drawio.svg)

Que poderia ser criado usando o seguinte código

```sql
CREATE DATABASE IF NOT EXISTS PizzariaV01;
USE PizzariaV01;

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
    
    CONSTRAINT FK_Cliente FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente),
    CONSTRAINT FK_Pizza FOREIGN KEY (id_pizza) REFERENCES Pizzas(id_pizza)
);
```

Neste laboratório vamos treinar a alteração de tabelas de um banco de dados.

Precisamos guardar as informações do momento em que um pedido foi feito e do momento em que ele foi fechado.

Na tabela de `Pedidos` use o comando `ALTER TABLE` junto com `ADD COLUMN` para adicionar as colunas
- `data_pedido` do tipo `DATETIME` e com valor padrão do momento em que o pedido foi feito (use o comando `DEFAULT CURRENT_TIMESTAMP`)
- `data_entrega` do tipo `DATETIME`.


#### Data Manipulation Language


Teste as tabelas criadas adicionando pelo menos 3 entradas em cada tabela, tanto nas tabelas entidade quanto na de relação.

Depois do passo anterior, **adicione mais 3 entradas** na tabela de `Pedidos`.

Agora altere as entradas da tabela de `Pedidos` para tornar **os primeiros 3 pedidos** como finalizados mudando 
- o campo de `status_pedido` de `EmPreparacao` para `Finalizado`, e 
- o campo de `data_entrega` de `NULL` para data atual.

Pode fazer cada item em separado usando o comando 
- `UPDATE` na tabela `Pedidos`
- `SET` indicando o campo que você quer que seja modificado
- **NÃO ESQUEÇA** do `WHERE`  para filtrar **em quais linhas** você quer que a modificação aconteça.
- Para comparar dois `DATETIME` no `WHERE` use a sintaxe `data_pedido < 'YYYY-MM-DD hh:mm:ss'`, por exemplo o comando `WHERE data_pedido >= '2026-08-18 04:00:00' AND data_pedido <= '2026-08-18 05:00:00';` filtra pedidos feitos entre as 4 e 5 horas do dia 18/08/2026.

Para mais informação utilize a [referência do w3schools](https://www.w3schools.com/mysql/mysql_update.asp)



#### Data Query Language


Teste as entradas criadas usando o comando `SELECT` para visualizar todos os dados de cada tabela. (serão 3 comandos `SELECT`)


###### [Resposta](02-resposta.txt)

