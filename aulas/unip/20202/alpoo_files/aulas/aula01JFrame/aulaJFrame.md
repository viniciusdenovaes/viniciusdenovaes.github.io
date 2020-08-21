# Aula 01 - JFrame

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
 - `JFrame.HIDE_ON_CLOSE`: Esconde a janela, porém o programa continua funcinando (é a opção padrão)
 - `JFrame.DISPOSE_ON_CLOSE`: Destrói a janela, caso todas janela sejam destruídas o programa termina
 - `JFrame.DO_NOTHING_ON_CLOSE`: Ignora o botão de fechar

Existem outas formas mais interessantes de configurar o comportamento usando `WindowListener`, sendo possível chamar qualquer método quando o usuário tentar fechar a janela.

### Como tornar a janela visível

Para tornar a janela visível basta usar o método `setVisible(true)`
