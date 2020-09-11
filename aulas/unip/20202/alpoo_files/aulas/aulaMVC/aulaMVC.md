# Aula MVC

MVC é um padrão de arquitetura de software (algumas vezes conhecido como um *design pattern*).

MVC (Model-View-Controller)

Separado em três responsabilidades:
 - Model: A parte lógica do seu programa (tudo o que o seu programa faz que não seja interagir com o usuário)
 - View: A visualização dos dados para o usuário final.
 - Controller: Define as ações de intaração com o usuário.

 #### Exemplo de MVC em Redes

  ```dot {engine="dot"}
  digraph MVCExemplo01 {
    Servidor_Controller -> BancoDados_Model
    Navegador_View -> Servidor_Controller
    Servidor_Controller -> Navegador_View
  }
  ```

#### Programa em Java MVC

Acessar dados de uma turma de aluno em uma matéria

Dados: id, nome, nota01, nota02

 - Ações:
   - procurar alunos: listar alunos que tenham um padrão
   - adicionar alunos: adicionar id, nome, notas
   - exibir relatório sobre aluno: sobre **um** aluno, exibir notas e média

Dados estarão em um arquivo CSV
