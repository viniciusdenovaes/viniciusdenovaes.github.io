# Um Botão Funcionando

Nesta aula vamos fazer um botão funcionar com o mínimo de elementos possível.

Dividiremos em duas partes, uma mais fácil para a criação dos elementos no `xml` (esta você já deve saber fazer), e uma outra **mais desafiadora** para o funcionamento destes elementos em Java.

#### A parte do `xml`:

Aqui vamos ser rápidos: vamos fazer um `EditText` para ler uma entrada, um `Button` para engatilhar uma ação, e um `TextView` para escrever a saída.

Só teremos uma **novidade**: em cada um destes elementos vamos adicionar um *id* que é uma forma de podermos identificar estes elementos no código `java`. Veja na primeira linha a identificação de cada elemento no código abaixo:

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    android:gravity="center"
    >

    <EditText
        android:id="@+id/entrada"
        android:layout_width="180dp"
        android:layout_height="64dp"
        android:hint="Entrada"
        android:textSize="32dp"
        />
    <Button
        android:id="@+id/botao"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Aperte"
        android:textSize="32dp"
        />
    <TextView
        android:id="@+id/saida"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Saida"
        android:textSize="32dp"
        />



</LinearLayout>

```



#### A parte do `java`:

Apenas editaremos o código inicial `MainActivity.java` (caso você tenha fechado, vai estar no caminho `app/src/main/java/com.nome_da_empresa.nome_do_app/MainActivity`)

Apague o **conteúdo menos a primeira linha** do arquivo e copie e cole o seguinte código no arquivo:

```java

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /* Secao 1
    * Aqui teremos a definicao das variaveis
    * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        /* Secao 2
        * Aqui teremos os valores de cada variavel
        * */

        /* Secao 3
        * Aqui teremos as funcionalidades
        * */


    }
}

```

Este arquivo servirá de ponto de partida para inserirmos os **equivalentes dos elementos do `xml`**. 

Para cada elemento do `xml` que quisermos interagir, teremos que criar um objeto no código `java`.

##### Seção 1: criação das variáveis

Primeiro vamos criar as variáveis no lugar da seção 1 no código. Basta apenas criar uma variável para cada tipo que quisermos usar **e que exista no `xml`**.

No nosso caso temos 3 elementos: 
1. O `EditText` de entrada que chamaremos de `textEntrada`
1. O `TextView` que servirá para mostrar um texto para o usuário que chamaremos de `textSaida`
1. O `Button` que servirá para engatilhar uma ação que chamaremos de `botao`

O nosso código da seção 1 ficará assim:

```java
    EditText textEntrada;
    TextView textSaida;
    Button botao;
```



##### Seção 2: atribuição de valores para cada variável

Na seção 2 vamos atribuir  valores para cada uma das variáveis. Para isto precisamos usar o identificador que usamos no `xml`, para o código saber de que elemento exatamente estamos falando.

Usaremos o método `findViewById(R.id.o_id_colocado_no_xml);`. Basta colocar o *id* colocado no elemento do `xml` para que a variável saiba qual elemento ela deve tomar controle.

No nosso caso temos 3 atribuições: 
1. O `textEntrada` receberá o valor de `findViewById(R.id.entrada)`
1. O `textSaida` receberá o valor de `findViewById(R.id.saida)`
1. O `botao` receberá o valor de `findViewById(R.id.botao)`

O nosso código da seção 2 ficará assim:

```java
        textEntrada = findViewById(R.id.entrada);
        textSaida = findViewById(R.id.saida);
        botao = findViewById(R.id.botao);
```





##### Seção 3: controlando os elementos e definindo funcionalidades

Na seção 3 vamos definir algumas funcionalidades para os elementos.

O primeiro passo é definir o que o botão irá fazer quando for pressionado. Para isto vamos usar o seguinte código na seção 3:

```java
        botao.setOnClickListener(view -> {
            /* secao 4
            * Aqui podemos colocar tudo que queremos que o botao execute
            * */
        });

```

A *explicação complicada é que estamos usando uma expressão lambda para instanciar um objeto de uma classe anônima.*

A **explicação simples é que vamos usar este código por enquanto sem saber detalhes sobre ele.** Por enquanto...

Dentro desta função que acabamos de definir, vamos fazer a seguinte ação, que acontecerá quando o botão for pressionado:

1. Um texto será lido do `textEntrada` usando o função `textEntrada.getText().toString();`, a função `getText()` pega o texto que está escrito no elemento, e a função `toString()` transforma este texto em `String`.
1. Este texto será escrito no `textSaida` usando a função `textSaida.setText(texto);`

Pronto, o nosso código na seção 3 ficará assim:

```java
        botao.setOnClickListener(view -> {
            String texto = textEntrada.getText().toString();
            textSaida.setText(texto);
        });
```


##### O código completo

Agora seu aplicativo estará pronto, o código em Java ficará assim:

```java
package com.viniciusdenovaes.meuapptesteunip;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /* Secao 1
    * Aqui teremos a definicao das variaveis
    * */

    EditText textEntrada;
    TextView textSaida;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        /* Secao 2
        * Aqui teremos os valores de cada variavel
        * */

        textEntrada = findViewById(R.id.entrada);
        textSaida = findViewById(R.id.saida);
        botao = findViewById(R.id.botao);

        /* Secao 3
        * Aqui teremos as funcionalidades
        * */

        botao.setOnClickListener(view -> {
            /* secao 4
            * Aqui podemos colocar tudo que queremos que o botao execute
            * */
            String texto = textEntrada.getText().toString();
            textSaida.setText(texto);
        });


    }
}
```




