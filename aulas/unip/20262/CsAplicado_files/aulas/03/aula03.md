# Usando Entrada e Saída

Nesta aula vamos ver um exemplo minimalista de um programa que recebe uma entrada de usuário e mostrar uma resposta.

Vamos fazer um campo de texto em que o usuário pode escrever um texto e este texto será copiado para um outro elemento.

Para a entrada vamos usar o elemento `TextBox`, e para a saída vamos usar o `Label`.

Visualmente não precisamos fazer nenhuma configuração nestes elementos, apenas criar as tags no XAML com seus respectivos nomes. 

```xml
        <TextBox Name="TextEntrada" HorizontalAlignment="Left" Grid.Row="1" Grid.Column="2" MinWidth="100"/>
        <Label Name="TextSaida" HorizontalAlignment="Left" Grid.Row="3" Grid.Column="2"/>
``` 

No código em `C#` precisaremos:
1. Pegar o texto entrado no `TextBox` usando o parâmetro `Text`
1. Copiar este texto para o `Label` usando o parâmetro `Content`

Veja no exemplo abaixo o código completo para o programa.

###### MainWindow.xaml
```xml
    <Grid>
        <Grid.ColumnDefinitions>
            <ColumnDefinition Width="10" />
            <ColumnDefinition Width="Auto" />
            <ColumnDefinition Width="Auto" />
            <ColumnDefinition Width="*" />
            <ColumnDefinition Width="10" />
        </Grid.ColumnDefinitions>
        <Grid.RowDefinitions>
            <RowDefinition Height="10" />
            <RowDefinition Height="Auto" />
            <RowDefinition Height="Auto" />
            <RowDefinition Height="Auto" />
            <RowDefinition Height="*" />
            <RowDefinition Height="10" />
        </Grid.RowDefinitions>

        <Label Content="Entrada:" HorizontalAlignment="Right" Grid.Row="1" Grid.Column="1"/>
        <Button Content="Aperte" Grid.Row="2" Grid.Column="1" Grid.ColumnSpan="2" Click="OnEntrada"/>
        <Label Content="Saída:" HorizontalAlignment="Right" Grid.Row="3" Grid.Column="1"/>

        <TextBox Name="TextEntrada" HorizontalAlignment="Left" Grid.Row="1" Grid.Column="2" MinWidth="100"/>
        <Label Name="TextSaida" HorizontalAlignment="Left" Grid.Row="3" Grid.Column="2"/>
    </Grid>

```

###### MainWindow.xaml.cs

```cs
    public partial class MainWindow : Window {
        TextBox fieldEntrada;
        Label labelSaida;
        public MainWindow() {
            InitializeComponent();
            fieldEntrada = (TextBox)FindName("TextEntrada");
            labelSaida = (Label)FindName("TextSaida");
        }

        private void OnEntrada(object sender, EventArgs e) { 
            String textoEntrada = fieldEntrada.Text;
            labelSaida.Content = textoEntrada;
        }
    }
```

## Exercícios

1. Faça um programa que recebe uma palavra e tenha um botão que copia a palavra para outro campo. Mas quando a palavra for copiada, a palavra original é apagada.

1. Faça um programa que recebe uma palavra e tenha um botão que copia a palavra para outro campo. E tenha um outro botão que apaga todos os campos.

1. Faça um programa que recebe uma palavra e reescreve esta palavra ao contrário

1. Faça um programa que recebe dois números inteiros e escreve a soma dos números.

Dica: Lembre-se de converter o número de entrada para inteiro.

