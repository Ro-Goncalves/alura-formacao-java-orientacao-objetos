# Java 8: Conheça As Novidade Dessa Versão <!-- omit in toc -->

Agora o role está ficando interessante, estava meio desanimado com o tanto de teoria que estava vendo até agora. É muito massa trabalhar com as ***Lambdas Functions*** e com os ***Method Reference***, essas "tecnicas" deixam o código muito mais elegante.

Meu objetivo é chegar ao "estado da arte" na escrita de códigos, esse curso está sendo um passo muito importente rumo a esse objetivo.

Ao mesmo tempo que faço esse curso, estou estudando ***Git Flow***, topo de mais. Preciso disso para desenvolver sozinho, obvio que não, só não nego aprender coisas novas.

>Olhar para o topo mais alto e nunca desistir de escalar a montanha.

Que Deus me ajuda a superar todas as dificuldades; que meu maior objetivo seja a busca da verdade.

## Links Importantes <!-- omit in toc -->

* [ORACLE - Documentação Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)
* [TUTORIALSPOINT - Java 8 - Default Methods](https://www.tutorialspoint.com/java8/java8_default_methods.htm)
* [GEEKSFORGEEKS - Default Methods In Java 8](https://www.geeksforgeeks.org/default-methods-java/)
* [GEEKSFORGEEKS - Lambda Expressions in java 8](https://www.geeksforgeeks.org/lambda-expressions-java-8/)
* [STACKOVERFLOW - Sobre Méthod Reference](https://pt.stackoverflow.com/questions/116069/qual-%C3%A9-a-finalidade-do-simbolo-no-java)
* [ALURA - Java 8: Lambda Ou Method Reference? Entenda A Diferença](https://www.alura.com.br/artigos/java-8-lambda-ou-method-reference-entenda-a-diferenca)
* [ORACLE - Processing Data With Java SE 8 Streams, Part 1](https://www.oracle.com/technical-resources/articles/java/ma14-java-se-8-streams.html)
* [GEEKSFORGEEKS - Java 8 Stream tutorial](https://www.geeksforgeeks.org/java-8-stream-tutorial/)

## Menu <!-- omit in toc -->

* [Aulas](#aulas)
  * [Default Methods](#default-methods)
  * [Que Venham Os Lambdas](#que-venham-os-lambdas)
  * [Código Mais Sucinto Com Method References](#código-mais-sucinto-com-method-references)
  * [Streams: trabalhando Melhor Com Coleções](#streams-trabalhando-melhor-com-coleções)
    * [Características](#características)
  * [Mais Streams, Collectors e APIs](#mais-streams-collectors-e-apis)
  * [A Nova API De Datas](#a-nova-api-de-datas)

## Aulas

### Default Methods

O **Java 8** trouxe muitas coisas novas. Vamos conversar um pouco sobre os **Defauts Methods** e os **Static Default Methods**. Eles podem ser utilizados em interfaces dando a possibilidade delas terem novos métodos sem *quebrar* as classes que as implementam.

>Isso é tão mágico abriu caminho para os **lambdas** e **methods refereces**.

Chega de lorota, vamos ver como isso funciona, no fundo não tem nada de mais: eles são métodos implementados em interfaces que possuem um corpo.

```java
public interface vehicle {

   default void print() {
      System.out.println("I am a vehicle!");
   }

   static void blowHorn() {
      System.out.println("Blowing horn!!!");
   }
}
```

### Que Venham Os Lambdas

Agora começamos a nós torbar *magos dos códigos* cujo poder principal e desenvolver códigos limpos e expressivos, tudo isso é graças às **Lambdas**. Elas representam instâcias de uma **interfaces funcionais**, essas são aquelas que possuem um unico método abstrato. A sintaxe dela é basicamente:

>Parametros -> Corpo

Algumas caracteristicas:

* A declaração do tipo de parâmetro é opcional.
* Os **parênteses** nos parâmetros são opcionais quando só utilizamos um parâmetro e obrigatório nos demais casos.
* As **chaves** são opcionais quando o corpo tiver somente uma chamada, obrigatório nos demais casos.
* A palavra chave **return** é opcional.

### Código Mais Sucinto Com Method References

Se com as Lambdas somos o *Mister M* com os **Methods References** somos o *Mago Nego*. Devo concordar que é um tanto quanto difícil intender o que está acontecendo quando as olhamos pela primeira vez; confesso que ainda devem existir lacuas no meu conhecimento sobre esse tema.

Fato é: o código fica realmente elegante quando utilizamos methods reference.

```java
palavras.sort(Comparator.comparing(String::length));

curso.sort(Comparator.comparing(Curso::getAlunos));
```

Os methods references podem ser vistos em `String::length` e `Curso::getAlunos`, essa é a sintaxe.

Claro que eles não possuem tanto poder quanto as Lambdas, porém é sempre bom utiliza-los quando estamos trabalhando com métodos que não precisam receber parâmetros; eles possibilitam a redução na escrita dos Lambdas e para isso necessitam que o método da direita receva os mesmos parâmetros do da esquerda.

### Streams: trabalhando Melhor Com Coleções

Agora é a hora de juntarmos um tanto do que vimos até agora, *Mago Do Caos*?

Eis que no Java 8 surge a API Stream, a usamos para processar coleções de objetos; o massa é que elas geram um fluxo onde podemos encadear vários métodos. Como sempre éla é uma interface que da acesso ao método `stream()`.

```java
Stream magoCaos = magoNego.stream();
```

Os componentes básicos envolvidos em streams são:

* Sequência de Elementos
* Fonte
* Operações de agregação
* Pipelining
* Iteração interna

#### Características

As colections possuem stream
Interface fluente

### Mais Streams, Collectors e APIs

Optional nos ajuda a tabalhar com objetos, trata casos de null
Collectors volta de stream para list
parallelStream streams em paralelo

### A Nova API De Datas
