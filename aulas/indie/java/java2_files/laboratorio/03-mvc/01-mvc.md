# Laboratório 03.01 - Model-View-Controller (MVC)


Nos exercícios abaixo serão fornecidos arquivos de um projeto em padrão MVC, será fornecido o `Controller`, a `interface` `View` e `Model`. Para cada um você deve fazer uma ou mais implementações de `View` e `Model`; além de um arquivo para testar as suas classes.

### Exercício 01 - Lista de Nomes

Neste projeto você deve fazer um programa que guarda uma lista de nomes. Esta lista de nomes pode ser persistente ou não. O usuário pode pedir para **inserir** um nome, ou **buscar** um nome na lista.

O seu programa deve
- Guardar uma lista de nomes. Pode ser ou não persistente.
- O usuário pode inserir um novo nome.
- O usuário pode buscar por um nome. Esta busca deve retornar uma lista de nomes. Esta lista deve ser exibida ao usuário.

**OBS:** O tutorial de interfaces ainda não cobriu como fazer uma lista de nomes. Você pode usar uma `Jlist`. [Olhe uma das implementações da resposta.](https://github.com/viniciusdenovaes/UnipALPOO/blob/master/Lab03.01.01_lista_nomes/src/view/implementation/jframe/Janela.java)

Você deve:
- Implementar pelo menos duas classes de `View`, com elementos diferentes,
   - uma deve ser uma janela do `Swing`,
   - a outra pode ser usando `Swing` ou terminal, mas deve ter elementos diferentes da implementação anterior.
- Implementar pelo menos um `Model`
   - As informações podem ser persistentes ou não.
   - A busca recebe uma palavra chave, e pode procurar por todos os nomes que contem a palavra, ou só pelos nomes exatos, ou como você preferir. Mas deve retornar uma lista.

#### Arquivos:
- [classe Controller](https://raw.githubusercontent.com/viniciusdenovaes/UnipALPOO/master/Lab03.01.01_lista_nomes/src/controller/Controller.java)
- [interface Model](https://raw.githubusercontent.com/viniciusdenovaes/UnipALPOO/master/Lab03.01.01_lista_nomes/src/model/Model.java)
- [interface View](https://raw.githubusercontent.com/viniciusdenovaes/UnipALPOO/master/Lab03.01.01_lista_nomes/src/view/View.java)


[Resposta](https://github.com/viniciusdenovaes/UnipALPOO/tree/master/Lab03.01.01_lista_nomes/src/)





### Exercício 02 - Calcula Uma Operação

Neste projeto você deve fazer um programa que, dados dois números inteiros, faz uma conta e mostra o resultado.

O seu programa deve
- Receber dois números inteiros do usuário.
- Fazer uma conta usando estes dois números.
- Mostrar o resultado.

Você deve:
- Implementar pelo menos duas classes de `View`, com elementos diferentes,
   - uma deve ser uma janela do `Swing`,
   - a outra pode ser usando `Swing` ou terminal, mas deve ter elementos diferentes da implementação anterior.
- Implementar pelo menos duas classes de `Model`
   - A conta que o model vai fazer precisa usar os  dois números.
   - A operação que o model vai fazer não precisa ficar clara para o usuário.

#### Arquivos:
- [classe Controller](https://raw.githubusercontent.com/viniciusdenovaes/UnipALPOO/master/Lab03.01.02_calcular/src/controller/Controller.java)
- [interface Model](https://raw.githubusercontent.com/viniciusdenovaes/UnipALPOO/master/Lab03.01.02_calcular/src/model/Model.java)
- [interface View](https://raw.githubusercontent.com/viniciusdenovaes/UnipALPOO/master/Lab03.01.02_calcular/src/view/View.java)


[Resposta](https://github.com/viniciusdenovaes/UnipALPOO/tree/master/Lab03.01.02_calcular/src/)











### Exercício 03 - Calculadora

Neste projeto você deve fazer uma calculadora que faz uma operação apenas, escolhida pelo usuário, entre as operações de soma (`+`), subtração (`-`), multiplicação (`*`) e divisão (`/`).

O seu programa deve
- Receber dois números inteiros e uma das 4 operações do usuário.
- Fazer a conta definida pela operação usando estes dois números na ordem definida pelo usuário.
- Mostrar o resultado.

Você deve:
- Implementar pelo menos duas classes de `View`, com elementos diferentes,
   - uma deve ser uma janela do `Swing`,
   - a outra pode ser usando `Swing` ou terminal, mas deve ter elementos diferentes da implementação anterior.
- Implementar uma classe de `Model` que faça a operação.

**OBS**: este projeto também usa objetos representando entidades: o enumerate de `Operacao`, representando as 4 operações possíveis, cada elemento deste enumerate já está com o símbolo associado a ele, e também a operação.

#### Arquivos:
- [classe Controller](https://raw.githubusercontent.com/viniciusdenovaes/UnipALPOO/master/Lab03.01.03_calculadora/src/controller/Controller.java)
- [interface Model](https://raw.githubusercontent.com/viniciusdenovaes/UnipALPOO/master/Lab03.01.03_calculadora/src/model/Model.java)
- [interface View](https://raw.githubusercontent.com/viniciusdenovaes/UnipALPOO/master/Lab03.01.03_calculadora/src/view/View.java)
- entidades:
   - [Operacao](https://raw.githubusercontent.com/viniciusdenovaes/UnipALPOO/master/Lab03.01.03_calculadora/src/entities/Operacao.java)


[Resposta](https://github.com/viniciusdenovaes/UnipALPOO/tree/master/Lab03.01.03_calculadora/src/)







### Exercício 04 - Jogo Adivinha Número

Neste projeto você deve fazer um jogo em que o computador escolhe um número de 0 a 100 e o usuário tenta adivinhar. Em cada tentativa o usuário deve ser informado se o número tentado é **maior**, **menor** ou **igual** ao número escolhido pelo programa. Caso seja **igual**, o programa deve parar e informar quantas tentativas foram feitas.

O seu programa deve
- Escolher um número.
- Receber um número do usuário.
- Informar se o número recebido é maior, menor ou igual ao número escolhido pelo programa.
   - Caso seja igual, o programa deve parar e exibir quantas tentativas foram feitas pelo usuário.

Você deve:
- Implementar pelo menos duas classes de `View`, com elementos diferentes,
   - uma deve ser uma janela do `Swing`,
   - a outra pode ser usando `Swing` ou terminal, mas deve ter elementos diferentes da implementação anterior.
- Implementar pelo menos uma classe de `Model` que escolha um número no início, conte as tentativas, e diga o resultado da tentativa do usuário.

**OBS**: este projeto também usa objetos representando entidades: o enumerate de `Resultado`, que pode ser `MAIOR`, `MENOR` ou `IGUAL`.

#### Arquivos:
- [classe Controller](https://raw.githubusercontent.com/viniciusdenovaes/UnipALPOO/master/Lab03.01.04_jogo_adivinha/src/controller/Controller.java)
- [interface Model](https://raw.githubusercontent.com/viniciusdenovaes/UnipALPOO/master/Lab03.01.04_jogo_adivinha/src/model/Model.java)
- [interface View](https://raw.githubusercontent.com/viniciusdenovaes/UnipALPOO/master/Lab03.01.04_jogo_adivinha/src/view/View.java)
- entidades:
   - [Resultado](https://raw.githubusercontent.com/viniciusdenovaes/UnipALPOO/master/Lab03.01.04_jogo_adivinha/src/entities/Resultado.java)


[Resposta](https://github.com/viniciusdenovaes/UnipALPOO/tree/master/Lab03.01.04_jogo_adivinha/src/)











.
