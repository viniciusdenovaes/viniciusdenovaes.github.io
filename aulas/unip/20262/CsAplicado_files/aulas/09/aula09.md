# Banco de Dados Com Tabelas Relacionais

Nesta aula vamos estudar um banco de dados relacional mais complexo que a aula passada.

Temos dados de uma livraria com as seguintes características:
- Uma editora tem
   - o nome da editora e
   - a url do site.
- Cada autor tem
   - um nome e sobrenome
- Cada livro tem 
   - um identificador único chamado `ISBN`, 
   - um título, 
   - o preço, 
   - uma editora e
   - uma lista de autores ordenada pela ordem de importância.

## Modelagem Do Banco de Dados

Considerando os dados da livraria, vamos modelar a livraria com a seguinte especificação:

![alt text](livraria.drawio.png)

Acima, além de criar as tabelas entidade Publishers, Books e Authors, também criamos a tabela relacional BooksAuthors para representar a relação de muitos para muito entre livros e autores. Nesta tabela, além das chaves estrangeiras relacionando livros e autores, temos o elemento `seq_no` representando a ordem de importancia do autor na obra.

### Populando um Banco de Dados Usando `mysql`

Vamos então colocar em prática: criar as tabelas no `mysql` e popular com alguns dados

**Importante:** Coloque as tabelas na **mesma ordem** que aparece aqui (Publishers, Authors, Books, BooksAuthors)

###### Publishers
```sql
CREATE TABLE Publishers (
  publisher_id int NOT NULL AUTO_INCREMENT, 
  name CHAR(255) NOT NULL, 
  url CHAR(255), 
  PRIMARY KEY (publisher_id)
);
INSERT INTO Publishers VALUES (201, 'Addison-Wesley', 'www.aw-bc.com');
INSERT INTO Publishers VALUES (471, 'John Wiley & Sons', 'www.wiley.com');
INSERT INTO Publishers VALUES (262, 'MIT Press', 'mitpress.mit.edu');
INSERT INTO Publishers VALUES (596, 'O''Reilly', 'www.ora.com');
INSERT INTO Publishers VALUES (19, 'Oxford University Press', 'www.oup.co.uk');
INSERT INTO Publishers VALUES (13, 'Prentice Hall', 'www.phptr.com');
INSERT INTO Publishers VALUES (679, 'Random House', 'www.randomhouse.com');
INSERT INTO Publishers VALUES (7434, 'Simon & Schuster', 'www.simonsays.com');
SELECT * FROM Publishers;
```

###### Authors
```sql
CREATE TABLE Authors (
  author_id int NOT NULL AUTO_INCREMENT, 
  name CHAR(255) NOT NULL, 
  fname CHAR(255), 
  PRIMARY KEY (author_id)
);
INSERT INTO Authors VALUES (5698, 'Alexander', 'Christopher');
INSERT INTO Authors VALUES (6299, 'Brooks', 'Frederick P.');
INSERT INTO Authors VALUES (7927, 'Cormen', 'Thomas H.');
INSERT INTO Authors VALUES (8549, 'Date', 'C. J.');
INSERT INTO Authors VALUES (8527, 'Darwen', 'Hugh');
INSERT INTO Authors VALUES (938, 'Feiner', 'Steven K.');
INSERT INTO Authors VALUES (658, 'Flanagan', 'David');
INSERT INTO Authors VALUES (969, 'Foley', 'James D.');
INSERT INTO Authors VALUES (1577, 'Gamma', 'Erich');
INSERT INTO Authors VALUES (1520, 'Garfinkel', 'Simson');
INSERT INTO Authors VALUES (2938, 'Hein', 'Trent R.');
INSERT INTO Authors VALUES (2967, 'Helm', 'Richard');
INSERT INTO Authors VALUES (2907, 'Hopcroft', 'John E.');
INSERT INTO Authors VALUES (2512, 'Hughes', 'John F.');
INSERT INTO Authors VALUES (3323, 'Ishikawa', 'Sara');
INSERT INTO Authors VALUES (4928, 'Johnson', 'Ralph');
INSERT INTO Authors VALUES (5528, 'Kahn', 'David');
INSERT INTO Authors VALUES (5928, 'Kernighan', 'Brian');
INSERT INTO Authors VALUES (5388, 'Kidder', 'Tracy');
INSERT INTO Authors VALUES (5854, 'Knuth', 'Donald E.');
INSERT INTO Authors VALUES (6933, 'Leiserson', 'Charles E.');
INSERT INTO Authors VALUES (7947, 'Motwani', 'Rajeev');
INSERT INTO Authors VALUES (8979, 'Nemeth', 'Evi');
INSERT INTO Authors VALUES (2597, 'Raymond', 'Eric');
INSERT INTO Authors VALUES (2347, 'Ritchie', 'Dennis');
INSERT INTO Authors VALUES (2369, 'Rivest', 'Ronald R.');
INSERT INTO Authors VALUES (3728, 'Schneier', 'Bruce');
INSERT INTO Authors VALUES (3996, 'Seebass', 'Scott');
INSERT INTO Authors VALUES (3366, 'Silverstein', 'Murray');
INSERT INTO Authors VALUES (3898, 'Snyder', 'Garth');
INSERT INTO Authors VALUES (3493, 'Stein', 'Clifford E.');
INSERT INTO Authors VALUES (3496, 'Stoll', 'Clifford');
INSERT INTO Authors VALUES (3425, 'Strassmann', 'Steven');
INSERT INTO Authors VALUES (3429, 'Stroustrup', 'Bjarne');
INSERT INTO Authors VALUES (5667, 'Ullman', 'Jeffrey D.');
INSERT INTO Authors VALUES (6588, 'van Dam', 'Andries');
INSERT INTO Authors VALUES (6633, 'Vlissides', 'John');
INSERT INTO Authors VALUES (7933, 'Weise', 'Daniel');
SELECT * FROM Authors;
```
###### Books
```sql
CREATE TABLE Books (
  title CHAR(60) NOT NULL, 
  isbn CHAR(13) NOT NULL, 
  publisher_id INT NOT NULL, 
  price DECIMAL(10,2),
  PRIMARY KEY (isbn), 
  FOREIGN KEY (publisher_id) REFERENCES Publishers (publisher_id)
);
INSERT INTO Books VALUES ('A Guide to the SQL Standard', '0-201-96426-0', 201, 47.95);
INSERT INTO Books VALUES ('A Pattern Language: Towns, Buildings, Construction', '0-19-501919-9', 19, 65.00);
INSERT INTO Books VALUES ('Applied Cryptography', '0-471-11709-9', 471, 60.00);
INSERT INTO Books VALUES ('Computer Graphics: Principles and Practice', '0-201-84840-6', 201, 79.99);
INSERT INTO Books VALUES ('Cuckoo''s Egg', '0-7434-1146-3', 7434, 13.95);
INSERT INTO Books VALUES ('Design Patterns', '0-201-63361-2', 201, 54.99);
INSERT INTO Books VALUES ('Introduction to Algorithms', '0-262-03293-7', 262, 80.00);
INSERT INTO Books VALUES ('Introduction to Automata Theory, Languages, and Computation', '0-201-44124-1', 201, 105.00);
INSERT INTO Books VALUES ('JavaScript: The Definitive Guide', '0-596-00048-0', 596, 44.95);
INSERT INTO Books VALUES ('The Art of Computer Programming vol. 1', '0-201-89683-4', 201, 59.99);
INSERT INTO Books VALUES ('The Art of Computer Programming vol. 2', '0-201-89684-2', 201, 59.99);
INSERT INTO Books VALUES ('The Art of Computer Programming vol. 3', '0-201-89685-0', 201, 59.99);
INSERT INTO Books VALUES ('The C Programming Language', '0-13-110362-8', 13, 42.00);
INSERT INTO Books VALUES ('The C++ Programming Language', '0-201-70073-5', 201, 64.99);
INSERT INTO Books VALUES ('The Cathedral and the Bazaar', '0-596-00108-8', 596, 16.95);
INSERT INTO Books VALUES ('The Codebreakers', '0-684-83130-9', 7434, 70.00);
INSERT INTO Books VALUES ('The Mythical Man-Month', '0-201-83595-9', 201, 29.95);
INSERT INTO Books VALUES ('The Soul of a New Machine', '0-679-60261-5', 679, 18.95);
INSERT INTO Books VALUES ('The UNIX Hater''s Handbook', '1-56884-203-1', 471, 16.95);
INSERT INTO Books VALUES ('UNIX System Administration Handbook', '0-13-020601-6', 13, 68.00);
SELECT * FROM Books;
```
###### BooksAuthors
```sql
CREATE TABLE BooksAuthors (
  isbn CHAR(13) NOT NULL, 
  author_id INT NOT NULL, 
  seq_no INT,
  FOREIGN KEY (isbn) REFERENCES Books (isbn),
  FOREIGN KEY (author_id) REFERENCES Authors (author_id),
  PRIMARY KEY (isbn, author_id)
);
INSERT INTO BooksAuthors VALUES ('0-201-96426-0', 8549, 1);
INSERT INTO BooksAuthors VALUES ('0-201-96426-0', 8527, 2);
INSERT INTO BooksAuthors VALUES ('0-19-501919-9', 5698, 1);
INSERT INTO BooksAuthors VALUES ('0-19-501919-9', 3323, 2);
INSERT INTO BooksAuthors VALUES ('0-19-501919-9', 3366, 3);
INSERT INTO BooksAuthors VALUES ('0-471-11709-9', 3728, 1);
INSERT INTO BooksAuthors VALUES ('0-201-84840-6', 969, 1);
INSERT INTO BooksAuthors VALUES ('0-201-84840-6', 6588, 2);
INSERT INTO BooksAuthors VALUES ('0-201-84840-6', 938, 3);
INSERT INTO BooksAuthors VALUES ('0-201-84840-6', 2512, 4);
INSERT INTO BooksAuthors VALUES ('0-7434-1146-3', 3496, 1);
INSERT INTO BooksAuthors VALUES ('0-201-63361-2', 1577, 1);
INSERT INTO BooksAuthors VALUES ('0-201-63361-2', 2967, 2);
INSERT INTO BooksAuthors VALUES ('0-201-63361-2', 4928, 3);
INSERT INTO BooksAuthors VALUES ('0-201-63361-2', 6633, 4);
INSERT INTO BooksAuthors VALUES ('0-262-03293-7', 7927, 1);
INSERT INTO BooksAuthors VALUES ('0-262-03293-7', 6933, 2);
INSERT INTO BooksAuthors VALUES ('0-262-03293-7', 2369, 3);
INSERT INTO BooksAuthors VALUES ('0-262-03293-7', 3493, 4);
INSERT INTO BooksAuthors VALUES ('0-201-44124-1', 2907, 1);
INSERT INTO BooksAuthors VALUES ('0-201-44124-1', 5667, 2);
INSERT INTO BooksAuthors VALUES ('0-201-44124-1', 7947, 3);
INSERT INTO BooksAuthors VALUES ('0-596-00048-0', 658, 1);
INSERT INTO BooksAuthors VALUES ('0-201-89683-4', 5854, 1);
INSERT INTO BooksAuthors VALUES ('0-201-89684-2', 5854, 1);
INSERT INTO BooksAuthors VALUES ('0-201-89685-0', 5854, 1);
INSERT INTO BooksAuthors VALUES ('0-13-110362-8', 5928, 1);
INSERT INTO BooksAuthors VALUES ('0-13-110362-8', 2347, 2);
INSERT INTO BooksAuthors VALUES ('0-201-70073-5', 3429, 1);
INSERT INTO BooksAuthors VALUES ('0-596-00108-8', 2597, 1);
INSERT INTO BooksAuthors VALUES ('0-684-83130-9', 5528, 1);
INSERT INTO BooksAuthors VALUES ('0-201-83595-9', 6299, 1);
INSERT INTO BooksAuthors VALUES ('0-679-60261-5', 5388, 1);
INSERT INTO BooksAuthors VALUES ('1-56884-203-1', 1520, 1);
INSERT INTO BooksAuthors VALUES ('1-56884-203-1', 7933, 2);
INSERT INTO BooksAuthors VALUES ('1-56884-203-1', 3425, 3);
INSERT INTO BooksAuthors VALUES ('0-13-020601-6', 8979, 1);
INSERT INTO BooksAuthors VALUES ('0-13-020601-6', 3898, 2);
INSERT INTO BooksAuthors VALUES ('0-13-020601-6', 3996, 3);
INSERT INTO BooksAuthors VALUES ('0-13-020601-6', 2938, 4);
SELECT * FROM BooksAuthors;
```

### Comandos Importantes em um Banco de Dados Relacional

Nesta seção vamos falar de um comando importante para tabelas relacionais, **inner join**

Suponha que queremos selecionar todos os autores de um certo livro.

Neste caso temos que considerar 3 tabelas, duas entidades, a de livros e a de autores, e uma relacional a `BooksAuthors`

```sql
SELECT books.title, authors.name, authors.fname, booksauthors.seq_no 
FROM books 
INNER JOIN booksauthors ON booksauthors.isbn=books.isbn 
INNER JOIN authors ON booksauthors.author_id=authors.author_id 
WHERE books.isbn = @ISBN 
ORDER BY booksauthors.seq_no;
```

Onde `@ISBN` é o isbn do livro específico que queremos listar os autores.

Então queremos pegar os dados de uma tabela que é interseção das tabelas
- `books` com `booksauthors` em `booksauthors.isbn=books.isbn`
- o resultado da anterior com `authors` em `booksauthors.author_id=authors.author_id`
- filtrando um `books.isbn` específico,
- ordenado por `booksauthors.seq_no`, que representa a importância do autor na obra.

#### Passando o Comando para o Código

Na função abaixo, em `C#`, recebemos uma `string` com o isbn de um livro e criamos uma lista com todos os autores deste livro:

```cs
private List<Autor> getAutoresByIsbn(string isbn) {
    
    List<Autor> autores = new List<Autor>();

    try {
        String connStr = "Server=localhost;Uid=root;Pwd=;database=livraria_v1";
        using (MySqlConnection conn = new MySqlConnection(connStr)) {
            conn.Open();
            using (MySqlCommand cmd = conn.CreateCommand()) {
                cmd.CommandText = 
                    "SELECT books.title, authors.name, authors.fname, booksauthors.seq_no " +
                    "FROM books " +
                    "INNER JOIN booksauthors ON booksauthors.isbn=books.isbn " +
                    "INNER JOIN authors ON booksauthors.author_id=authors.author_id " +
                    "WHERE books.isbn = @ISBN " +
                    "ORDER BY booksauthors.seq_no;";
                cmd.Parameters.AddWithValue("ISBN", isbn);
                using (MySqlDataReader reader = cmd.ExecuteReader()) {
                    while (reader.Read()) {
                        String title = reader.GetString(reader.GetOrdinal("title"));
                        String fname = reader.GetString(reader.GetOrdinal("fname"));
                        String name = reader.GetString(reader.GetOrdinal("name"));
                        int seq_no = reader.GetInt16(reader.GetOrdinal("seq_no"));
                        Autor autor = new Autor {
                            Nome = name,
                            SobreNome = fname,
                        };
                        autores.Add(autor);
                    }
                }
            }
        }
    }
    catch (Exception ex) {
        MessageBox.Show(ex.ToString());
    }


    return autores;
}
```

## Um Programa Completo

Agora vamos fazer um programa completo que lista livros baseados em uma busca, e mostra informação de um livro específico quando este for clicado:

###### Livros.cs
```cs
internal class Livro {
    public string Titulo { get; set; }
    public string ISBN { get; set; }
    public Editora Editora { get; set; }
    public List<Autor> Autores { get; set; }
    public Decimal Preco {  get; set; }
    public Livro() { 
        Autores = new List<Autor>();
    }
    public override string ToString() {
        return Titulo;
    }
}
```

###### Autor.cs
```cs
internal class Autor {
    public int Id { get; set; }
    public string Nome { get; set; }
    public string SobreNome { get; set; }
    public override string ToString() {
        return Nome + " " + SobreNome;
    }
}
```

###### Editora.cs
```cs
internal class Editora {
    int Id { get; set; }
    string Nome { get; set; }
    string Url { get; set; }
}
```

###### MainWindow.xaml.cs
```cs
public partial class MainWindow : Window {
    List<Livro> livros = new List<Livro>();
    List<Autor> autores = new List<Autor>();
    public MainWindow() {
        InitializeComponent();
        ListBoxLivros.ItemsSource = livros;
        ListBoxAutores.ItemsSource = autores;
    }

    private void OnBotaoBuscaClicked(object sender, RoutedEventArgs e) {
        livros.Clear();
        foreach (var livro in searchLivros(FieldBusca.Text)) {
            livros.Add(livro);
        }
        ListBoxLivros.Items.Refresh();
    }
    private List<Livro> searchLivros(String key) {
            List<Livro> livros = new List<Livro>();

            try {
                String connStr = "Server=localhost;Uid=root;Pwd=;database=livraria_v1";
                using (MySqlConnection conn = new MySqlConnection(connStr)) {
                    conn.Open();
                    using (MySqlCommand cmd = conn.CreateCommand()) {
                        cmd.CommandText = "SELECT * FROM Books WHERE LOWER(Title) LIKE LOWER(@KEY)";
                        cmd.Parameters.AddWithValue("KEY", "%" + key + "%");
                        using (MySqlDataReader reader = cmd.ExecuteReader()) {
                            while (reader.Read()) {
                                String isbn = reader.GetString(reader.GetOrdinal("isbn"));
                                String title = reader.GetString(reader.GetOrdinal("title"));
                                Decimal preco = reader.GetDecimal(reader.GetOrdinal("price"));
                                Livro livro = new Livro { 
                                    ISBN = isbn, 
                                    Titulo = title, 
                                    Preco = preco 
                                    };
                                livros.Add(livro);
                            }
                        }
                    }
                }
            }
            catch (Exception ex) {
                MessageBox.Show(ex.ToString());
            }


            return livros;
        }

    private void ListBoxLivros_SelectionChanged(object sender, System.Windows.Controls.SelectionChangedEventArgs e) {
        Livro livro = (Livro)ListBoxLivros.SelectedItem;
        if (livro == null) return;
        LivroTitulo.Text = "Título: " + livro.Titulo;
        LivroPreco.Text = "Preço: " + livro.Preco;
        autores.Clear();
        foreach (Autor autor in getAutoresByIsbn(livro.ISBN)) {
            autores.Add(autor);
        }
        ListBoxAutores.Items.Refresh();
    }
    private List<Autor> getAutoresByIsbn(string isbn) {
        
        List<Autor> autores = new List<Autor>();

        try {
            String connStr = "Server=localhost;Uid=root;Pwd=;database=livraria_v1";
            using (MySqlConnection conn = new MySqlConnection(connStr)) {
                conn.Open();
                using (MySqlCommand cmd = conn.CreateCommand()) {
                    cmd.CommandText = 
                        "SELECT books.title, authors.name, authors.fname, booksauthors.seq_no " +
                        "FROM books " +
                        "INNER JOIN booksauthors ON booksauthors.isbn=books.isbn " +
                        "INNER JOIN authors ON booksauthors.author_id=authors.author_id " +
                        "WHERE books.isbn = @ISBN " +
                        "ORDER BY booksauthors.seq_no;";
                    cmd.Parameters.AddWithValue("ISBN", isbn);
                    using (MySqlDataReader reader = cmd.ExecuteReader()) {
                        while (reader.Read()) {
                            String title = reader.GetString(reader.GetOrdinal("title"));
                            String fname = reader.GetString(reader.GetOrdinal("fname"));
                            String name = reader.GetString(reader.GetOrdinal("name"));
                            int seq_no = reader.GetInt16(reader.GetOrdinal("seq_no"));
                            Autor autor = new Autor {
                                Nome = name,
                                SobreNome = fname,
                            };
                            autores.Add(autor);
                        }
                    }
                }
            }
        }
        catch (Exception ex) {
            MessageBox.Show(ex.ToString());
        }


        return autores;
    }
}
```

###### MainWindow.xaml
```cs
    <Grid>
        <Grid.ColumnDefinitions>
            <ColumnDefinition Width="10"/>
            <ColumnDefinition Width="1*"/>
            <ColumnDefinition Width="10"/>
        </Grid.ColumnDefinitions>
        <Grid.RowDefinitions>
            <RowDefinition Height="10"/>
            <RowDefinition Height="25"/>
            <RowDefinition Height="10"/>
            <RowDefinition Height="25"/>
            <RowDefinition Height="10"/>
            <RowDefinition Height="1*"/>
            <RowDefinition Height="10"/>
            <RowDefinition Height="1*"/>
            <RowDefinition Height="10"/>
            <RowDefinition Height="Auto"/>
            <RowDefinition Height="10"/>
        </Grid.RowDefinitions>

        <TextBox Name="FieldBusca" Text="unix"
                 Grid.Row="1" Grid.Column="1"/>
        
        <Button Name="BotaoBusca"
                Content="Buscar"
                Click="OnBotaoBuscaClicked"
                Grid.Row="3" Grid.Column="1"/>

        <ListBox x:Name="ListBoxLivros" SelectionMode="Single"
                 SelectionChanged="ListBoxLivros_SelectionChanged"
                 Grid.Row="5" Grid.Column="1">
            <ListBox.ItemTemplate>
                <DataTemplate>
                    <StackPanel>
                        <TextBlock Text="{Binding ISBN, StringFormat='ISBN: {0}'}"/>
                        <TextBlock Text="{Binding Titulo, StringFormat='Titulo: {0}'}"/>
                        <TextBlock Text="{Binding Preco, StringFormat='Preco: {0}'}"/>
                    </StackPanel>
                </DataTemplate>
            </ListBox.ItemTemplate>
        </ListBox>

        <Grid
            Grid.Row="7" Grid.Column="1">
            <Grid.ColumnDefinitions>
                <ColumnDefinition Width="10"/>
                <ColumnDefinition Width="1*"/>
                <ColumnDefinition Width="10"/>
                <ColumnDefinition Width="1*"/>
                <ColumnDefinition Width="10"/>
            </Grid.ColumnDefinitions>
            <Grid.RowDefinitions>
                <RowDefinition Height="10"/>
                <RowDefinition Height="1*"/>
                <RowDefinition Height="10"/>
            </Grid.RowDefinitions>
            <StackPanel Orientation="Vertical"
                Grid.Row="1" Grid.Column="1">
                <TextBlock x:Name="LivroTitulo"/>
                <TextBlock x:Name="LivroPreco"/>
            </StackPanel>
            <ListBox x:Name="ListBoxAutores" SelectionMode="Extended"
                 Grid.Row="1" Grid.Column="3">
            </ListBox>
        </Grid>
    </Grid>
```

