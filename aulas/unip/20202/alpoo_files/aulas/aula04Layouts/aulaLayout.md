# Aula 03 - Layouts

Esta aula é uma lista, não exaustiva, de alguns administradores de layouts que podem ser usados no Swing.

Esta aula é baseada no tutorial oficial da Oracle sobre layouts: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html

Para configurar o layout de um container você precisa usar o método `setLayout(LayoutManager)` com algumas variações.

O layout padrão de um JFrame é o BorderLayout, o do JPanel é o FlowLayout. Mas, apesar de existir um padrão, é recomendável que você sempre escolha o layout.

## [BorderLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/border.html)

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




## [FlowLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/flow.html)

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




## [BoxLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/box.html)

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




## [GridLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/grid.html)

O [GridLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/grid.html) organiza os componentes em forma de grade, da esquerda para a direita e de cima para baixo (nesta ordem).

No constructor deve ser dado a quantidade de linha e colunas que a interface deve ter.
Uma, mas não ambos valores podem ser zero, o que faz com que qualquer quantidade de objetos possam ser postos nesta linha ou coluna.

Os componentes incluídos terão todos o mesmo tamanho.

Teremos os seguintes constructors:

 - `GridLayout(int rows, int cols)`: A interface terá `rows` linhas e `cols` colunas;
 - `GridLayout(int rows, int cols, int hgap, int vgap)`: Teremos um espaço horizontal de `hgap` pixels e um espaço vertical de `vgap` pixels entre os elementos.







## [GridBagLayout](https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html)

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
