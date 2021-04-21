# IMPLEMENTANDO COLLECTIONS E STREAMS

## API de Colleções/Collections

1. Entender o uso da interface java.util.List
2. Entender o uso da interface java.util.Queue
3. Entender o uso da interface java.util.Set
4. Entender o uso da interface java.util.Map

## Introdução

* Arrays: podendo ser chamado de Estrutura de Dados, ou até mesmo de Conjunto de dados. Um array consegue armazenar os dados em uma posição na memória que a divide em um conjunto de dados armazenados em blocos menores nesta posição.
* Java Collections.API: construída em cima da API de arrays para resolver problemas de construção de arrays, entre adição de novos itens dentro de um array, onde o mesmo é estático, não permitindo que novos valores sejam adicionados, ou até removidos.
* java.util.Collections: sendo a interface principal da API de collections da linguagem Java, essa interface possui as funcionalidades básicas de arrays.

## java.util.Queue

utilizando java.util.LinkedList.
Garante ordem de inserção.
Permite adição, leitura e remoção considerando a regra básica de uma fila: Primeiro que entra, primeiro que sai.
Não permite mudança de ordenação.
Como a operação do *queue* se baseia na regra de filas ele não permite a atualização ou modificação de uma dado existente na lista, fazendo com que, sempre quando um item necessitar ser modificado ele devera ser retirado da fila quando chegar sua ordem para que possa ser modificado e jogado para traz ou simplesmente criar um valor que deveria ser modificado em determinado momento para que este seja jogado para o final da fila.