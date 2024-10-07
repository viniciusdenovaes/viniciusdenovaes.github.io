# JDBC[^exemplos]
[^exemplos]: Os exemplos desta aula podem ser vistos no [github](https://github.com/viniciusdenovaes/Unip222ALPOO/tree/master/Aula04JDBC/src)

Nesta aula vamos aprender a fazer um programa em Java que faça uma conexão com um banco de dados.

O banco de dados que vamos utilizar é o MySQL.

Devemos obrigatoriamente seguir os passos:

1. Conseguir o driver do banco de dados (a biblioteca que vai permitir a conexão). Aqui é feita a escolha de qual banco de dados usaremos (MySQL)
1. Fazer a conexão com o banco de dados. Aqui será fornecido as informações para conectar ao banco: usuário, senha, tabela.
1. Fazer as operações referente ao banco: inserção, busca, etc...
1. (Se preciso) Pegar o resultado da operação.

## Banco de Dados

Para acessar um banco de dados, primeiro precisamos ter acesso à um banco de dados.

Nesta aula usaremos, como exemplo o mysql com um banco de dados chamado `veterinario22` com somente uma tabela chamada `Gatos` apenas com um id e um nome:

```
mysql> describe Gatos;
+-------+--------------+------+-----+---------+-------+
| Field | Type         | Null | Key | Default | Extra |
+-------+--------------+------+-----+---------+-------+
| id    | int          | YES  |     | NULL    |       |
| nome  | varchar(255) | YES  |     | NULL    |       |
+-------+--------------+------+-----+---------+-------+
2 rows in set (0,00 sec)
```

## Driver

O Driver é um arquivo `.jar` distribuídos pela própria empresa do banco de dados.

Para encontrar o driver do mysql basta procurar por "jdbc mysql driver", e escolher a "distribuição independente da plataforma".

Depois de baixar o driver, você deve incluir o .jar em seu projeto como uma biblioteca externa.

No Eclipse, por exemplo, clique com o botão da direita no projeto > properties > java build path > Libraries > classpath > add external jar; escolha o arquivo baixado.

## Conexão

Para fazer a conexão usaremos a interface `Connection` de `java.sql.Connection`. Criaremos um objeto filho de `Connection` através do método estático `DriverManager` do `java.sql.DriverManager`:

```java
static private String USER = "user";
static private String PASS = "123456";
static private String DATABASE = "veterinario22";
static private String URL = "jdbc:mysql://localhost:3306/" + DATABASE;

static void testaConnection() {

  try (Connection c = DriverManager.getConnection(URL, USER, PASS)){
    System.out.println("Conexao estabelecida");
  }catch(Exception e) {
    e.printStackTrace();
  }
}

```
onde
- `USER` é o usuário
- `PASS` é o password do banco de dados
- `DATABASE` é o banco de dados que será usado
- `URL` é o endereço do banco de dados, no caso o banco de dados está instalado em meu computador, então o endereço, por padrão, será `"jdbc:mysql://localhost:3306/"`, concatenado com o nome do banco de dados.

## Updates

Para atualizar o banco de dados vamos usar o `PreparedStatement` e adicionar um `Gato` no banco de dados:

```java
@Override
public void addGato(Gato gato) {

  final String query = "INSERT INTO Gatos VALUES (?, ?)";

  try (Connection c = DriverManager.getConnection(URL, USER, PASS)){

    PreparedStatement pstm = c.prepareStatement(query);

    pstm.setInt(1, gato.getId());
    pstm.setString(2, gato.getNome());

    int result = pstm.executeUpdate();

    System.out.println("Resultado de adicionar gato " + gato + ": " + result);



  }catch(Exception e) {
    e.printStackTrace();
  }
}
```

Os passos funcionam assim:
1. Recebemos um objeto `Gato` de entrada, lembrando que `Gato` tem os campos `id (int)` e `nome (String)`.
1. Criamos o comando para inserir uma entrada no banco de dados, mas deixando um caracter especial `?` onde queremos inserir as palavras de entrada: `"INSERT INTO Gatos VALUES (?, ?)"`
1. Estabelecemos uma conexão
1. Criamos um `PreparedStatement` à partir da conexão. Este objeto recebe como parâmetro o comando para inserir uma entrada no banco de dados.
1. Agora precisamos preencher os characteres `?` que deixamos no comando, pedimos para o `PreparedStatement` fazer isso: com `pstm.setInt(1, gato.getId())` pedimos para colocar um `int` no primeiro `?` e o valor deste inteiro será `gato.getId()`; com `pstm.setString(2, gato.getNome());` pedimos para inserir uma `String` no segundo `?` e o valor desta `String` será `gato.getNome()`.
1. Finalmente, pedimos para o `PreparedStatement` executar a atualização programada com `pstm.executeUpdate();`.


## Buscas

Para fazer uma busca em um banco de dados precisamos usar o `ResultSet` para acessar o resultado da busca. No exemplo à seguir vamos fazer recuperar todos os gatos na tabela.

```java
@Override
public List<Gato> getTodosGatos() {

  List<Gato> gatos = new ArrayList<>();

  final String query = "SELECT * FROM Gatos;";
  try (Connection c = DriverManager.getConnection(URL, USER, PASS)){

    Statement stm = c.createStatement();
    ResultSet rs = stm.executeQuery(query);

    while(rs.next()) {
      int id = rs.getInt("id");
      String nome = rs.getString("nome");
      Gato gato = new Gato(id, nome);
      gatos.add(gato);
    }



  }catch(Exception e) {
    e.printStackTrace();
  }

  return gatos;
}
```

Os passos funcionam assim:
1. Criamos uma lista de Gatos para poder guardar e retornar o resultado.
1. Criamos o comando para fazer a busca de todos os gatos: `"SELECT * FROM Gatos;"` (desta vez não precisamos colocar o `?`)
1. Estabelecemos uma conexão
1. Criamos um `Statement` à partir da conexão. Este objeto fará a busca. Perceba que não precisamos criar um `PreparedStatement`, pois não temos o caracter especial `?`.
1. Agora pedimos para o `Statement` realizar a busca e criamos um `ResultSet` para receber o resultado da busca.
1. Para iterar pelo `ResultSet` precisamos usar o método `next()`, este método fará o ponteiro do `ResultSet` ir para a próxima entrada do resultado, retornando `true` enquanto tiver uma próxima entrada.
1. Em cada entrada de `ResultSet` podemos pegar o valor desta entrada pelo nome da coluna, especificando qual é o tipo de dado que irá retorna: `rs.getInt("id");` pede para pegar a coluna `id` como um inteiro; `rs.getString("nome");` pede para pegar a coluna `nome` como uma `String`.
1. Com um nome e um id, podemos criar um Gato e adicionar à lista.


## Conclusão

Usando estes componentes podemos fazer qualquer comando simples em um banco de dados. Só lembre que:
- Para fazer comandos que dependam da entrada do usuário use o `PreparedStatement`
- Se não depender da entrada do usuário você poderá usar o `Statement`
- Se um comando no banco exigir uma resposta, como a busca por exemplo, você precisa usar o método `executeQuery` e receber um `ResultSet`
- Caso seja uma atualização no banco de dados, use o método `executeUpdate`

## *<a style="color:red;">IMPORTANTE!!!</a>*

Raramente iremos precisar fazer uma atualização ou uma busca usando argumentos pré-programados.
Normalmente é o usuário final quem deve fornecer os argumentos para usar na nossa busca ou atualização.

Neste caso **nunca** devemos concatenar uma String de um comando com uma String fornecida pelo usuário.
Sob o risco do sistema sofrer um [_injection atack_](https://en.wikipedia.org/wiki/SQL_injection).

O recomendável para esta situação é usar a classe `PreparedStatement`




.
