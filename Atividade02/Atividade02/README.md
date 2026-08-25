# Aluno: Lucas Luiz Guesser

## Discussão sobre os melhores casos de uso de busca linear e busca binária na busca por valores no inicio, meio e fim. Algoritmo retorna primeiramente o número de comparações feitas e posteriormente o tempo de compilação. O código sempre é compilado com o range sendo o dobro da quantidade.

## Valores no início:

### Busca Linear:

#### Vetor com 1000 elementos:

```
0
Tempo: 7 ms
```

#### Vetor com 10000 elementos:

```
0
Tempo: 93 ms
```

#### Vetor com 100000 elementos:

```
0
Tempo: 9208 ms
```

### Busca Binária:

#### Vetor com 1000 elementos:

```
8
Tempo: 7 ms
```

#### Vetor com 10000 elementos:

```
12
Tempo: 104 ms
```

#### Vetor com 100000 elementos:

```
15
Tempo: 8994 ms
```

Conclusão: Vemos que apesar do tempo de compilação ser muito semelhante entre as duas funções, claramente a Busca Linear é superior a Busca Binária quando se trata de buscar o primeiro elemento, por questões lógicas e aqui mostrando pelo número de buscas comparadas.

## Valores no meio:

### Busca linear:

#### Vetor com 1000 elementos: 

```
500
Tempo: 9 ms
```

#### Vetor com 10000 elementos: 

```
5000
Tempo: 119 ms
```

#### Vetor com 100000 elementos:

```
50000
Tempo: 9897 ms
```

### Busca binária:

#### Vetor com 1000 elementos:

```
0
Tempo: 6 ms
```

#### Vetor com 10000 elementos:

```
0
Tempo: 84 ms
```

#### Vetor com 100000 elementos:

```
0
Tempo: 8963 ms
```

Conclusão: Novamente os tempos de compilação são muito semelhantes, mas a diferença enorme está na contagem de buscas, aonde vemos uma diferença enorme em favor da Busca binária em favor da Busca linear, quando se trata de buscar dados localizados no meio do vetor.