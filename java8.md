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

## Menu <!-- omit in toc -->

* [Aulas](#aulas)
  * [Default Methods](#default-methods)
  * [Que Venham Os Lambdas](#que-venham-os-lambdas)
  * [Código Mais Sucinto Com Method References](#código-mais-sucinto-com-method-references)
  * [Streams: trabalhando Melhor Com Coleções](#streams-trabalhando-melhor-com-coleções)
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

Usa uma factore
palavras.sort(Comparator.comparing(s -> s.length()));

Interface Function.

Lambda dado um objeto faça.

Dado uma String chame o método length.
palavras.sort(Comparator.comparing(String::length));

Funciona para casos especificos e curtos, quando invocamos um método passando poucos ou nenhum parâmetros.

### Streams: trabalhando Melhor Com Coleções

As colections possuem stream
Interface fluente

### Mais Streams, Collectors e APIs

Optional nos ajuda a tabalhar com objetos, trata casos de null
Collectors volta de stream para list
parallelStream streams em paralelo

### A Nova API De Datas
