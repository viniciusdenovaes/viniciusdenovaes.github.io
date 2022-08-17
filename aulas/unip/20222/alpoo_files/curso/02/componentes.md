# Componentes

Esta parte é uma lista, não exaustiva, dos componentes que podemos colocar em um container.

Qualquer elemento que colocamos em uma interface é um componente.

Primeiro vamos estudar o que é um container

## Containers

Todo componente precisa estar dentro de um container.

O container organiza automaticamente os componentes que estão inseridos dentro dele. Mas, para isso, você precisa definir:
 - O layout do container
 - O tamanho preferido de cada componente (não se preocupe, a maioria dos componentes já tem seus tamanhos preferidos definidos automaticamente)

Os containers que usaremos neste curso serão o `JFrame`, e o `JPanel`.

Cada programa pode conter várias janelas `JFrame`. Cada janela pode conter vários painéis `JPanel`. E cada painel também pode conter vários painéis.

Para adicionar um componente em um container usaremos o método `add(Component)` (o método `add` pode conter mais argumentos)

### JPanel

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

Botões do mesmo grupo devem ser adicionados em um `ButtonGroup`.

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
