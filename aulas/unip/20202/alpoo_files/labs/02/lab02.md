# Lab02 Componentes

## Exercício 1

Fazer uma janela com um botão que, quando pressionado, escreva na saída padrão quantas vezes o botão foi pressionado desde o começo do programa.

## Exercício 2

Fazer uma janela com um botão e um label.
No label está escrito quantas vezes o botão foi pressionado e deve atualizar a contagem cada vez que o botão for pressionado.


## Exercício 3

Fazer uma janela com dois botões e um label contando quantas vezes **qualquer um** foi pressionado.
(a contagem **é** compartilhada entre os dois botões)

## Exercício 4

Fazer uma janela com dois botões e um label contando quantas vezes **cada um** foi pressionado, separando as contagens.
(a contagem **não é** compartilhada entre os dois botões)

## Exercício 5

Fazer uma janela com um *textfield* e um label. Quando o usuário escrever qualquer coisa no textfield e apertar **"Enter"**. O label deve atualizar para "frase: `x`", onde `x` é o texto entrado pelo usuário.

## Exercício 6

Fazer uma janela com dois *textfields*, um label e um botão.
Um *textfield* deve representar o nome, e o outro o sobrenome do usuário.
Quando o usuário apertar o botão deve aparecer uma mensagem de comprimento "Olá <primeiro_nome> <segundo_nome>" para o usuário.

## Exercício 7

Usando JCheckBox, fazer uma janela onde o usuário deve escolher um conjunto de roupas, podendo escolher qualquer combinação entre: "Camisa", "Calça" e "Sapatos".
A janela deve ter um botão que imprime na saída padrão o conjunto escolhido pelo usuário.

## Exercício 8

Usando JRadioButton, fazer uma janela onde o usuário deve escolher uma cor entre as três possibilidades: "Amarelo", "Vermelho" e "Azul".
A janela deve ter um botão que imprime na saída padrão a cor escolhida pelo usuário.

## Exercício 9

Fazer uma janela onde o usuário deve escolher um lanche, um ponto da carne, e ingredientes adicionais.

* O lanche deve ser exatamente um entre "Basico", "Cheese" e "Big".
* O ponto deve ser exatamente um entre "Mal Passado", "No Ponto", e "Bem Passado".
* O cliente pode escolher zero ou mais de um entre os ingredientes adicionais: "Queijo", "Maionese", "Carne".

A janela deve ter um botão que escreve na saída padrão o lanche escolhido e a janela é fechada. Ou se o usuário esqueceu de marcar algum item obrigatório.

OBS: você pode usar o código abaixo para fazer a interface gráfica deste exercício. Mas ainda precisará programar o funcionamento dos botões.

```Java
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Janela extends JFrame {

	ArrayList<JRadioButton> escolhaLanches;
	ArrayList<JRadioButton> escolhaPontos;
	ArrayList<JCheckBox> escolhaAdicionals;

	JButton botaoOk = new JButton("Ok");

	public Janela() {
		super("Escolha de Lanches");

		setLayout(new BorderLayout());

		JPanel panelEscolhas = new JPanel();
		add(panelEscolhas, BorderLayout.CENTER);
		JPanel panelBotoes = new JPanel();
		add(panelBotoes, BorderLayout.PAGE_END);

		JPanel panelLanches = new JPanel();
		panelLanches.setLayout(new FlowLayout());
		ButtonGroup bgLanches = new ButtonGroup();
		escolhaLanches = new ArrayList<>();
		escolhaLanches.add(new JRadioButton("Basico"));
		escolhaLanches.add(new JRadioButton("Cheese"));
		escolhaLanches.add(new JRadioButton("Big"));
		for(JRadioButton rb: escolhaLanches) {
			panelLanches.add(rb);
			bgLanches.add(rb);
		}

		JPanel panelPontos = new JPanel();
		panelPontos.setLayout(new FlowLayout());
		ButtonGroup bgPontos = new ButtonGroup();
		escolhaPontos = new ArrayList<>();
		escolhaPontos.add(new JRadioButton("Mal Passado"));
		escolhaPontos.add(new JRadioButton("No Ponto"));
		escolhaPontos.add(new JRadioButton("Bem Passado"));
		for(JRadioButton rb: escolhaPontos) {
			panelPontos.add(rb);
			bgPontos.add(rb);
		}

		JPanel panelAdicionals = new JPanel();
		panelAdicionals.setLayout(new FlowLayout());
		escolhaAdicionals = new ArrayList<>();
		escolhaAdicionals.add(new JCheckBox("Queijo"));
		escolhaAdicionals.add(new JCheckBox("Maionese"));
		escolhaAdicionals.add(new JCheckBox("Carne"));
		for(JCheckBox cb: escolhaAdicionals) {
			panelAdicionals.add(cb);
		}

		panelEscolhas.setLayout(new GridLayout(3, 1));
		panelEscolhas.add(panelLanches);
		panelEscolhas.add(panelPontos);
		panelEscolhas.add(panelAdicionals);

		panelBotoes.setLayout(new FlowLayout(FlowLayout.TRAILING));
		panelBotoes.add(botaoOk);

		pack();
		setVisible(true);

	}

}
```
