# Aula00EstruturaDeDados

## Atividade 2
````mermaid

classDiagram

class Imovel{
 - descricao: String
 - endereço:  String
 - preco: double
}

class Inquilino{
    - nome: String
    - CPF: int
    - telefone: int
}

class Contrato{
    - codigo: Random
    - dataInicio: localDate
    - dataFim: localDate
    - valorFinal: double
    - inq: Inquilino
    - imo: imovel
    + contrato(c: Random, dI: localDate, dF: localdate, vF: double, inq: Inquilino, imo: Imovel) void
    + verDetalhes(contrato: Contrato) void
 }
 
 class histContratos{
     - inq: Inquilino
     + verHistorico(inq: Inquilino)
 }
 
 Imovel "1..*"-->"1" Contrato
 Contrato"1"<-- "1"Inquilino
 Contrato"1..*"<--"1"histContratos
 
 
````

## Atividade 3

Defina TADs para os tipos de dados estruturados para as entidades listadas a seguir especificando detalhadamente a interface completa. A interface deve incluir todas os atributos e operações necessárias para a correta manipulação do tipo, dentre elas os métodos de inicialização, modificação, e consulta

### Livro

Variável identificando o título do livro.<br>
Variável identificando o código do livro.<br>
ArrayList com uma lista de livros com títulos e códigos.<br>
Método adicionando o livro por título e código na ArrayList.<br>
Método buscando o livro por título e código na ArrayList.<br>
Método excluindo o livro por título e código na ArrayList.<br>



### Círculo

Variável identificando o raio do círculo.<br>
Variável identificando a circunferência do círculo.<br>
ArrayList com uma lista de círculos com raios e circunferência.<br>
Método adicionando o círculo por raio e circunferência na ArrayList.<br>
Método buscando o círculo por raio e circunferência na ArrayList.<br>
Método excluindo o livro por raio e circunferência na ArrayList.<br>


### Filme

Variável identificando o título do filme.<br>
Variável identificando o gênero do filme.<br>
Variável identificando o diretor do filme.<br>
Variável identificando o ano do filme.<br>
ArrayList com uma lista de filmes com título, gênero, diretor e ano.<br>
Método adicionando o filme com título, gênero, diretor e ano na ArrayList.<br>
Método buscando o filme com título, gênero, diretor e ano na ArrayList.<br>
Método excluindo o filme com título, gênero, diretor e ano na ArrayList.<br>

### Pessoa

Variável com o nome da pessoa.<br>
Variável com a idade da pessoa.<br>
Variável com o gênero da pessoa.<br>
Variável com a altura da pessoa.<br>
Variável com o peso da pessoa.<br>
ArrayList com uma lista de pessoa com nome, idade, gênero, altura, peso.<br>
Método adicionando a pessoa com nome, idade, gênero, altura, peso.<br>
Método buscando a pessoa com nome, idade, gênero, altura, peso.<br>
Método excluindo a pessoa com nome, idade, gênero, altura, peso.<br>

### Aluno

Variável com o nome do aluno.<br>
Variável com a matrícula do aluno.<br>
ArrayList com uma lista de aluno com nome e matrícula.<br>
Método adicionando o aluno com nome e matrícula.<br>
Método buscando o aluno com nome e matrícula.<br>
Método excluindo o aluno com nome e matrícula.<br>

### Item de estoque

Variável com o nome do item.<br>
Variável com o código de barras do item.<br>
ArrayList com uma lista com o nome e o código de barras.<br>
Método adicionando o item com nome e código de barras.<br>
Método buscando o item com nome e código de barras.<br>
Método excluindo o item com nome e código de barras.<br>

### Conta bancária

Variável com o nome do cliente.<br>
Variável com o código da conta.<br>
Variável com o saldo da conta.<br>
ArrayList com o nome e o código.<br>
Método adicionando o cliente com nome e código.<br>
Método buscando o cliente com nome e código.<br>
Método excluindo o cliente com nome e código.<br>
Método buscando o cliente com nome e código e adicionando saldo.<br>
Método buscando o cliente com nome e código e removendo saldo.<br>

