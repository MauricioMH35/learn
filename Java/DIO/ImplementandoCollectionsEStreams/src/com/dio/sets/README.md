# HashSet

O *HashSet* não possui uma ordem definida, e uma particularidade entre o *HashSet*, *LinkedHashSet* e *TreeSet*, é que ambos não adicionam valores repetidos. Por não ser ordenado e não permitir que valores repetidos sejam adicionados a fila, o *HashSet* dentre os três é o mais performático.

| Comando | Descrição |
| -: | :- |
| ``` Set<TIPO> nomeVariavel = new HashSet<>(); ``` | Cria uma instância do ``` HashSet ``` |

# LinkedHashSet

Ele sempre mantém os elementos na ordem de criação, e quando novos itens são adicionados sempre serão os últimos, pois segue o conceito de fila, onde o primeiro que entra é o primeiro a ser atendido. Ou seja, mantém a ordem de inserção dos elementos, isso torna dela uma implementação mais lenta, por tentar manter a ordem deste elementos.

| Comando | Descrição |
| -: | :- |
| ```Set<TIPO> nomeVariavel = new LinkedHashSet<>();``` | Cria uma instância do ```LinkedHashSet``` |

# TreeSet

Útil para o uso de Comparators por estar sempre em ordem, isso faz com que a leitura dos elementos seja mais performático, mas quando à necessidade de modificar estes elementos, seja para adicionar, remover ou alterar, ele se torna mais lento que o *LinkedHashSet*, por sempre ordenar os elementos quando alguma alteração é feita.

| Comando | Descrição |
| -: | :- |
| ```TreeSet<TIPO> nomeVariavel = new TreeSet<>();``` | Cria uma instância da ```TreeSet``` |
| ```nomeVariavel.first();``` | Retornar o primeiro item/valor da árvore |
| ```nomeVariavel.last();``` | Retorna o último item/valor da árvore |
| ```nomeVariavel.higher(VALOR);``` | Retorna o item/valor antes de VALOR |
| ```nomeVariavel.lower(VALOR);``` | Retorna o item/valor após VALOR |
| ```nomeVariavel.pollFirst();``` | Retorna o primeiro item/valor da árvore <br/>e o remove |
| ```nomeVariavel.pollLast();``` | Retorna o último item/valor da árvore <br/>e o remove |
