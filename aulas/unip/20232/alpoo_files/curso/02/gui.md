# Interface de Usuário (Graphical User Interface (GUI))(**EM CONSTRUÇÃO**)

Interface de Usuário (em inglês *Graphical User Interface* ou GUI) é a parte do programa que vai aparecer para o usuário final, afim de que ele interaja com o seu programa.

No nosso caso será uma janela.

## Opção 1: Usar o Netbeans

Você pode fazer essa janela usando a IDE [Netbeans](https://netbeans.apache.org/). No Netbeans você precisa apenas escolher o que colocar na sua interface e "arrastar e colar" os componentes em uma janela. Mas, mesmo **para usar o tutorial do Netbeans**,
 - **você precisa saber sobre:**
    - Janela (`JFrame`)
    - Componentes e Containers
    - Listeners
 - você **não** precisa saber sobre:
    - Layouts

Tutoriais do Netbeans estão disponíveis nas páginas oficiais:

 - Em pt-br:
   - [Introdução](https://netbeans.apache.org/kb/docs/java/quickstart-gui_pt_BR.html)
   - [Exemplos práticos](https://netbeans.apache.org/kb/docs/java/gui-functionality_pt_BR.html)
 - Em inglês:
   - [Introdução](https://netbeans.apache.org/kb/docs/java/quickstart-gui.html)
   - [Exemplos práticos](https://netbeans.apache.org/kb/docs/java/gui-functionality.html)








## Opção 2: Fazer direto pelo código

Usando `swing` e `awt`, você tem a opção de criar uma interface escrevendo linhas de código em java.

Vamos ver a seguir tudo o que você precisa fazer para criar uma interface inicial, notando esta aula não abrange todas as possibilidades do você poderia fazer usando `swing` e `awt`.

Uma GUI é feita de containers e componentes:
 - os containers são caixas, com um layout definido, que contém componentes.
   - layout é a regra de como os componentes que estão dentro de um container, irão se organizar automaticamente.
 - Os componentes são:
   - Container (os próprios containers também são componetes, ou seja, você pode ter "caixas dentro de caixas")
   - Botões
   - Caixas de texto
   - Tabelas
   - etc...

Então você seguirá os seguintes passos:
 - a primeira coisa que você deve fazer é criar o seu primeiro container: uma janela
 - depois você deve definir o layout do seu container
 - depois incluir os componentes no seu container
 - definir os passos anteriores para cada container que você tiver
 - definir o funcionamento de cada controle que você tiver

Nos seguintes links uma explicação de cada passo

- [Janela](janela.html)
- [Layout](layout.html)
- [Componentes e Controles](componentes.html)
- [Funcionamento (Listeners)](listeners.html)






.
