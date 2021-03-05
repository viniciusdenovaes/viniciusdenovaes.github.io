# LPOO - Linguagem de Programação Orientada a Objetos (em Java)



Alerta: os exemplos fazem sentido no contexto da aula, junto com uma explicação.
Muitas linhas nos códigos podem não fazer sentido:
talvez eu tenha colocado para dar um exemplo do que não fazer,
ou talvez eu tenha colocado para explicar algum conceito pontual,
ou talvez fuja da matéria e eu tenha colocado para responder a alguma pergunta.

## Curso

* Prólogo
    * Instalação:
        * [Linux (Ubuntu)](lpoo_files/curso/00-install/linux/00-tuto_instal_linux_ubuntu.html)
        * [Windows](lpoo_files/curso/00-install/windows/00-tuto_instal_windows.html)

* Parte 01 Comandos Básicos:
    * [Tipos Primitivos e Operações](lpoo_files/curso/01/tipos_primitivos.html)
    * [Comandos de Controle](lpoo_files/curso/01/comandos_de_controle.html)

* Parte 02 Orientação a Objetos
    * [Classes](lpoo_files/curso/02/01-classes.html)
    * [Convenções](lpoo_files/curso/02/02-convencoes.html)

## Laboratórios

* [lab00 - comandos básicos](lpoo_files/laboratorio/00-basico/lista_comandos_basicos.pdf)
* [lab00 - Usando funções (métodos estáticos)](lpoo_files/laboratorio/00-basico/comandos-basicos.html)
  * [respostas](https://github.com/viniciusdenovaes/Unip211LPOO/tree/main/Lab00/src/lab00)
* [lab01 - Classes](lpoo_files/laboratorio/01-classes/01-classes.html)


## APS

* [Documento da APS (em .docx)](lpoo_files/aps/APS_LPOO_2021.docx)
* [Roteiro para a APS (em html)](lpoo_files/aps/roteiro.html)

## Exemplos Vistos em Sala

* [Github](https://github.com/viniciusdenovaes/Unip211LPOO)

## Extras

## Ementa

* Parte 00 - Revisão: Levamos em consideração que a turma aprendeu o paradigma de programação procedural programando em Python. Será feito uma revisão de tipos primitivos, comandos de controle e procedimentos focando na sintaxe em Java.
    * Tipos primitivos (`int`, `double`, `boolean`)
    * Comandos de controle
        * comandos condicionais (`if`, `if else`, `if else if`)
        * comandos de repetição (`while`, `for`)
    * Procedimentos: (métodos estáticos tratados como funções)
    * Estruturas: arrays

* Parte 01 - Classes e Objetos
  * Atributos e Métodos
  * _Constructors_
  * Composição
  * Encapsulamento
  * _Override_
  * Estruturas:
    * `ArrayList`
    * `for-each`: Um novo tipo de `for`
* Parte 02 - Herança
  * _Overload_
  * Exemplos: `toString`, `equals`
  * `String`: uma classe muito especial
  * Polimorfismo
  * Classes Abstratas
  * Interface (é uma classe totalmente abstrata (v.9))(**NÃO É INTERFACE DE USUÁRIO**)
  * Exemplos Práticos: `Comparable`, `Iterable`
  * Estruturas:
    * `TreeSet`,
    * `TreeMap`
* Extras
    * Leitura e escrita de Dados:
        * Pelo terminal
        * Arquivos
        * [CSV](https://pt.wikipedia.org/wiki/Comma-separated_values)
    * `Exceptions`
         * `try-catch`
         * `finaly`
         * `try-with-resources`


### Livros

Os livros tratam os conceitos de forma mais aprofundada do que materiais encontrados na internet (como fóruns, vídeo aulas, etc...).
Porém os materiais encontrados na internet muitas vezes estão mais atualizados.

Então é melhor juntar os dois.
Se você quer entender um *conceito*, leia em um livro.
Se você quer resolver um problema pontual, procure na internet.

Infelizmente eu ainda não encontrei um livro traduzido para o protuguês que seja perfeito para este curso, por isso a existência deste site.

Aqui está uma lista dos livros que eu recomendo:

#### Para aprender o básico

* [Use a Cabeça - Java, 2ª edição (Java 5) Traduzido](http://www.altabooks.com.br/use-a-cabeca-java-2-ed..html):
Este livro é o primeiro que eu recomendo, a série "Use a Cabeça" é uma série perfeita para quem está começando a aprender uma nova ferramenta.
Esta série tem um estilo realmente fácil de ler e de fixar o conhecimento, se você praticar os exercícios do livro.
Porém não é um bom livro de consulta: por ser uma série para facilitar a *apredizagem*,
os conceitos importantes estão espalhados pelo livro de forma não organizada, então é um livro para você ler do começo ao final.
Mas é um livro fácil de ler, e te dará uma base sólida em Java, então *vale o investimento* (por volta de \~120 reais).
Fique atento que o [https://www.oreilly.com/library/view/head-first-java/0596009208/ original deste livro] saiu em fevereiro de 2005.
E isso é algum tempo em termos de linguagem de computação.
O livro está atualizado para Java 5, e nós estamos em Java 11.
Novos recursos foram inseridos na linguagem de lá para cá.
Para este curso você pode usar este livro, sem problemas.


* [Deitel 10ª edição (Java 8) Traduzido](https://www.amazon.com.br/Java®-como-programar-Paul-Deitel/dp/8543004799):
Este livro é o oposto do "Use a Cabeça", é um ótimo livro de consulta, mas eu não conseguiria ler este livro do começo ao final.
É muito aprofundado, por um lado faz você perder um imenso tempo em cada capítulo, por outro tem muita informação sobre cada conceito.
Então é o melhor livro para aprender algum conceito pontual que você tem dúvidas.
Se vale o investimento? Custa mais de 300 reais.
Se você tiver preferência por livros em inglês, você poderá encontrar outras fontes mais baratas...

* [Core Java 11ª Edição (Java 11) Não Traduzido](http://horstmann.com/corejava/):
Este é melhor dos dois mundos, é o meu livro preferido atualmente, eu consigo ler cada capítulo inteiro, e também encontrar conceitos pontuais quando preciso.
Infelizmente não existe tradução para português.
Somente uma tradução de uma edição bem antiga, e apenas do volume 1.

#### Para depois de aprender o básico de Java

* [Effective Java 3ª Edição (Java 9) Traduzido](https://www.amazon.com.br/Java-Efetivo-Melhores-Práticas-Plataforma/dp/8550804622):
Este não é um livro para aprender Java, mas para melhorar e atualizar as suas práticas.
Você vai aprender como melhor usar os recursos das edições novas do Java.

* [Código Limpo](https://www.amazon.com.br/C%C3%B3digo-limpo-Robert-C-Martin/dp/8576082675):
Este não é um livro sobre Java, apesar dos exemplos citados estarem em Java.
É um livro sobre como "codar" bem!
Como dar os melhores nomes para as variáveis, como planejar bem funções, como comentar bem o código...

* [Use a Cabeça - Padrões de Projetos](https://www.amazon.com.br/Cabeça-Padrões-Projetos-Eric-Freeman/dp/8576081741):
Depois de aprender a programar orientado a objetos este é *o próximo passo*.




Mas estas são minhas opiniões pessoais.
É recomendável que você experimente, pesquise e pergunte para outras pessoas também.
Um bom livro é aquele que você lê e aprende informações corretas, e isto depende de vários fatores como objetivos, gostos, e nível de conhecimento:
