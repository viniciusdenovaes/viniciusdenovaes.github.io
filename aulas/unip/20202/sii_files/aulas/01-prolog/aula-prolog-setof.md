# Aula Prolog SetOf

## A função bagof

bagof(Objeto, Objetivo, Conjunto).

Esta função guardará em `Conjunto` todos os elementos `Objeto` que tornam `Objetivo` verdadeiro.

## A função setof

setof(Objeto, Objetivo, Conjunto).

Esta função terá o mesmo comportamento de `bagof`, mas não guardará duplicatas e seus elementos estarão ordenados.
