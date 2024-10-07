# Listeners

Nesta parte serão apresentados alguns `listeners`.
Uma lista com mais opções pode ser encontrada em [Listeners Supported by Swing Components](https://docs.oracle.com/javase/tutorial/uiswing/events/eventsandcomponents.html).

## ActionListener

Um objeto `ActionListener` pode ser adicionado em `JButton`, `JTextfield`, `JCheckBox`, `JComboBox`, `JRadioButton`, entre outros.

Em cada caso o evento será acionado de uma maneira diferente:
* `JButton`: quando o botão for pressionado
* `JTextfield`: quando a tecla **Enter** for pressionada
* `JCheckBox`: quando uma opções for selecionada
* `JComboBox`: quando uma opções for selecionada
* `JRadioButton`: quando uma opções for selecionada

`ActionListener` é uma **interface**. Uma classe que `extends ActionListener` precisa implementar o método `public void actionPerformed(ActionEvent e)`.

## [WindowListener](https://docs.oracle.com/javase/tutorial/uiswing/events/windowlistener.html)

Um `WindowListener` pode ser adicionado em um JFrame. Este listener monitora interações com a janela.

Também temos `WindowFocusListener` e `WindowStateListener`

### WindowListener
Deve implementar os seguintes métodos:

* `windowClosing(WindowEvent e)`: quando o usuário tenta fechar a janela. Para fechar a janela, este método deve chamar os métodos da janela `dispose` ou `setVisible(false)`.

* `windowClosed(WindowEvent e)`: quando a janela é fechada

* `windowOpened(WindowEvent e)`: quando a janela é mostrada pela primeira vez

* `windowIconified(WindowEvent e)`: quando a janela é minimizada

* `windowDeiconified(WindowEvent e)`: quando a janela dexa de ser minimizada

* `windowActivated(WindowEvent e)` e `windowDeactivated(WindowEvent e)`: quando a janela é ativada ou desativada. Funciona em janelas de diálogo ou frames. **É preferível usar o** `WindowsFocusListener`

### WindowFocusListener
Deve implementar os seguintes métodos:

* `windowGainedFocus(WindowEvent e)`: quando a janela está sendo focada

* `windowLostFocus(WindowEvent e)`: quando a janela deixa de ser focada

### WindowStateListener
Deve implementar o seguinte método:

* `windowStateChanged(WindowEvent e)`: Chamado quando o estado de uma janela muda. Para mais informações: [aqui](https://docs.oracle.com/javase/tutorial/uiswing/events/windowlistener.html)

OBS: Para que as implementações involvendo fechamento da janela funcionem, configurar o fechamento padrão da janela como `setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE)`

## [MouseListener](https://docs.oracle.com/javase/tutorial/uiswing/events/mouselistener.html)

O `MouseListener` acompanha as ações do mouse e pode ser adicionado em qualquer componente.

Os métodos obrigatórios de um `MouseListener` são:

* `mousePressed(MouseEvent e)`: quando um botão é pressionado
* `mouseReleased(MouseEvent e)`: quando um botão pressionado é deixado de ser pressionado
* `mouseEntered(MouseEvent e)`: quando o mouse entra no componente
* `mouseExited(MouseEvent e)`: quando o mouse sai do componente
* `mouseClicked(MouseEvent e)`: quando o mouse é clicado

Entre os métodos do `MouseEvent e` temos o `int getClickCount()` que retorna quantas vezes o botão do mouse foi clicado em um pequeno intervalo de tempo.

## [KeyListener](https://docs.oracle.com/javase/tutorial/uiswing/events/keylistener.html)

O `KeyListener` pode ser adicionado em qualquer componente e é acionado quando o foco do teclado está naquele componente

Os nomes dos seus métodos obrigatórios são:

* `keyTyped(KeyEvent e)`
* `keyPressed(KeyEvent e)`
* `keyReleased(KeyEvent e)`

Entre os métodos do `KeyEvent e` temos o `char getKeyChar()` onde é possível pegar o character da tecla que deu origem ao evento.
