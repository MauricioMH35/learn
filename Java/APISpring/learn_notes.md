PARA CRIAR UMA FAT/UBER JAR USANDO O MAVEN

1. Verificar se no arquivo pom.xml existem os seguintes comandos:
```
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```

2. No terminal do projeto inserir o seguinte comando. Lembrando de que o terminal deve estar aberto no caminho do projeto.
```
mvn clean install
```

PARA EXECUTAR O ARQUIVO/EXECUTAVEL JAR/UBER JAR DO JAVA.

1. Lembre de estar com o terminal aberto no diretório onde se encontra o arquivo FAT JAR, assim execute o comando descrito abaixo:
```
java -jar ApiSpring-0.0.1-SNAPSHOT.jar
```