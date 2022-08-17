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

O primeiro elemento que você precisa criar é a janela.

A janela é o container que conterá todos os elementos da sua interface gráfica.

Para fazer uma janela você deve se preocupar, **no mínimo**, com:
 - O tamanho da janela (usando o método `pack()`)
 - O comportamento da janela quando o botão para fechar é pressionado (`setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE)`)
 - Tornar a janela visível (`setVisible(true)`).

A classe que usaremos para fazer uma janela é a `JFrame`

#### Como configurar o tamanho

Para configurar o tamanho e localização da janela **um** dos seguintes métodos podem ser usados:
 - (**RECOMENDADO**) `void pack()`: Configura o tamanho da janela para que tudo o que ela contém fique em seu tamanho "preferido".
 - `void setSize(int width, int height)`: Configura o tamanho da janela
 - `void setLocation(int x, int y)`: Configura a localização em que a janela aparece
 - `void setBounds(int x, int y, int width, int height)` Configura ao mesmo tempo a localização e o tamanho
 - `Dimension getSize()`: Retorna o tamanho da janela
 - `void pack()`: Configura o tamanho da janela para que tudo o que ela contém fique em seu tamanho "preferido".

#### Como configurar o comportamento de fechar

Uma das maneira de configurar o comportamento da janela quando o botão de fechar é clicado é através do método `setDefaultCloseOperation(int operation);`, a operação especificada pode ser uma entre:
 - `JFrame.EXIT_ON_CLOSE`: Termina o programa
 - `JFrame.HIDE_ON_CLOSE`: Esconde a janela, porém o programa continua funcionando (é a opção padrão)
 - `JFrame.DISPOSE_ON_CLOSE`: Destrói a janela, caso todas janela sejam destruídas o programa termina
 - `JFrame.DO_NOTHING_ON_CLOSE`: Ignora o botão de fechar

Existem outas formas mais interessantes de configurar o comportamento usando `WindowListener`, sendo possível chamar qualquer método quando o usuário tentar fechar a janela.

#### Como tornar a janela visível

Para tornar a janela visível basta usar o método `setVisible(true)`


### Layout

Depois de ter o seu primeiro container, você precisa escolher um layout, para este container e para cada container que você criar.

Esta parte é uma lista, não exaustiva, de alguns administradores de layouts que podem ser usados no Swing.

Esta parte é baseada no tutorial oficial da Oracle sobre layouts: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html

Para configurar o layout de um container você precisa usar o método do container `setLayout(LayoutManager)` com algumas variações.

O layout padrão de um `JFrame` é o `BorderLayout`, o do `JPanel` é o `FlowLayout`. Mas, apesar de existir um padrão, é recomendável que **você sempre escolha o layout**.

#### [BorderLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/border.html)

O [BorderLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/border.html) organiza o layout do seu container em 5 partes, como visto na figura abaixo.

![](BorderLayoutDemo.png)

Para setar o layout use o método Container.setLayout(new BorderLayout())
 - Para inserir um `component` na parte **central** do container use o método `add(component, BorderLayout.CENTER)`
 - Para inserir um `component` na parte **norte** do container use o método `add(component, BorderLayout.PAGE_START)`
 - Para inserir um `component` na parte **sul** do container use o método `add(component, BorderLayout.PAGE_END)`
 - Para inserir um `component` na parte **leste** do container use o método `add(component, BorderLayout.LINE_START)`
 - Para inserir um `component` na parte **oeste** do container use o método `add(component, BorderLayout.LINE_END)`


Teremos também o seguinte constructor:

 - `BorderLayout(int horizontalGap, int verticalGap)`: Define gaps entre os componentes

Teremos também os seguintes métodos mais comuns:
 - `setHgap(int)`: Define um espaço horizontal entre os componentes
 - `setVgap(int)`: Define um espaço vertical entre os componentes




#### [FlowLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/flow.html)

O [FlowLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/flow.html) organiza os componentes da esquerda para a direita, de cima para baixo. Os componentes podem ainda ser centralizados (**CENTER**), alinhados à esquerda (**LEADING**) ou alinhados à direita (**TRAILING**).

Para configurar um container com o FlowLayout use o método `setLayout(new FlowLayout)`.

Para adicionar um `componente` no container use o método `add(componente)`

Teremos os seguintes constructors:

 - `FlowLayout()`: Define um FlowLayout com alinhamento central, horizontal e vertical gap de 5 pixels
 - `FlowLayout(int align)`: Define um FlowLayout com o alinhamento indicado, horizontal e vertical gap de 5 pixels. Os alinhamentos poderão ser:
  - `FlowLayout.CENTER`: Para um alinhamento centralizado
  - `FlowLayout.LEADING`: Para um alinhamento alinhado à esquerda
  - `FlowLayout.TRAILING`: Para um alinhamento alinhado à direita
 - `FlowLayout(int align, int hgap, int vgap)`: Define um FlowLayout com o alinhamento indicado; e horizontal e vertical gaps indicados por hgap e vgap respectivamente.




#### [BoxLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/box.html)

O [BoxLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/box.html) empilha componentes de cima para baixo (**PAGE_AXIS**) ou da esquerda para a direita (**LINE_AXIS**).
Além disso tem a opção de introduzir elementos invisíveis para complementar a sua interface.

Teremos **um** constructor:

 * `BoxLayout(Container target, int axis)`:	Define um BoxLayout no `Container target`; com direção da esquerda para a direita com `axis = BoxLayout.LINE_AXIS`, ou direção de cima para baixo com `axis = BoxLayout.PAGE_AXIS`.

Também temos a possibilidade de incluir elementos invisíveis para complementar a interface:

<table border="1" summary="Details about creating invisible components with Box or Box.Filler">
<caption align="bottom">Tabela retirada do <a href="https://docs.oracle.com/javase/tutorial/uiswing/layout/box.html">Tutorial da Oracle</a></caption>
  <tbody>
  	<tr>
  		<th>Tipo</th>
  		<th>Forma</th>
  		<th>Como Criar</th>
  	</tr>
  	<tr>
  		<td>rigid area</td>
  		<td>
  		<img src="7fill.gif" width="42" height="42"><br></td>
  		<td><code>Box.createRigidArea(size)</code></td>
  	</tr>
  	<tr>
  		<td>glue, horizontal</td>
  		<td>
  		<img src="9fill.gif" width="60" height="13"><br></td>
  		<td><code>Box.createHorizontalGlue()</code></td>
  	</tr>
  	<tr>
  		<td>glue, vertical</td>
  		<td>
  		<img src="8fill.gif" width="13" height="60"><br></td>
  		<td><code>Box.createVerticalGlue()</code></td>
  	</tr>
  </tbody>
</table>




#### [GridLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/grid.html)

O [GridLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/grid.html) organiza os componentes em forma de grade, da esquerda para a direita e de cima para baixo (nesta ordem).

No constructor deve ser dado a quantidade de linha e colunas que a interface deve ter.
Uma, mas não ambos valores podem ser zero, o que faz com que qualquer quantidade de objetos possam ser postos nesta linha ou coluna.

Os componentes incluídos terão todos o mesmo tamanho.

Teremos os seguintes constructors:

 - `GridLayout(int rows, int cols)`: A interface terá `rows` linhas e `cols` colunas;
 - `GridLayout(int rows, int cols, int hgap, int vgap)`: Teremos um espaço horizontal de `hgap` pixels e um espaço vertical de `vgap` pixels entre os elementos.







#### [GridBagLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html)

O [GridBagLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html) organiza os elementos em grade de uma forma mais flexível que o GridLayout.

Quando um elemento é adicionado ao container deve-se passar um GridBagConstrain com algumas configurações:

 - gridx, gridy: Especifica a linha e coluna que o componente irá se originar.
 - gridwidth, gridheight: Especifica o tamanho de linhas e colunas que o componente irá ocupar
 - fill: O componente irá preencher o espaço total da linha (`fill = GridBagConstraints.HORIZONTAL`), coluna (`fill = GridBagConstraints.VERTICAL`); ou ambos (`fill = GridBagConstraints.BOTH`).
 - ipadx, ipady: Adiciona tamanho ao componente
 - insets: Adiciona um espaço externo que o componente deve ocupar, o valor deve ser dado pelo objeto `new Insets(int top, int left, int bottom, int right)`
 - weightx, weighty: Especifica, comparativamente, o quanto o componente deve mudar de tamanho caso o tamanho da tela seja alterado, deve receber valores de 0.0 a 1.0.
 - anchor: Especifica on o componente deve se alinhar

<table summary="" cellpadding="10">
  <tbody>
    <tr>
      <td>FIRST_LINE_START</td>
      <td>PAGE_START</td>
      <td align="right">FIRST_LINE_END</td>
    </tr>
    <tr>
      <td>LINE_START</td>
      <td align="center">CENTER</td>
      <td align="right">LINE_END</td>
    </tr>
    <tr>
      <td>LAST_LINE_START</td>
      <td>PAGE_END</td>
      <td align="right">LAST_LINE_END</td>
    </tr>
  </tbody>
</table>









### Componentes

Esta parte é uma lista, não exaustiva, dos componentes que podemos colocar em um container.

Qualquer elemento que colocamos em uma interface é um componente.

Primeiro vamos estudar o que é um container

#### Containers

Todo componente precisa estar dentro de um container.

O container organiza automaticamente os componentes que estão inseridos dentro dele. Mas, para isso, você precisa definir:
 - O layout do container
 - O tamanho preferido de cada componente (não se preocupe, a maioria dos componentes já tem seus tamanhos preferidos definidos automaticamente)

Os containers que usaremos neste curso serão o `JFrame`, e o `JPanel`.

Cada programa pode conter várias janelas `JFrame`. Cada janela pode conter vários painéis `JPanel`. E cada painel também pode conter vários painéis.

Para adicionar um componente em um container usaremos o método `add(Component)` (o método `add` pode conter mais argumentos)

##### JPanel

Usaremos o container `JPanel` para organizar a interface.

Podemos imaginar o JPanel como quadrados onde organizaremos os componentes da nossa interface.

<!--É **preciso** que se use o método `setPreferedSize()` para todo conteúdo de um container que tem um gerenciador de layout definido.
Desta forma usaremos o método `setPreferedSize()` para definir o tamanho de um `JPanel`
-->

## Controles

### JButton

Um botão comum (pode ser clicado, e gera um evento quando clicado).

Teremos os seguintes constructors mais comuns:

 - `JButton()`: Um botão sem texto
 - `JButton(String text)`: Um botão com o texto `text`

Teremos os seguintes métodos mais comuns:

 - `void setText(String s)`
 - `String getText()`
 - `void setEnabled(boolean b)`: Configura se o usuário pode interagir com o botão
 - `void addActionListener(ActionListener a)`: Adiciona uma ação para quando o botão for clicado

### JLabel

Um componente que serve para mostrar um texto, uma imagem, ou ambos

Teremos os seguintes constructors mais comuns:

 - `JLabel()`: Um label vazio
 - `JLabel(String text)`: Um label com o texto `text`
 - `JLabel(Icon image)`: Um label com o ícone `icon`

Teremos os seguintes métodos mais comuns:

 - `void setText(String s)`
 - `String getText()`


### JTextField

Um espaço que possibilita a edição de uma linha de texto

Teremos os seguintes constructors mais comuns:

 - `JTextField()`
 - `JTextField(String text)`: Inicializa o TextField com o texto especificado
 - `JTextField(String text, int columns)`: Inicializa o TextField com o texto especificado e a largura em characteres
 - `JTextField(int columns)`: Inicializa o TextField com a largura em characteres

Teremos os seguintes métodos mais comuns:
 - `void addActionListener(ActionListener l)`: Adiciona uma ação que ocorre quando o Enter for pressionado com o foco no TextField
 - `void setFont(Font f)`: Configura a fonte
 - `String getText()`: Retorna o texto escrito no TextField

### JTextArea

Um espaço que possibilita a visualização ou edição de multiplas linhas de texto

Teremos os seguintes constructors mais comuns:

 - `JTextArea()`
 - `JTextArea(String text)`: Inicializa o JTextArea com o texto especificado
 - `JTextArea(int row, int column)`: Inicializa o JTextArea com o número de linhas e colunas especificado
 - `JTextArea(String text, int row, int column)`: Inicializa o JTextArea com o texto especificado o número de linhas e colunas especificado

Teremos os seguintes métodos mais comuns:
 - `void setRows(int rows)`: Configura o número de linhas
 - `void setColumns(int cols)`: Configura o número de colunas
 - `void setFont(Font f)`: Configura a fonte
 - `void insert(String s, int position)`: Insere o texto na posição especificada
 - `void append(String s)`: Adiciona o texto `s` ao final do texto da TextArea

### JPasswordField

Possibilita editar uma linha em que os characteres são ocultados da tela

Teremos os seguintes constructors mais comuns:

 - `JPasswordField()`
 - `JPasswordField(String text)`: Inicializa o JPasswordField com o texto especificado
 - `JPasswordField(String text, int columns)`: Inicializa o JPasswordField com o texto especificado e a largura em characteres
 - `JPasswordField(int columns)`: Inicializa o JPasswordField com a largura em characteres


Teremos o seguinte método mais comum:
 - `char[] getPassword()`: Este método retorna o texto como uma lista de characters, e é *importante que estes characteres sejam todos transformados em 0 depois de usados*


### JCheckBox

Uma caixa de seleção que possibilita que o usuário marque e desmarque, mostrando o estado do elemento

Teremos os seguintes constructors mais comuns:

 - `JCheckBox()`
 - `JCheckBox(Action a)`: Adiciona um checkbox com a configuração `a`
 - `JCheckBox(String text)`: Um CheckBox com o texto `text`
 - `JCheckBox(boolean selected)`: Configura se o botão já começa selecionado
 - `JCheckBox(String text, boolean selected)`

Teremos os seguintes métodos mais comuns:
 - `void setText(String text)`: Configura o texto ao lado do CheckBox
 - `boolean isSelected()`: Retorna se o checkbox está selecionado



### JRadioButton

Uma caixa de seleção que faz parte de um grupo de caixas de seleções, onde apenas uma pode estar selecionada.

Botões do mesmo grupo devem ser adicionados em um ButtonGroup.

Teremos os seguintes constructors mais comuns:

 - `JRadioButton()`
 - `JRadioButton(String text)`: Um JRadioButton com o texto `text`
 - `JRadioButton(boolean selected)`: Configura se o botão já começa selecionado
 - `JRadioButton(String text, boolean selected)`

Teremos os seguintes métodos mais comuns:
 - `void setText(String s)`
 - `String getText()`
 - `void setEnabled(boolean b)`
 - `void addActionListener(ActionListener a)`: Adiciona o ActionListener `a`













.
