# Arrays

Até agora aprendemos a criar variáveis para armazenar dados como números e letras.

Mas e quando tivermos que armazenar uma quantidade muito grande de dados? E quando **não sabemos** a quantidade de inteiros que devemos armazenar?

Para estas situações usamos `arrays`, que são variáveis que armazenam uma **coleção de variáveis**. Mas **atenção**, todas as veriáveis de uma coleção devem ter o **mesmo tipo**.

## Declarando um `array` em C

A criação de um `array`em `C` tem a seguinte sintaxe:
``` c
tipo_de_dados nome_do_array[quantidade_de_elementos];
```

## Exemplo

Para criar um `array` com 10 inteiros:
``` c
int numeros_inteiros[10];
```

Para **colocar** um elemento na primeira posição do `array` (começa em 0):
``` c
numeros_inteiros[0] = 42;
```

Para **colocar** um elemento na segunda posição do `array`:
``` c
numeros_inteiros[1] = 73;
```

Para **ler** um elemento na primeira posição do `array` (começa em 0):
``` c
printf("o primeiro numero eh %d", numeros_inteiros[0]);
```

Para **ler** um elemento na segunda posição do `array` (começa em 0):
``` c
printf("o primeiro numero eh %d", numeros_inteiros[1]);
```

Para **preencher** este array com numeros sequenciais de 1 a 10:
``` c
for(int i=0; i<10; i++){
    numeros_inteiros[i] = i+1;
}
```

Para **imprimir** todo este array:
``` c
for(int i=0; i<10; i++){
    printf("o %d-esimo numero eh %d", i, numeros_inteiros[i]);
}
```






