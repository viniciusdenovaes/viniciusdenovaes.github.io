# Prólogo sobre MVC

MVC (Model-View-Controller) é um padrão de arquitetura de software.

Dividir o programa em 3 pacotes:

 - Model: A lógica do programa
 - View: A visualização dos dados pelo usuário final
 - Controller: Controla o fluxo entre o Model e o View

 ```dot {engine="dot"}
 digraph MVCExemplo01 {
   Controller -> Model
   View -> Controller
   Controller -> View
 }
 ```
