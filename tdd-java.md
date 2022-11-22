# TDD E Java: Teste Automatizados Com JUnit <!-- omit in toc -->

## Links Importantes <!-- omit in toc -->

## Menu <!-- omit in toc -->

* [Aulas](#aulas)
  * [Motivação Dos Teste Automatizados](#motivação-dos-teste-automatizados)
  * [Escrevendo Um Teste Automatizado](#escrevendo-um-teste-automatizado)
  * [JUnit](#junit)
  * [Escrevendo Um Teste Com O JUnit](#escrevendo-um-teste-com-o-junit)

## Aulas

### Motivação Dos Teste Automatizados

Essa é uma maneira de garantir que o código está funcionando; os testes manuais não conseguem dar conta de cobrir todos os cenários, levam tempo para serem realizados; os automátizados elimimam o fator humano, são mais rápidos; dão certa confiança ao mexer com código de outros desenvolvedores.

### Escrevendo Um Teste Automatizado

Acabamos de nascer para os testes; iremos começar com algo bem simples, dado um classe calculadora que sabe somente como somar, criaremos alguns testes para ela.

Afim de tentar resolver esse problema, criamos a classe `CalculadoraTestes`, nela instanciaremos a `Calculadora` e realizaremos algumas operações:

```java
 Calculadora calculadora = new Calculadora();
int soma = calculadora.somar(3, 7);
System.out.println(soma);

soma = calculadora.somar(3, 0);
System.out.println(soma);

soma = calculadora.somar(0, 0);
System.out.println(soma);

soma = calculadora.somar(3, -7);
System.out.println(soma);
```

´´´console
10
3
0
-4
´´´

Até aqui é fácil verificar que o resultado saiu como o esperado.

Vamos imaginar que nossa calculadora começe a ganhar algumas funções a mais, e que os cenários de testes começem a ficar mais complexos. É fácil de notar que o modelo de teste utilizado não irá funcionar; essa foi a motivação da criação de uma biblioteca que de suporte aos nossos testes.

### JUnit

Direto-Reto: Essa é a biblioteca padrão para testes automatizados em Java, meio que ela reina sozinha no role. Seu foco é o teste de unidade.

### Escrevendo Um Teste Com O JUnit

A classe de teste deve ser CLasseTest
