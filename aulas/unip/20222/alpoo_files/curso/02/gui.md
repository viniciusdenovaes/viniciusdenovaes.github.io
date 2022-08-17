# Interface de Usuário (Graphical User Interface (GUI))(**EM CONSTRUÇÃO**)

Interface de Usuário (em inglês *Graphical User Interface* ou GUI) é a parte do programa que vai aparecer para o usuário final, afim de que ele interaja com o seu programa.

No nosso caso será uma janela.

## Opção 1: Usar o Netbeans

Você pode fazer essa janela usando a IDE [Netbeans](https://netbeans.apache.org/). No Netbeans você precisa apenas escolher o que colocar na sua interface e "arrastar e colar" os componentes em uma janela. Mas, mesmo **para usar o tutorial do Netbeans**,
 - **você precisa saber sobre:**
    - Janela (`JFrame`)
    - Componentes e Containers
    - Listeners
 - você **não** precisa saber sobre:
    - Layouts

Tutoriais do Netbeans estão disponíveis nas páginas oficiais:

 - Em pt-br:
   - [Introdução](https://netbeans.apache.org/kb/docs/java/quickstart-gui_pt_BR.html)
   - [Exemplos práticos](https://netbeans.apache.org/kb/docs/java/gui-functionality_pt_BR.html)
 - Em inglês:
   - [Introdução](https://netbeans.apache.org/kb/docs/java/quickstart-gui.html)
   - [Exemplos práticos](https://netbeans.apache.org/kb/docs/java/gui-functionality.html)








## Opção 2: Fazer direto pelo código

Usando `swing` e `awt`, você tem a opção de criar uma interface escrevendo linhas de código em java.

Vamos ver a seguir tudo o que você precisa fazer para criar uma interface inicial, notando esta aula não abrange todas as possibilidades do você poderia fazer usando `swing` e `awt`.

### Janela

A janela é o container que conterá todos os elementos da sua interface gráfica.

Para fazer uma janela você deve se preocupar, no mínimo, com:
 - O tamanho da janela
 - O comportamento da janela quando o botão para fechar é pressionado
 - Tornar a janela visível.

A classe que usaremos para fazer uma janela é a `JFrame`

### Como configurar o tamanho

Para configurar o tamanho e localização da janela os seguintes métodos podem ser usados:
 - `void setSize(int width, int height)`: Configura o tamanho da janela
 - `void setLocation(int x, int y)`: Configura a localização em que a janela aparece
 - `void setBounds(int x, int y, int width, int height)` Configura ao mesmo tempo a localização e o tamanho
 - `Dimension getSize()`: Retorna o tamanho da janela
 - `void pack()`: Configura o tamanho da janela para que tudo o que ela contém fique em seu tamanho "preferido".

### Como configurar o comportamento de fechar

Uma das maneira de configurar o comportamento da janela quando o botão de fechar é clicado é através do método `setDefaultCloseOperation(int operation);`, a operação especificada pode ser uma entre:
 - `JFrame.EXIT_ON_CLOSE`: Termina o programa
 - `JFrame.HIDE_ON_CLOSE`: Esconde a janela, porém o programa continua funcionando (é a opção padrão)
 - `JFrame.DISPOSE_ON_CLOSE`: Destrói a janela, caso todas janela sejam destruídas o programa termina
 - `JFrame.DO_NOTHING_ON_CLOSE`: Ignora o botão de fechar

Existem outas formas mais interessantes de configurar o comportamento usando `WindowListener`, sendo possível chamar qualquer método quando o usuário tentar fechar a janela.

### Como tornar a janela visível

Para tornar a janela visível basta usar o método `setVisible(true)`


### Layout

### Componentes















.
