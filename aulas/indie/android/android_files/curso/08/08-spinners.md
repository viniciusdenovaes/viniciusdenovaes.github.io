# *Spinners*: Uma lista de opções

O *Spinners* é uma visualização e escolha de uma lista de itens dentro de uma caixa, que o usuário pode expandir para escolher.

Se você quer que o usuário escolha apenas uma opção entre várias, e quer que essas opções fiquem minimizadas enquanto o usuário não está escolhendo, o Spinner é a opção certa.

## `Spinner`: como criar no *layout*

No *xml* basta usar o elemento <spinner>


```xml
    <Spinner
        android:id="@+id/id_do_spinner"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        />
```

Mas e seu conteúdo? Será definido no `java`

## `Spinner`: como definir e interagir com o conteúdo no `java`

Primeiro temos que ter as referências para o `spinner`

```java
Spinner spinner = findViewById(R.id.id_do_spinner);
```

Depois temos que criar um array com os nomes que queremos como conteúdo:

```java
        String[] nomes = {
                "Primeiro Nome",
                "Segundo Nome",
                "Terceiro Nome",
                "Último Nome",
        };
```

Agora temos que criar um adaptador, este objeto deve incluir as opções de conteúdo que acabamos de definir:

```java
ArrayAdapter<String> adapter = new ArrayAdapter<>(
    this, 
    androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, 
    nomes // <-- AQUI deve entrar o nome do array de strings
    );
```

Agora, devemos colocar o adaptador no `spinner`:

```java
spinner.setAdapter(adapter);
```


## Como identificar qual opção foi escolhida no `Spinner`

Para pegar o nome que foi escolhido no Spinner precisamos usar o método `getSelectedItem()` do `spinner`

No código abaixo estamos usando o método e transformando o resultado para `String`

```java
String escolhido = spinner.getSelectedItem().toString();
```

Mas **ATENÇÃO** ao comparar *Strings* devemos usar o método `equals(String)`

Então ao invés de fazer isso:
```java
if(escolhido=="Primeiro Nome")
```


Devemos fazer o seguinte:
```java
if(escolhido.equals("Primeiro Nome"))
```

Todos estes métodos serão explicados nas aulas de Orientação a Objetos.


## Exemplo
Abaixo vamos ver um programa onde o usuário escolhe um planeta e o programa diz qual é a distância do da Terra até o planeta.


![](spinner.png)

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:orientation="vertical"
    android:gravity="center"
    android:padding="20dp"
    >

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="45dp"
        android:text="Qual a distância da Terra até este planeta?"
        android:padding="20dp"
        />

    <Spinner
        android:id="@+id/planets_spinner"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        />

    <Button
        android:id="@+id/escolher"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Escolher"
        />

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:padding="20dp"
        >

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Distância Mínima: "
            />
        <TextView
            android:id="@+id/dist_min"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="\?"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=" Milhões de Quilômetros"
            />

    </LinearLayout>


    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:padding="20dp"
        >

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Distância Máxima: "
            />
        <TextView
            android:id="@+id/dist_max"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="\?"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=" Milhões de Quilômetros"
            />

    </LinearLayout>
</LinearLayout>

```


```java
package com.viniciusdenovaes.fisrtspinner;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Button escolher;
    TextView textDistMin;
    TextView textDistMax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.planets_spinner);
        escolher = findViewById(R.id.escolher);
        textDistMin = findViewById(R.id.dist_min);
        textDistMax = findViewById(R.id.dist_max);

        String[] planetas = {
                "Venus",
                "Mars",
                "Mercury",
                "Sun",
                "Jupiter",
                "Saturn",
                "Uranus",
                "Pluto",
                "Neptune",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, planetas);
        spinner.setAdapter(adapter);

        escolher.setOnClickListener(view -> {
            Double min_dist = -1.0, max_dist = -1.0;

            String escolhido = spinner.getSelectedItem().toString();

            if(escolhido.equals("Venus"))   {min_dist = 39.79;    max_dist = 259.71;}
            if(escolhido.equals("Mars"))    {min_dist = 55.65;    max_dist = 399.58;}
            if(escolhido.equals("Mercury")) {min_dist = 82.5;     max_dist = 216.3;}
            if(escolhido.equals("Sun"))     {min_dist = 147.0;    max_dist = 152.1;}
            if(escolhido.equals("Jupiter")) {min_dist = 591.97;   max_dist = 965.52;}
            if(escolhido.equals("Saturn"))  {min_dist = 1_204.28; max_dist = 1_652.48;}
            if(escolhido.equals("Uranus"))  {min_dist = 2_586.88; max_dist = 3_154.91;}
            if(escolhido.equals("Pluto"))   {min_dist = 4_293.37; max_dist = 7_523.53;}
            if(escolhido.equals("Neptune")) {min_dist = 4_311.02; max_dist = 4_685.02;}


            textDistMin.setText(min_dist.toString());
            textDistMax.setText(max_dist.toString());

        });


    }
}


```

