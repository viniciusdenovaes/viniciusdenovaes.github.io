# Exemplos sobre Form[^w3]

[^w3]: Retirados de [w3schools](https://www.w3schools.com/html/html_forms.asp)

Um `form` (formulário) é usado para coletar informações do usuário através de perguntas.
Esta informação coletada pode ser enviada para um servidor.
Onde um programa pode processar a informação de um usuário, ou até a informação combinada de vários usuários.

Um exemplo simples do código de um `form` pode ser visto abaixo:

```html
<form action="https://www.w3schools.com/action_page.php" target="_blank">
  <label for="fname">Nome:</label><br>
  <input type="text" id="fname" name="fname" value="Joao"><br>
  <label for="lname">Sobrenome:</label><br>
  <input type="text" id="lname" name="lname" value="Silva"><br><br>
  <input type="submit" value="Submit">
</form>
```
Resultado:

<form action="https://www.w3schools.com/action_page.php" target="_blank">
  <label for="fname">Nome:</label><br>
  <input type="text" id="fname" name="fname" value="Joao"><br>
  <label for="lname">Sobrenome:</label><br>
  <input type="text" id="lname" name="lname" value="Silva"><br><br>
  <input type="submit" value="Submit">
</form>




.