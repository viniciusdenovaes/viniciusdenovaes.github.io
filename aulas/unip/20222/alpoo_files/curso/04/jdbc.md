# JDBC

Nesta aula vamos aprender a fazer um programa em Java que faça uma conexão com um banco de dados.

O banco de dados que vamos utilizar é o MySQL.

Devemos obrigatoriamente seguir os passos:

1. Conseguir o driver do banco de dados (a biblioteca que vai permitir a conexão). Aqui é feita a escolha de qual banco de dados usaremos (MySQL)
1. Fazer a conexão com o banco de dados. Aqui será fornecido as informações para conectar ao banco: usuário, senha, tabela.
1. Fazer as operações referente ao banco: inserção, busca, etc...
1. (Se preciso) Pegar o resultado da operação.

## Banco de Dados

Para acessar um banco de dados, primeiro precisamos ter acesso à um banco de dados.

Nesta aula usaremos, como exemplo o mysql com um banco de dados chamado `patos` com somente uma tabela chamada `Patos` apenas com um id e um nome:

```
mysql> describe Patos;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| id    | varchar(30) | NO   |     | NULL    |       |
| nome  | varchar(30) | NO   |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
2 rows in set (0,00 sec)
```

## Driver

O Driver é um arquivo `.jar` distribuídos pela própria empresa do banco de dados.

Para encontrar o driver do mysql basta procurar por "jdbc mysql driver", e escolher a "distribuição independente da plataforma".

Depois de baixar o driver, você deve incluir o .jar em seu projeto como uma biblioteca externa.

No Eclipse, por exemplo, clique com o botão da direita no projeto > properties > java build path > Libraries > classpath > add external jar; escolha o arquivo baixado.

## Conexão

Para fazer a conexão usaremos a interface `Connection` de `java.sql.Connection`.


import java.sql.Connection;
import java.sql.DriverManager;










.
