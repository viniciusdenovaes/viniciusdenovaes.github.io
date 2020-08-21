# Aula 04 - JDBC


Nesta aula vamos aprender a fazer uma conexão com um banco de dados relacional (PostgreSQL).

Com a conexão, vamos aprender a atualizar e fazer pesquisa.


## Conexão

Para fazer uma conexão com o Baco de Dados é preciso baixar o driver do banco de dados que será usado, neste caso usaremos o [driver do Postgresql](https://jdbc.postgresql.org/download.html)

Para criar uma `Connection` usaremos o método `DriverManager.getConnection(URL, USER, PASSWORD)` que receberá, a url do banco de dados, o nome de usuário e a senha.

Por exemplo, para conectar ao banco de dados "NomeDoBancoDeDados", com o usuário "postgres", e a senha "123456".

```java
public class TesteJDBC {

	public final static String DATABASE = "Teste";
	public final static String URL = "jdbc:postgresql:" + DATABASE;
	public final static String USER = "postgres";
	public final static String PASS = "123456";

	static public void fazConexao() {
		try(Connection connection = DriverManager.getConnection(URL, USER, PASS)){
			System.out.println("Conexao feita");
		} catch(SQLException e) {
			System.out.println("ERROR: Erro ao tentar conexao");
			e.printStackTrace();
		}

	}
}
```


## Atualização

Para fazer uma atualização usaremos o método `executeUpdate(String update)` da classe `Statement`.
No lugar de `update` é preciso colocar o comando da atualização.

Para criar um `Statement` é preciso criar um pela conexão com o método `connection.createStatement()`.

Por exemplo, para adicionar um aluno com ra "112" e nome "Fulano Sicrano" na tabela abaixo

![Tabela de Alunos](tabelaAlunos.png)

```java
	static public void addAluno() {

		final String update = "INSERT INTO alunos VALUES ('112', 'Fulano Sicrano')";


		try(Connection connection = DriverManager.getConnection(URL, USER, PASS)){

			Statement stm = connection.createStatement();
			int r = stm.executeUpdate(update);
			System.out.println("Linhas modificadas: " + r);

		} catch(SQLException e) {
			e.printStackTrace();
		}

	}
```

## Pesquisa

Para fazer uma pesquisa usaremos o método `executeQuery(String query)` da classe `Statement`.
No lugar de `query` é preciso colocar o comando da pesquisa.

O método `executeQuery` retornará um objeto que implementa a interface `ResultSet`.

Para iterar sobre o `ResultSet` usaremos o método `next()`.

Para receber o valor da i-ésima coluna usaremos o método `getXxx(int i)`,
ou podemos receber o valor da coluna de nome "nome" usando o método `getXxx(String nome)`.

Nestes casos `Xxx` deve ser substituído por
 - `String` caso o valor seja uma string,
 - `Int` caso seja um número inteiro, e
 - `Double` caso seja um número real.

```java
	static public void listaAlunos() {

		final String querry = "SELECT * FROM alunos";

		try(Connection connection = DriverManager.getConnection(URL, USER, PASS)){

			Statement stm = connection.createStatement();
			ResultSet rs = stm.executeQuery(querry);
			while(rs.next()) {
				System.out.println("ra: " + rs.getString(1) + ", nome: " + rs.getString(2));
			}

		} catch(SQLException e) {
			e.printStackTrace();
		}

	}
```



## PreparedStatement (*<a style="color:red;">IMPORTANTE!!!</a>*)

Raramente iremos precisar fazer uma atualização ou uma busca usando argumentos pré-programados.
Normalmente é o usuário final quem deve fornecer quais argumentos usar na nossa busca ou atualização.

Neste caso **nunca** devemos concatenar uma String de um comando com uma String fornecida pelo usuário.
Sob o risco do sistema sofrer um [_**injection atack**_](https://en.wikipedia.org/wiki/SQL_injection).

O recomendável para esta situação é usar a classe `PreparedStatement`

Um objeto que implementa a interface `PreparedStatement` é retornado pelo método `connection.prepareStatement(String query)`.
A `String query` que o método recebe deve ter o símbolo `'?'` no lugar onde o argumento será inserido no comando SQL.

Para inserir um valor na `query` é preciso usar o método `setXxx(int i, Xxx x)`;
onde `Xxx` será `String`, `Double` ou `Int`;
`i` para indicar qual i-ésimo '?' será substituído;
`x` com o valor que deve entrar no lugar.

```java
	static public void addAluno(String ra, String nome) {

		final String query = "INSERT INTO alunos VALUES (?, ?)";


		try(Connection connection = DriverManager.getConnection(URL, USER, PASS)){

			PreparedStatement pstm = connection.prepareStatement(query);
			pstm.setString(1, ra);
			pstm.setString(2, nome);
			int r = pstm.executeUpdate();
			System.out.println("Linhas modificadas: " + r);

		} catch(PSQLException e) {
			System.out.println(e.getMessage());
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
```


```java

	static public void buscaAluno(String nome) {

		final String query = "SELECT * FROM alunos WHERE nome = ?";

		try(Connection connection = DriverManager.getConnection(URL, USER, PASS)){

			PreparedStatement pstm = connection.prepareStatement(query);
			pstm.setString(1, nome);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				System.out.println("ra: " + rs.getString(1) + ", nome: " + rs.getString(2));
			}

		} catch(SQLException e) {
			e.printStackTrace();
		}

	}
```
