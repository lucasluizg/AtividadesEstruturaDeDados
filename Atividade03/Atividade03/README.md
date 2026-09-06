#### 1. Por que essa abordagem usando um array de instâncias da classe Vetor torna a busca de um contatomais rápida em comparação com a versão anterior (uma única lista contendo todos os contatos)?

Porque ao invés de fazer uma busca um por um como na linear ou dividindo a metade na binária, se faz um filtro, organizando cada dado em no seu respectivo vetor de acordo com a primeira letra, economizando os recursos de busca.

#### 2. O que acontece com o desempenho da busca se a maioria dos contatos cadastrados começar com a mesma letra (ex: centenas de nomes iniciando com a letra "M")? O sistema continuará rápido? Justifique.

O sistema ainda continuará rápido pois o filtro sempre é feito na primeira letra, então mesmo com o Vetor recebendo vários dados, o fato de não ter que percorrer todas as letras ou dividir o valor, indo diretamente na filtragem, dá uma eficiência perene ao código.