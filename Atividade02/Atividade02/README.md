# Aluno: Lucas Luiz Guesser

## Discussão sobre os melhores casos de uso de busca linear e busca binária na busca por valores no inicio, meio e fim. Algoritmo retorna primeiramente o número de comparações feitas e posteriormente o tempo de compilação. O código sempre é compilado com o range sendo o dobro da quantidade.

## Valores no início:

### Busca Linear:

#### Vetor com 1000 elementos:

```azure
0
Tempo: 7 ms
```

#### Vetor com 10000 elementos:

```azure
0
Tempo: 93 ms
```

#### Vetor com 100000 elementos:

```azure
0
Tempo: 9208 ms
```

### Busca Binária:

#### Vetor com 1000 elementos:

```azure
8
Tempo: 7 ms
```

#### Vetor com 10000 elementos:

```azure
12
Tempo: 104 ms
```

#### Vetor com 100000 elementos:

```azure
15
Tempo: 8994 ms
```

Conclusão: Vemos que apesar do tempo de compilação ser muito semelhante 
entre as duas funções, claramente a Busca Linear é superior
a Busca Binária quando se trata de buscar o primeiro elemento, 
por questões lógicas e aqui provado pelo número de buscas comparadas.

## Valores no meio:

### Busca linear:

#### Vetor com 1000 elementos: 

```azure
500
Tempo: 9 ms
```

#### Vetor com 10000 elementos: 

```azure
5000
Tempo: 119 ms
```

#### Vetor com 100000 elementos:

```azure
50000
Tempo: 9897 ms
```

### Busca binária:

#### Vetor com 1000 elementos:

```azure
0
Tempo: 6 ms
```

#### Vetor com 10000 elementos:

```azure
0
Tempo: 84 ms
```

#### Vetor com 100000 elementos:

```azure
0
Tempo: 8963 ms
```

Conclusão: Novamente os tempos de compilação são muito semelhantes, 
mas a diferença enorme está na contagem de buscas, 
aonde vemos uma diferença enorme em favor da Busca binária em favor 
da Busca linear, quando se trata de buscar dados localizados 
no meio do vetor.

## Valores no fim:

### Busca linear:

#### Vetor com 1000 elementos:

```azure
999
Tempo: 7 ms
```

#### Vetor com 10000 elementos:

```azure
9999
Tempo: 95 ms
```

#### Vetor com 100000 elementos:

```azure
99999
Tempo: 10500 ms
```

### Busca binária:

#### Vetor com 1000 elementos:

```azure
8
Tempo: 4 ms
```

#### Vetor com 10000 elementos:

```azure
12
Tempo: 69 ms
```

#### Vetor com 100000 elementos:

```azure
15
Tempo: 8795 ms
```

Conclusão: Obviamente a busca linear é extremamente mais custosa
que a busca binária para dados inseridos no fim por motivos lógicos,
mas o interessante é percebemos o mesmo custo de procura com busca binária
buscando dado no início e dado no fim do vetor.

## Conclusões gerais:

Quando buscamos um dado logo no início do vetor, a busca linear
é claramente a mais eficiente, mas quando interpolamos isso para as buscas
de dados no meio e no fim do vetor, a busca binária se mostra muito superior
a linear. Destaque para o fato da busca binára ter o mesmo custo de procura
nos dados no início e fim do vetor.

## Comparação de tempo de compilação usando Arrays.binarySearch:

### Valor no início:

#### Vetor com 1000 elementos:

```azure
Tempo Arrays.binarySearch: 4 ms
```

#### Vetor com 10000 elementos:

```azure
Tempo Arrays.binarySearch: 70 ms
```

#### Vetor com 100000 elementos:

```azure
Tempo Arrays.binarySearch: 8885 ms
```

Conclusão: Vemos que na busca pelo valor no inicio a função
Arrays.binarySearch nativa do Java é mais rápida
que a minha função, mas não é algo muito discrepante, principalmente no 
vetor de 100000 elementos.

### Valor no meio:

#### Vetor com 1000 elementos:

```azure
Tempo Arrays.binarySearch: 4 ms
```

#### Vetor com 10000 elementos:

```azure
Tempo Arrays.binarySearch: 68 ms
```

#### Vetor com 100000 elementos:

```azure
Tempo Arrays.binarySearch: 8881 ms
```

Conclusão: Assim como o valor no inicio, o valor do meio também é mais eficiente
com a função nativa do Java, mas a diferença novamente não é muito acentuada,
principalmente no vetor de 100000 elementos.

### Valor no fim:

#### Vetor com 1000 elementos:

```azure
Tempo Arrays.binarySearch: 4 ms
```

#### Vetor com 10000 elementos:

```azure
Tempo Arrays.binarySearch: 69 ms
```

#### Vetor com 100000 elementos:

```azure
Tempo Arrays.binarySearch: 8812 ms
```

Conclusão: A mesma dos valores anteriores, a função nativa do Java é mais eficiente,
mas não por muita diferença, e foi constatado maior eficiência da função nativa
no vetor de 100000 elementos.

## Suponha que você esteja procurando uma palavra em um dicionário. O dicionario tem 240000 palavras.Na pior das hipóteses, de quantas etapas você acha que a busca sequencial e busca binária precisaria? Consegue generalizar para qualquer entrada n?

Resposta: Na pior das hipóteses na busca sequencial, eu precisaria de 2399999 buscas.
Na pior das hipóteses com busca binária se calcula log2(n) ou log2(240000), que seria 17,87 ou 18.

## Desafio: Busca fibonacci:

### Vetor com 1000 elementos:

#### Valor no inicio: 

```azure
22
Tempo: 10 ms
```

#### Valor no meio:

```azure
24
Tempo: 11 ms
```

#### Valor no fim:

```azure
17
Tempo: 10 ms
```

### Vetor com 10000 elementos.

#### Valor no inicio:

```azure
28
Tempo: 157 ms
```

#### Valor no meio:

```azure
32
Tempo: 139 ms
```

#### Valor no fim:

```azure
24
Tempo: 170 ms
```

### Vetor com 100000 elementos:

#### Valor no início:

```azure
35
Tempo: 9240 ms
```

#### Valor no meio:

```azure
38
Tempo: 9389 ms
```

#### Valor no fim:

```azure
27
Tempo: 9106 ms
```

### Conclusão do desafio:

A busca por fibonacci se mostrou um pouco mais demorada em compilação e precisou de mais 
buscas do que a busca binária, mas no geral a discrepância não foi grande, principalmente no vetor
de 100000 elementos.