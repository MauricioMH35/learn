# HELLO WORLD
*PROJETO LEARN JAVA*
- [Aplicação](#aplicação)
- [Executar](#executar)
- [Para abrir o projeto](#para-abrir-o-projeto)
- [Executando aplicação no terminal](#executando-aplicação-no-terminal)
- [Erro na execução do comando](#erro-na-execução-do-comando)
- [Abrindo o projeto](#abrindo-o-projeto)

## APLICAÇÃO

Essa aplicação tem como principal objetivo mostrar uma mensagem na tela do terminal, sendo esta mensagem ("Hello World!"), ela devera aparecer quando o usuário executar a aplicação.

#### EXECUTAR

Se você deseja apenas executar a aplicação, não tendo a necessidade de abrir o projeto da aplicação, será necessário apenas que você tenha instalado o [JRE/Java Runtime Environment](https://java.com/pt-BR/download/). Esse ambiente Java permite que você execute a aplicação **Hello World** ou qualquer outra aplicação em Java que você queira.

#### PARA ABRIR O PROJETO

No entanto se o seu objetivo é abrir o projeto, ao invés de instalar o JRE, instale o [JDK/Java Development Kit](https://www.oracle.com/java/technologies/javase-downloads.html), e como também uma IDEA de sua preferência, como o [Intellij Community](https://www.jetbrains.com/pt-br/idea/download), assim você será capaz de abrir, editar e até mesmo executar a aplicação dentro da IDEA.

#### EXECUTANDO APLICAÇÃO NO TERMINAL

Para executar a aplicação seja usando o JRE/JDK, você pode executar no terminal do seu sistema operacional o seguinte comando:

```
java -jar target/HelloWorld.jar
```

> Pressione [Enter] para executar o comando no seu terminal!

Com esse comando digitado em seu terminal, deverá ser mostrado a mensagem: **Hello World**.

#### ERRO NA EXECUÇÃO DO COMANDO

Caso você esteja obtendo erro ao tentar executar o comando no terminal da sua máquina, verifique se o JRE/JDK está realmente instalado com o comando:

```
java --version
```

> Pressione [Enter] para executar o comando no seu terminal!

Se o retorno do comando que você executou acima não mostrar a versão do Java instalada na sua máquina, tente verificar se a variável de ambiente esta realmente configurada no sistema operacional para receber o ambiente Java. Algumas vezes quando instalamos programas que necessitam dessa configuração, ela não ocorre durante a instalação do programa, sendo assim dê uma verificada se ela realmente está configurada.


#### ABRINDO O PROJETO

Para usar o projeto da aplicação como dito mais acima instale alguns programas que devem estar na sua máquina para que você consiga abrir ou editar o código fonte da aplicação **Hello World**.

1. [JDK \(JAVA Development Kit\)](https://www.oracle.com/java/technologies/javase-downloads.html)
2. [IDEA Intellij Community](https://www.jetbrains.com/pt-br/idea/download)

Outras opções de IDEAs:
1. [NetBeans](https://netbeans.apache.org/download/)
2. [Eclipse](https://www.eclipse.org/downloads/)

Agora com os programas já baixados e devidamente instalados na sua máquina abra o diretório do projeto "Hello World" com a IDEA da sua preferência, no caso eu listei o Intellij como a IDEA principal para a construção do projeto, mas se você preferir escolher outra, isso não fará diferença alguma para a abertura do projeto, e até mesmo você pode abrir com um bloco de notas o código do projeto.

Com o projeto aberto você agora é capaz de visualizar a construção daaplicação **Hello World**.
