# Aula 03 - Listeners

Nesta aula serão apresentados alguns `listeners`.
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

Um `WindowListener` pode ser adicionado em um JFrame e deve implementar os seguintes métodos:

* `windowClosing(WindowEvent e)`
* `windowClosed(WindowEvent e)`
* `windowOpened(WindowEvent e)`
* `windowIconified(WindowEvent e)`
* `windowDeiconified(WindowEvent e)`
* `windowActivated(WindowEvent e)`
* `windowDeactivated(WindowEvent e)`
* `windowGainedFocus(WindowEvent e)`
* `windowLostFocus(WindowEvent e)`
* `windowStateChanged(WindowEvent e)`

OBS: Para que as implementações involvendo fechamento da janela funcionem, configurar o fechamento padrão da janela como `setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE)`

## [MouseListener](https://docs.oracle.com/javase/tutorial/uiswing/events/mouselistener.html)

O `MouseListener` acompanha as ações do mouse e pode ser adicionado em qualquer componente.

Os métodos obrigatórios de um `MouseListener` são:

* `mousePressed(MouseEvent e)`
* `mouseReleased(MouseEvent e)`
* `mouseEntered(MouseEvent e)`
* `mouseExited(MouseEvent e)`
* `mouseClicked(MouseEvent e)`

Entre os métodos do `MouseEvent e` temos o `int getClickCount()` que retorna quantas vezes o botão do mouse foi clicado em um pequeno intervalo de tempo.

## [KeyListener](https://docs.oracle.com/javase/tutorial/uiswing/events/keylistener.html)

O `KeyListener` pode ser adicionado em qualquer componente e é acionado quando o foco do teclado está naquele componente

Os nomes dos seus métodos obrigatórios são:

* `keyTyped(KeyEvent e)`
* `keyPressed(KeyEvent e)`
* `keyReleased(KeyEvent e)`

Entre os métodos do `KeyEvent e` temos o `char getKeyChar()` onde é possível pegar o character da tecla que deu origem ao evento.
