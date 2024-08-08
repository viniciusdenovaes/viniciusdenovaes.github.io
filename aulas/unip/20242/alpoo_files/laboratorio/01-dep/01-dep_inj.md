# Laboratório 01 - Ações e Eventos


## Fazer uma ação separada de um evento

### Exercício 01

#### Parte A

Faça uma classe chamada `Pato` que tenha uma ação: `voar` e que esta ação possa definida fora da classe, depois da criação do objeto.

Mais especificamente, a classe `Pato` tem um método
 - `public void voar()`
 - que faz uma ação do tipo `public void fazVoar()`
o funcionamento deste método deve ser definido **fora da classe** e **depois** da criação do objeto.

#### Parte B

Teste a classe: faça um teste, crie um objeto do tipo `Pato`, implemente uma ação de `fazVoar`, e configure seu objeto para que use a sua implementação.

Mais especificamente:
 - Faça uma classe para testar o seu programa
 - Crie um objeto do tipo `Pato`
 - Crie uma implementação do método `fazVoar`
 - Defina a implementação criada como o funcionamento do método `voar` do objeto `pato` criado.
 - Teste para ver se o método `voar` de `pato` está funcionando.

[Resposta](https://github.com/viniciusdenovaes/Unip232ALPOO/tree/master/Lab01/src/acao_inserida_no_objeto)


### Exercício 02

#### Parte A

Faça uma classe chamada `Pato` que tenha uma ação: `voar` que represente um conjunto de ações que possam ser adicionadas depois da criação do objeto.

Mais especificamente, a classe `Pato` tem um método
 - `public void voar()`
 - que engatilha uma lista de ações do tipo `public void fazVoar()`
cada ação engatilhada por este método deve ser definido **fora da classe** e **adicionada depois** da criação do objeto.

#### Parte B

Teste a classe: faça um teste, crie um objeto do tipo `Pato`, implemente pelo menos duas ações de `fazVoar`, e configure seu objeto para que use as suas implementações.

Mais especificamente:
 - Faça uma classe para testar o seu programa
 - Crie um objeto do tipo `Pato`
 - Crie uma implementação do método `fazVoar`
 - Adicione esta implementação criada no funcionamento do método `voar` do objeto `pato` criado.
 - Crie uma **outra** implementação do método `fazVoar`
 - Adicione esta **outra** implementação criada no funcionamento do método `voar` do objeto `pato` criado.
 - Teste para ver se o método `voar` de `pato` está funcionando.

[Resposta](https://github.com/viniciusdenovaes/Unip232ALPOO/tree/master/Lab01/src/lista_de_acao_no_objeto)


### Exercício 03

#### Parte A

Faça uma classe chamada `Calculadora` que tenha uma ação: `calcular` que opera dois números reais, retorna um número real, e que esta ação possa definida fora da classe, depois da criação do objeto.

Mais especificamente, a classe `Calculadora` tem um método
 - `public double calcular(double a, double b)`
 - que faz uma ação do tipo `public double fazConta(double a, double b)`
o funcionamento deste método deve ser definido **fora da classe** e **depois** da criação do objeto.

#### Parte B

Teste a classe: faça um teste, crie um objeto do tipo `Calculadora`, implemente uma ação de `calcular`, e configure seu objeto para que use a sua implementação.

Mais especificamente:
 - Faça uma classe para testar o seu programa
 - Crie um objeto do tipo `Calculadora`
 - Crie uma implementação do método `fazConta`
 - Defina a implementação criada como o funcionamento do método `calcular` do objeto `calculadora` criado.
 - Teste para ver se o método `calcular` de `calculadora` está funcionando.

[Resposta](https://github.com/viniciusdenovaes/Unip232ALPOO/tree/master/Lab01/src/calculos)


### Exercício 4

Use o [exemplo visto em sala de aula](https://github.com/viniciusdenovaes/Unip232ALPOO/blob/master/Aula01/src/incluindo_acao_botao/TesteBotao.java) para criar um botão.

 - Crie uma janela (`JFrame`)
 - Crie um botão (`JButton`)
 - Adicione o botão na janela
 - Crie um método `public void actionPerformed(ActionEvent e)` dentro de uma classe que `implements ActionListener`
 - Implemente um funcionamento qualquer para este método
 - Adicione este método no botão criado
 - Faça as configurações finais na janela:
    - `janela.pack();`,  
    - `janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);`,
    - `janela.setVisible(true);`

Faça seu programa funcionar e teste o botão.

[Resposta](https://github.com/viniciusdenovaes/Unip232ALPOO/blob/master/Aula01/src/incluindo_acao_botao)

### Exercício 5

Crie uma janela com três botões e defina um funcionamento para cada um deles.

 - Crie uma janela (`JFrame`)
 - **Defina o layout da janela** (`janela.setLayout(new FlowLayout())`)
 - **Repita 3 vezes os seguintes passos**:
    - Crie um botão (`JButton`)
    - Adicione o botão na janela
    - Crie um método `public void actionPerformed(ActionEvent e)` dentro de uma classe que `implements ActionListener`
    - Implemente um funcionamento qualquer para este método
    - Adicione este método no botão criado
 - Faça as configurações finais na janela:
    - `janela.pack();`,  
    - `janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);`,
    - `janela.setVisible(true);`

Faça seu programa funcionar e teste os botões.

[Resposta](https://github.com/viniciusdenovaes/Unip232ALPOO/tree/master/Lab01/src/incluindo_acao_varios_botoes)


### Exercício 6

Faça uma janela, com um botão que escreve na tela
```
Botão pressionado n vezes!
```
onde `n` é o número de vezes que este botão foi pressionado

Exemplo de saída:
```
Botão pressionado 1 vezes!
Botão pressionado 2 vezes!
Botão pressionado 3 vezes!
Botão pressionado 4 vezes!
```

[Resposta](https://github.com/viniciusdenovaes/Unip232ALPOO/tree/master/Lab01/src/incluindo_acao_botao_increment)



.
