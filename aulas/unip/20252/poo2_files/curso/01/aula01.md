# Windows Presentation Foundation (WPF)

WPF é uma ferramenta do Windows para fazer uma interface com o usuário final no Windows. Mas atenção, só funciona no Windows, não funciona no linux nem mac.

Em WPF temos duas linguagens que funcionam em conjunto:
 - `C#`: linguagem de programação orientada a objetos que define o **funcionamento** do programa.
 - `XAML`: Linguagem de marcação com o padrão `XML` que define a parte visual do programa.

| WPF         | Funcionalidade | Tipo de Linguagem | Paradigma |
| -------- | ------- | ---| --- |
| `C#`  | define o **funcionamento** do programa    | linguagem de programação | Orientada a objetos |
| `XAML` | define a parte visual do programa | Linguagem de marcação | padrão `XML` |

## Fazendo um programa

Vamos fazer um programa minimalista para aprender na prática.

### Criando um Projeto

Usando a IDE Visual Studio 2022, crie um projeto usando o template **"WPF App (.NET Framework)"** em `C#`.

Dentro da janela de soluções teremos dois arquivos de interesse com um código inicial:

###### MainWindow.xaml
```xml
<Window x:Class="WpfAppUnip01.MainWindow"
        xmlns="http://schemas.microsoft.com/winfx/2006/xaml/presentation"
        xmlns:x="http://schemas.microsoft.com/winfx/2006/xaml"
        xmlns:d="http://schemas.microsoft.com/expression/blend/2008"
        xmlns:mc="http://schemas.openxmlformats.org/markup-compatibility/2006"
        xmlns:local="clr-namespace:WpfAppUnip01"
        mc:Ignorable="d"
        Title="MainWindow" Height="450" Width="800">
    <Grid>
        
    </Grid>
</Window>
```


###### MainWindow.xaml.cs
```cs
namespace WpfAppUnip01 {
    public partial class MainWindow : Window {
        public MainWindow() {
            InitializeComponent();
        }
    }
}
```

### Criando um botão

Para criar um elemento devemos:
1. Criar este elemento no `XAML`
1. Dar um identificador para este elemento no `XAML`
1. Criar um objeto no `C#`
1. Ligar o objeto do `C#` com o botão do `XAML` através do identificador

Vamos fazer passo a passo.

##### Criar um botão no `XAML`

Dentro da *tag* `Grid` crie um elemento de `Button` com os atributos
 - `Name="botao"`: Define o identificador do botão, para ser ligado ao objeto criado em `C#`
 - `Content="Aperte"`: Define o texto escrito dentro do botão
 - `HorizontalAlignment="Center"` e `VerticalAlignment="Center"`: Centraliza o alinhamento do botão
 - `Click="OnClickAperte"`: Define a função que ocorrerá quando o botão for clicado.

Em resumo teremos a seguinte *tag* **no lugar** da *tag* `Grid`:

```xml
<Grid>
    <Button x:Name="botao" Content="Aperte" HorizontalAlignment="Center" VerticalAlignment="Center" Click="OnClickAperte"/>
</Grid>
```

##### Definir o funcionamento do botão no `C#`

Agora vamos definir o funcionamento do botão no `C#`

1. Crie uma variável do tipo `Button` como atributo da classe `MainWindow`
1. No contructor da classe faça com que a variável criada seja uma referência ao botão criado no `XAML`. Use o comando `button = (Button)FindName("botao");`
1. Defina o método com a assinatura `private void OnClickAperte(object sender, RoutedEventArgs e)`, este deve ter o mesmo nome que foi colocado no atributo `Click` do botão no `XAML`

Veja abaixo o código com os 3 comandos:

``` cs
using System.Windows;
using System.Windows.Controls;

namespace WpfAppUnip01 {
    public partial class MainWindow : Window {

        // Primeiro comando:
        //    Cria uma variavel do tipo Button
        Button button;

        public MainWindow() {
            InitializeComponent();
            // Segundo comando:
            //    Faz uma referencia deste Button para o Button do XAML
            button = (Button)FindName("botao");
        }

        // Terceiro comando:
        //    Cria um metodo com a assinatura private void (object sender, RoutedEventArgs e)
        //    e mesmo nome colocado no atributo Click do XAML
        private void OnClickAperte(object sender, RoutedEventArgs e) {
            MessageBox.Show("Botao pressionado");
        }
    }
}
```

## Exercícios

1. Faça um programa que contenha um botão centralizado em uma tela de tamanho 100x150. Quando o botão for pressionado deve aparecer uma caixa de mensagem escrito "botão pressionado"

Dica: Para escolher a dimensão inicial da tela mude os valores dos atributos `Height` e `Width` da tag `Window`

1. Faça um programa com um botão posicionado no canto inferior esquerdo da tela. Quando o botão for pressionado a janela deve ser fechada.

Dica: Para fechar a janela use o comando `this.Close()` 

