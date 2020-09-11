# Lab02 Interface Gráfica

## Exercício 1 - Calculadora

Implemente as 4 operações básicas na
calculadora.

## Exercício 2 - Produtos

Faça as seguintes atividades:
 1. Criar a classe Produto (pacote model) com os atributos
privados: nome (String), codigo (Integer), valor (Float) e preço (Float) e um construtor.
 1. Criar um JFrame (pacote view) para preencher os campos nome, código e valor de um objeto da classe produto.
 1. Calcular o preço do produto, sabendo-se que o preço é `1.2 * valor`.
 1. Criar um botão no JFrame para exibir os dados do produto utilizando showMessageDialog.


## Exercício 3 - Perecível

Faça as seguintes atividades:
 1. Criar a classe Perecível (model), que herda de Produto e possui um atributo adicional validade (Integer) e ainda um construtor próprio. Se necessário, modifique a classe produto.
 1. Alterar o JFrame para permitir o preenchimento dos campos nome, código, valor e validade de um objeto da classe perecível.
 1. Fazer a sobrecarga do método para calcular o preço,
sabendo-se que o preço é `1.4 * valor` do produto perecível.
 1. Exibir os dados do perecível utilizando showMessageDialog.

## Exercício Bônus (Modificações no Exercício 2 - Produtos)

Faça uma :
 1. Criar a classe Produto (pacote model) com os atributos privados: nome (String), codigo (Integer), valor (Float) e preço (Float) e um construtor.
 1. Criar um JFrame com dois botões:
    - **Adicionar Produto** (Faz ação de adicionar produto)
    - **Listar Produtos** (Faz ação de listar todos os produtos existentes)
 1. A Ação de **Adicionar Produto** cria uma janela para entrar com os dados do produto a ser adicionado.
 1. A ação de **Listar Produtos** cria uma janela para mostrar todos os produtos que foram adicionados desde o começo do programa
