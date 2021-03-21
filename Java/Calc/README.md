# CALC

*PROJETO LEARN JAVA*
* [Aplicação](#aplicação)
  * [Usando a calculadora](#usando-a-calculadora)

## APLICAÇÃO

A calculadora aritmética tem como principal objetivo calcular uma operação que deve ser indicada por você durante o uso desta aplicação.

Não possui uma interface gráfica, usando apenas o próprio terminal[\[0\]](#terminal) do seu sistema operacional para capturar as informações que serão inseridas, e como também passar os resultados/informações usando do mesmo meio \(terminal\)[\[0\]](#terminal).

### USANDO A CALCULADORA

Para utilizar a calculadora deve-se possuir o ambiente Java para executar a aplicação, pois a construção dessa foi construída em cima da linguagem indicada acima.

Você pode optar por possuir apenas o [JRE \(Java Runtime Environment\)](https://java.com/pt-BR/download/)[\[1\]](#jre-java-runtime-environment), ou caso você opte pelo ambiente de desenvolvimento, você deverá possuir o [JDK \(Java Development Kit\)](https://www.oracle.com/java/technologies/javase-downloads.html)[\[2\]](#jdk-java-development-kit).

Agora com o ambiente instalado e configurado na sua máquina, você pode abrir seu terminal[\[0\]](#terminal) e inserir o seguindo comando para que a aplicação possa ser iniciada.

> Mas lembre de entrar no seu terminal com o caminho onde a aplicação **calc** se encontra, pois se você tentar executar o comando abaixo sem estar no diretório da aplicação ele não vai funcionar.

```
java -jar ./terger/Calc.jar
```

Depois de executado o comando citado acima, você deve receber as informações da calculadora no seu próprio terminal. A aplicação irá aguardar até que seja colocado o tipo de operador aritmético desejado e os dois números que devem ser calculados, ambos passados no próprio terminal, digitado por você.

Como exemplo usarei o operador *adição* e os números *3* e *4* para efetuar o procedimento que a calculadora deve calcular. Você deverá visualizar algo como:

```
Calculadora aritmética
Para executar a operação aritmética digite uma das operações listada abaixo:
-> Adição/Adicao/A
-> Subtração/Subtracao/S
-> Multiplicação/Multiplicacao/M
-> Divisão/Divisao/D
-> Sair/Exit/E
Operador: adição

1.Número: 3
2.Número: 4
Adição: 3.0 + 4.0 = 7.0
Resultado: 7.0
```
Perceba que você pode digitar o operador usando formatações diferentes, como as listadas pela própria aplicação.

```
Para executar a operação aritmética digite uma das operações listada abaixo:
-> Adição/Adicao/A
-> Subtração/Subtracao/S
-> Multiplicação/Multiplicacao/M
-> Divisão/Divisao/D
-> Sair/Exit/E
```

Isso lhe dará um pouco mais de liberdade, por conseguir escolher digitar o nome do operador de forma completa, sem usar acentuações, ou até mesmo usando apenas a primeira letra do nome do operador.

Logo após é solicitados dois números que serão usados para efetuar o calculo.

```
1.Número: Número digitado pelo usuário
2.Número: Número digitado pelo usuário
```

Assim a calculadora conseguirá mostrar o resultado do calculo.

```
Adição: 3.0 + 4.0 = 7.0
Resultado: 7.0
```

Chegando ao fim desta operação você pode efetuar novas operações até que seja digitado como operador: *Sair*, ou *Exit*, ou *E*, assim a aplicação se encerrara mostrando a mensagem.

```
Operação finalizada!
```

## SOBRE
0. ###### ~~[Terminal]()~~
1. ###### ~~[JRE Java Runtime Environment]()~~
2. ###### ~~[JDK Java Development Kit]()~~
