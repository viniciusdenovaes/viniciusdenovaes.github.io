# Laboratório 01.2 - Ações e Eventos e JButtons


## Fazer uma ação de um JButton


### Exercício 1

Use o [exemplo visto em sala de aula](https://github.com/viniciusdenovaes/UnipALPOO/blob/master/Lab01/src/incluindo_acao_botao/TesteBotao.java) para criar um botão.

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

[Resposta](https://github.com/viniciusdenovaes/Unip232ALPOO/blob/master/Lab01/src/incluindo_acao_botao)

### Exercício 2

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


### Exercício 3

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
