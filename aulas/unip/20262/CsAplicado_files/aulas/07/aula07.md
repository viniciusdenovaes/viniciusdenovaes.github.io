# ListBox - Como Exibir uma Lista de Dados

A maior parte dos dados são formados por uma coleção de dados do mesmo tipo.

Nesta aula vamos aprender a exibir uma lista de dados para o usuário e também permitir ao usuário interagir.

### Parte 1 Mostrando uma Lista de Dados

Primeiro vamos definir o tipo de dado que aparecerá na lista.

Vamos implementar a classe Pessoa

```cs
namespace WpfAppListBoxTest {
    public class Pessoa {
        public Pessoa(string aNome, int aIdade) { 
            this.Nome = aNome;
            this.Idade = aIdade;
        }
        public string Nome { get; set; }
        public int Idade { get; set; }

        public override string ToString() {
            return $"Nome: {Nome}, Idade: {Idade}";
        }
    }
}
```

No `xaml` vamos criar uma lista dentro do `grid`

```xml
    <Grid>
        <Grid.ColumnDefinitions>
            <ColumnDefinition Width="10"/>
            <ColumnDefinition Width="1*"/>
            <ColumnDefinition Width="10"/>
        </Grid.ColumnDefinitions>
        <Grid.RowDefinitions>
            <RowDefinition Height="10"/>
            <RowDefinition Height="1*"/>
            <RowDefinition Height="10"/>
            <RowDefinition Height="Auto"/>
            <RowDefinition Height="10"/>
        </Grid.RowDefinitions>

        <ListBox x:Name="ListBoxPessoas"
                 Grid.Row="1" Grid.Column="1">
        </ListBox>

    </Grid>
```

Agora no `C#` vamos ligar a lista chamada `ListBoxPessoas` com uma lista populada por objetos da classe `Pessoa`

```cs
    public partial class MainWindow : Window {

        public List<Pessoa> Pessoas = new List<Pessoa>() {
            new Pessoa("Ana", 21 ),
            new Pessoa("Beto", 22 ),
            new Pessoa("Carla", 23 ),
            new Pessoa("Davi", 24 ),
        };

        public MainWindow() {
            InitializeComponent();
            // Aqui definimos como fonte da ListBox
            //   da lista pessoas
            ListBoxPessoas.ItemsSource = Pessoas;
        }

    }
```


### Parte 2 Escolhendo um Item

Agora vamos interagir com a lista escolhendo um dos itens.

A ideia do próximo programa é que vamos selecionar um item e passar o item selecionado para o código `C#`.

Para isto vamos criar um botão, que depois de pressionado irá criar uma `MessageBox` mostrando o item selecionado.

Modifique a interface para termos um botão:

```xml
    <Grid>
        <Grid.ColumnDefinitions>
            <ColumnDefinition Width="10"/>
            <ColumnDefinition Width="1*"/>
            <ColumnDefinition Width="10"/>
        </Grid.ColumnDefinitions>
        <Grid.RowDefinitions>
            <RowDefinition Height="10"/>
            <RowDefinition Height="1*"/>
            <RowDefinition Height="10"/>
            <RowDefinition Height="Auto"/>
            <RowDefinition Height="10"/>
        </Grid.RowDefinitions>

        <ListBox x:Name="ListBoxPessoas"
                 Grid.Row="1" Grid.Column="1">
        </ListBox>

        <Button Content="Aperte" Click="OnMostrarClicked"
                Grid.Column="1" Grid.Row="3"/>

    </Grid>
```

Agora vamos implementar a função do botão

```cs
    public partial class MainWindow : Window {

        public List<Pessoa> Pessoas = new List<Pessoa>() {
            new Pessoa("Ana", 21 ),
            new Pessoa("Beto", 22 ),
            new Pessoa("Carla", 23 ),
            new Pessoa("Davi", 24 ),
        };

        public MainWindow() {
            InitializeComponent();
            ListBoxPessoas.ItemsSource = Pessoas;
        }

        private void OnMostrarClicked(object sender, RoutedEventArgs e) {
            // Esta linha pega o objeto selecionado
            Pessoa p = (Pessoa)ListBoxPessoas.SelectedItem;
            if(p != null)
                MessageBox.Show(p.ToString());
            else
                MessageBox.Show("Selecione um item");
        }
    }
```


### Parte 2.1 Escolhendo Múltiplos Itens

Existe também a opção de escolher mais de um item na lista.

Teremos que modificar o código do `xaml` para que seja possível escolher mais de um item na lista, basta adicionar a propriedade `SelectionMode="Multiple"` na `ListBox`

```xml
    <Grid>
        <Grid.ColumnDefinitions>
            <ColumnDefinition Width="10"/>
            <ColumnDefinition Width="1*"/>
            <ColumnDefinition Width="10"/>
        </Grid.ColumnDefinitions>
        <Grid.RowDefinitions>
            <RowDefinition Height="10"/>
            <RowDefinition Height="1*"/>
            <RowDefinition Height="10"/>
            <RowDefinition Height="Auto"/>
            <RowDefinition Height="10"/>
        </Grid.RowDefinitions>

        <ListBox x:Name="ListBoxPessoas" SelectionMode="Multiple"
                 Grid.Row="1" Grid.Column="1">
        </ListBox>

        <Button Content="Aperte" Click="OnMostrarClicked"
                Grid.Column="1" Grid.Row="3"/>

    </Grid>
```

Agora ao invés de usar `ListBoxPessoas.SelectedItem` usaremos `ListBoxPessoas.SelectedItems` que retorna uma lista de objetos.

```cs
    public partial class MainWindow : Window {

        public List<Pessoa> Pessoas = new List<Pessoa>() {
            new Pessoa("Ana", 21 ),
            new Pessoa("Beto", 22 ),
            new Pessoa("Carla", 23 ),
            new Pessoa("Davi", 24 ),
        };

        public MainWindow() {
            InitializeComponent();
            ListBoxPessoas.ItemsSource = Pessoas;
        }

        private void OnMostrarClicked(object sender, RoutedEventArgs e) {
            IList selectedItens = ListBoxPessoas.SelectedItems;
            foreach (Pessoa person in selectedItens) {
                MessageBox.Show(person.ToString());
            }
        }
    }
```


### Parte 3 Configurando Como Os Objetos Aparecem Na Lista

Usar o método `ToString` serve apenas para o desenvolvedor debugar o programa, não é para mostrar para o usuário.

Vamos aprender a mostrar o objeto `Pessoa` de uma forma mais bonita para o usuário final.

Na `ListBox` vamos configurar como cada item deve aparecer, isto deve ser feito dentro de um `DataTemplate` que estará dentro de um `ListBox.ItemTemplate`.

Dentro do `DataTemplate` podemos fazer um layout com `TextBlock` fazendo o bind dos atributos dos objetos.

```xml
    <Grid>
        <Grid.ColumnDefinitions>
            <ColumnDefinition Width="10"/>
            <ColumnDefinition Width="1*"/>
            <ColumnDefinition Width="10"/>
        </Grid.ColumnDefinitions>
        <Grid.RowDefinitions>
            <RowDefinition Height="10"/>
            <RowDefinition Height="1*"/>
            <RowDefinition Height="10"/>
            <RowDefinition Height="Auto"/>
            <RowDefinition Height="10"/>
        </Grid.RowDefinitions>

        <ListBox x:Name="ListBoxPessoas" SelectionMode="Multiple"
                 Grid.Row="1" Grid.Column="1">
            <ListBox.ItemTemplate>
                <DataTemplate>
                    <StackPanel>
                        <TextBlock Text="{Binding Nome, StringFormat='Nome: {0}'}"/>
                        <TextBlock Text="{Binding Idade, StringFormat='Idade: {0}'}"/>
                    </StackPanel>
                </DataTemplate>
            </ListBox.ItemTemplate>
        </ListBox>

        <Button Content="Aperte" Click="OnMostrarClicked"
                Grid.Column="1" Grid.Row="3"/>

    </Grid>
```

