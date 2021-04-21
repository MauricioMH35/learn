# LISTAS

## ArrayList/Vector

Essas duas interfaces Java facilitam a manipulação de *Arrays* sem que haja a necessidade de criar ou destruir Arrays para manipula-los, pois os Arrays são estáticos e não podem sofrer modificações, apenas os elementos adicionados na criação do Array podem ser consultados e caso deseje adicionar remover ou atualizar algum dos elementos, terá que criar um novo Array para fazer tal modificação. Sendo assim ela facilita a manipulação de forma dinâmica, podendo ser adicionados novos itens, remove-los, ou atualiza-los.

O *ArrayList* e o *Vector* são muito parecidos com uma diferença do *Vector* ser sincronizado, podendo controlar melhor bloqueios, leituras simultâneas e gravações em lote, apesar de ser possível utilizar o ```Collections.synchronizedList``` para criar uma lista sincronizada igual ao *Vector*.

## Comandos básicos

| Comando | Descrição | Retorno |
| :- | :- | :- |
| ```List<TIPO> nomeVariavel = new ArrayList<>();``` | Cria uma instância do ```ArrayList``` | ``` Não Retorna ``` |
| ```nomeVariavel.add(VALOR);``` | Adiciona VALOR para a lista | ``` Não Retorna ``` |
| ```nomeVariavel.set(INDICE, VALOR);``` | Insere um VALOR no INDICE indicado/<br/>Atualiza VALOR já existente | ``` Não Retorna ``` |
| ```nomeVariavel.remove(INDICE);``` | Remove VALOR usando seu INDICE<br/>(A posição do item na lista) | ```Não Retorna ``` |
| ``` nomeVariavel.remove(VALOR); ``` | Remove VALOR na lista com o objeto | ``` Não Retorna ``` |
| ``` nomeVariavel.indexOf(VALOR); ``` | Descobre o valor do INDICE usando o <br/>objeto | ``` Integer ``` |
| ``` nomeVariavel.size(); ``` | Quantidade de itens | ``` Integer ``` |
| ``` nomeVariavel.get(INDICE); ``` | Pega VALOR indicado por um INDICE | ``` VALOR/OBJETO ``` |
| ``` nomeVariavel.contains(VALOR); ``` | Verifica se contem VALOR | ``` boolean ``` |
| ``` nomeVariavel.isEmpty(); ``` | Verifica se a lista está vazia | ``` boolean ``` |
| ``` nomeVariavel.clear(); ``` | Limpa a lista | ``` Não Retorna ``` |
| ``` Collections.sort(nomeVariavel); ``` | Ordena lista em ordem alfabética | ``` Não Retorna ``` |

### Navegação no ArrayList

Existem uma infinidade de formas de se navegar em uma lista, mas existem duas formas das mais conhecidas, que é utilizando o famoso *foreach* e o *iterator*.

* Foreach
```
  List<String> arrayList = new ArrayList<>();

  for(String objectList : arrayList) {
    System.out.println(objectList); // O objeto/valor da lista durante a navegação
  }
```

* Iterator
```
  List<String> arrayList = new ArrayList<>();

  Iterrator<String> iterator = arrayList.iterator();
  while(iterator.hasNext()) { // Verifica se há itens
    System.out.println(iterator.next());// O objeto/valor da lista durante a navegação
  }
```
