# Exemplos sobre Form[^w3]

[^w3]: Retirados de [w3schools](https://www.w3schools.com/html/html_forms.asp)

Um `form` (formulário) é usado para coletar informações do usuário através de perguntas.
Esta informação coletada pode ser enviada para um servidor.
Onde um programa pode processar a informação de um usuário, ou até a informação combinada de vários usuários.

#### Como é esta informação?

A informação enviada neste exemplo terá a forma

**atributo1**=**valor1** & **atributo2**=**valor2** & **atributo3**=**valor3** & ...

Uma lista de vários atributos, cada um com um valor.

Um exemplo simples do código de um `form` pode ser visto abaixo:
####Código
```html
<form action="https://www.w3schools.com/action_page.php" target="_blank">
  <label for="fname">Nome:</label><br>
  <input type="text" id="fnameid" name="fname" value="Joao"><br>
  <label for="lname">Sobrenome:</label><br>
  <input type="text" id="lnameid" name="lname" value="Silva"><br><br>
  <input type="submit" value="Enviar">
</form>
```
#### Explicação:

-`form`: tag para delimitar o formulário, os inputs que estiverem dentro desta tag pertencem a este formulário
   - `action="https://www.w3schools.com/action_page.php"`: para onde a informação será enviada, normalmente um script no servidor irá processa a informação
   - `target="_blank"`: para que a resposta abra em uma nova aba
- `label`: um pequeno text indicando o nome de algum `input`
   - `for="fname"`: qual o nome do `input` ao qual este `label` se refere.
- `input`: a tag para indicar uma entrada do usuário, pode ser um texto, uma caixa de escolha, um calendário para escolher um dia, ...
   - `type="text"`: o teipo do input, neste caso é um input de texto
   - `id="fnameid"`: o *id* do `input`
   - `name="fname"`: o nome do `input` que será o nome deste atributo na resposta, este atributo terá como valor assoziado o texto que o usuário colocar no `input`, por exemplo `fname=Joao`.
   - `value="Joao"`: Um valor padrão para o `input`


#### Resultado:

<hr>
<form action="https://www.w3schools.com/action_page.php" target="_blank">
  <label for="fname">Nome:</label><br>
  <input type="text" id="fnameid" name="fname" value="Joao"><br>
  <label for="lname">Sobrenome:</label><br>
  <input type="text" id="lnameid" name="lname" value="Silva"><br><br>
  <input type="submit" value="Enviar">
</form>
<hr>

<br>

Ao ser enviado podemos ver uma página que mostrará uma lista de chave e valor das informações:

```
fname=Joao&lname=Silva
```
onde o atributo `fname` tem o valor `Joao` e o atributo `lname` tem o valor `Silva`.

Perceba também que estes valores são passados pela URL (no endereço do site), possibilitando guardar a URL se quiser reenviar as mesmas informações oportunamente.



## Tipos de `input` dentro do `form`

Dentro do `form` podemos ter vários tipos de elementos para a tag `input`.
Aqui vamos listar o `text`, `checkbox` e `radiobutton`.
Uma lista maior pode ser encontrada [aqui](https://www.w3schools.com/html/html_form_input_types.asp).

Para escolher o tipo de `input` temos que escrever o valor do atributo `type` na tag `input`.

Cada `input` deve ter o atributo `name` que será o nome do atributo deste `input`.

### Text

O tipo `text` é um *textfield* onde o usuário pode colocar qualquer palavra.

Temos a possibilidade de ligar o `autocomplete`

```
<input type="text" id="fname" name="fname" value="">
```
<input type="text" id="fname" name="fname" value="">

Temos a possibilidade de (des)ligar o `autocomplete`

```
<input type="text" id="fname" name="fname" value="" autocomplete="off">
```
<input type="text" id="fname" name="fname" value="" autocomplete="off">



### Checkbox

São caixas de seleção, onde podemos selecionar quantas quisermos:

```html
<form action="https://www.w3schools.com/action_page.php" target="_blank">
  <input type="checkbox" id="vehicle1" name="vehicle1" value="Bike">
  <label for="vehicle1"> Eu tenho uma moto</label><br>
  <input type="checkbox" id="vehicle2" name="vehicle2" value="Car">
  <label for="vehicle2"> Eu tenho um carro</label><br>
  <input type="checkbox" id="vehicle3" name="vehicle3" value="Boat">
  <label for="vehicle3"> Eu tenho um bote</label><br>
  <input type="submit" value="Enviar">
</form>
```


<hr>
<form action="https://www.w3schools.com/action_page.php" target="_blank">
  <input type="checkbox" id="vehicle1" name="vehicle1" value="Bike">
  <label for="vehicle1"> Eu tenho uma moto</label><br>
  <input type="checkbox" id="vehicle2" name="vehicle2" value="Car">
  <label for="vehicle2"> Eu tenho um carro</label><br>
  <input type="checkbox" id="vehicle3" name="vehicle3" value="Boat">
  <label for="vehicle3"> Eu tenho um bote</label><br>
  <input type="submit" value="Enviar">
</form>
<hr>


### Radiobutton

São caixas de escolha, onde podemos escolher apenas uma dentre as opções:


```html
<hr>
<p>Escolha a sua linguagem preferida:</p>
<form action="https://www.w3schools.com/action_page.php" target="_blank">
  <input type="radio" id="html" name="fav_language" value="HTML">
  <label for="html">HTML</label><br>
  <input type="radio" id="css" name="fav_language" value="CSS">
  <label for="css">CSS</label><br>
  <input type="radio" id="java" name="fav_language" value="Java">
  <label for="java">Java</label><br>
  <input type="submit" value="Enviar">
</form>
<hr>
```


<hr>
<p>Escolha a sua linguagem preferida:</p>
<form action="https://www.w3schools.com/action_page.php" target="_blank">
  <input type="radio" id="html" name="fav_language" value="HTML">
  <label for="html">HTML</label><br>
  <input type="radio" id="css" name="fav_language" value="CSS">
  <label for="css">CSS</label><br>
  <input type="radio" id="java" name="fav_language" value="Java">
  <label for="java">Java</label><br>
  <input type="submit" value="Enviar">
</form>
<hr>


## Métodos GET e POST

Ao acessar a internet o computador e o servidor se comunicam através de requisições, que são mensagens enviadas na forma de protocolos.

O método que o `form` por padrão é o GET. Este método tem as seguintes características:

#### GET

- GET é usado para requisitar informações ao servidor, e não modificar ou criar arquivos no servidor.
- A mensagem de requisição é enviada na URL. Olhe no endereço do site da página de resposta e você verá os atributos e valores enviados.
- Contra: por este motivo, a lista de atributos e valores têm um limite relativamente pequeno de tamanho.
- Nunca deve ser usado quando mandar informações privadas, como senhas
- Vantagem: você pode favoritar a requisição para enviar outras vezes.


#### POST

- POST é usado para modificar ou criar arquivos no servidor.
- As informações não são mandadas pela URL, mas sim em uma mensagem na forma de protocolo.
- Não pode ser guardado

### Exemplo de uso de POST


```html
<form action="https://www.w3schools.com/action_page.php" target="_blank" method="post">
  <label for="login">Login:</label><br>
  <input type="text" id="login" name="login"><br>
  <label for="pass">Password:</label><br>
  <p style="color:red">Não coloque seu password aqui<br>
  Essa informação aparecerá na tela seguinte
  </p>
  <input type="password" id="pass" name="pass"><br><br>
  <input type="submit" value="Enviar">
</form>
```


<html>
<hr>
<form action="https://www.w3schools.com/action_page.php" target="_blank" method="post">
  <label for="login">Login:</label><br>
  <input type="text" id="login" name="login"><br>
  <label for="pass">Password:</label><br>
  <p style="color:red">Não coloque seu password aqui<br>
  Essa informação aparecerá na tela seguinte
  </p>
  <input type="password" id="pass" name="pass"><br><br>
  <input type="submit" value="Enviar">
</form>
<hr>
</html>


Perceba que as informações enviada **não** aparecem na **URL** da tela de resultado

<hr>




### Javascript para verificação


```html
<form action="https://www.w3schools.com/action_page.php" target="_blank" method="post">
  <label for="login" id="lab-login-sc">Login:</label><br>
  <input type="text" id="txt-login-sc" name="login"><br>
  <label for="login" id="wrn-login-sc"></label><br>
  <p style="color:red">Não coloque seu password aqui<br>
  Essa informação aparecerá na tela seguinte
  </p>
  <label for="pass"      id="lab-pass-sc">Password:</label><br>
  <input type="password" id="txt-pass-sc" name="pass"><br>
  <label for="login"     id="wrn-pass-sc"></label><br>
  <input type="submit" value="Enviar">
</form>
```


<html>
<hr>
<form action="https://www.w3schools.com/action_page.php" target="_blank" method="post">
  <label for="login" id="lab-login-sc">Login:</label><br>
  <input type="text" id="txt-login-sc" name="login"><br>
  <label for="login" id="wrn-login-sc"></label><br>
  <p style="color:red">Não coloque seu password aqui<br>
  Essa informação aparecerá na tela seguinte
  </p>
  <label for="pass"      id="lab-pass-sc">Password:</label><br>
  <input type="password" id="txt-pass-sc" name="pass" onclick="checkAlert()"><br>
  <label for="login"     id="wrn-pass-sc"></label><br>
  <input type="submit" value="Enviar">
</form>
<hr>
<script>
var wrn_pass = document.getElementById("wrn-pass-sc");
var txt_pass = document.getElementById("txt-pass-sc");
txt_pass.addEventListener("keyup", () => {checkPass()})
function checkAlert(){
  alert("Sua senha deve conter a palavra HTML");
}
function checkPass(){
  if(!txt_pass.value.toLowerCase().includes("html")){
    wrn_pass.textContent = "Sua senha deve incluir a palavra HTML";
    wrn_pass.style.color = "red";
  }else{
    wrn_pass.textContent = "Senha ok";
    wrn_pass.style.color = "green";
  }
}


var wrn_pass = document.getElementById("wrn-pass-sc");
var txt_pass = document.getElementById("txt-pass-sc");
txt_pass.addEventListener("keyup", () => {checkPass()})
function checkPassAlert(){
  alert("Sua senha deve conter a palavra HTML");
}
function checkPass(){
  if(!txt_pass.value.toLowerCase().includes("html")){
    wrn_pass.textContent = "Sua senha deve incluir a palavra HTML";
    wrn_pass.style.color = "red";
  }else{
    wrn_pass.textContent = "Senha ok";
    wrn_pass.style.color = "green";
  }
}
</script>
</html>



.
