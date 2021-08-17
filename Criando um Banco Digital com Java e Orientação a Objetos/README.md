# Criando um Banco Digital com Java e Orientação a Objetos


### Modelagem dos Dados

1. Uma pessoa é definida no sistema com as seguintes características: nome, gênero,  data de nascimento e CPF.
2. A instituição bancária deve ser criada assim que a aplicação inicia e ela deve possuir os seguintes dados: nome, data de criação e o código da agência bancária.
3. Sobre a modelagem da conta deve atender os seguintes requisitos:
    1. Uma pessoa deve possuir apenas uma conta cadastrada
    2. Uma conta deve ser definida da seguinte forma: agência, número, pessoa, ativa e saldo.
4. Em uma conta digital deve ser possível ter ou fazer: transferência bancária para outra pessoa, solicitar cartão de crédito, sacar e depositar dinheiro. 
    1. Em uma transação bancária deve conter os dados da conta de quem está transferindo, quem está recebendo e data dessa operação e verificar se o saldo de quem está transferindo é menor ou igual ao saldo disponível dessa pessoa.
    2. Na solicitação de cartão de crédito deve ser analisado o saldo que essa pessoa possui, caso ela tenha a mais de R$ 50,00 a solicitação deverá ser aprovada e deve ser gerado automaticamente o número do cartão, data de expiração e o código de segurança.
    3. No saque de dinheiro o sistema deverá verificar o saldo atual e ver se aquele valor é menor ou igual ao saldo da conta.
    4. No depósito de dinheiro deve ser obrigatoriamente identificado para qual conta está sendo depositado e o valor do depósito. 

### Funcionalidades

Na NuJava é possível criar uma conta, exibir o seu saldo atual, depositar, sacar, solicitar cartão de crédito e realizar transferência entre contas.

- Exemplo da aplicação sendo executada: <br />
![Executando o NuJava](https://user-images.githubusercontent.com/38151364/109973650-72287900-7cd7-11eb-9316-40f1d01fa5eb.png)

### Requisitos

Deve-se ter instalado a versão do Java [1.7](https://docs.oracle.com/javase/7/docs/api/) 

### Como compilar

Para compilar o projeto basta executar o comando abaixo:

```bash
cd local_projeto/wallet-java/src/br/esig/com/nujava/main/
```

```java
javac BancoDigital.java
```

### **Autor**

- **Alex Rogério** - [alexrogeriodj](https://github.com/alexrogeriodj)

### Palavras-chave

- Java
