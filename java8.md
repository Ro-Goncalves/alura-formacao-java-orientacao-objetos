# Java 8: Conheça As Novidade Dessa Versão <!-- omit in toc -->

Agora o role está ficando interessante, estava meio desanimado com o tanto de teoria que estava vendo até agora. É muito massa trabalhar com as ***Lambdas Functions*** e com os ***Method Reference***, essas "tecnicas" deixam o código muito mais elegante.

Meu objetivo é chegar ao "estado da arte" na escrita de códigos, esse curso está sendo um passo muito importente rumo a esse objetivo.

Ao mesmo tempo que faço esse curso, estou estudando ***Git Flow***, topo de mais. Preciso disso para desenvolver sozinho, obvio que não, só não nego aprender coisas novas.

>Olhar para o topo mais alto e nunca desistir de escalar a montanha.

Que Deus me ajuda a superar todas as dificuldades; que meu maior objetivo seja a busca pela verdade.

## Links Importantes <!-- omit in toc -->

* [ORACLE - Documentação Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)
* [STACKOVERFLOW - Sobre Méthod Reference](https://pt.stackoverflow.com/questions/116069/qual-%C3%A9-a-finalidade-do-simbolo-no-java)

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

Intefaces podem ter métodos defaut

```java
default void sort(Comparator<? super E> c){
    Collections.sort(this, c);
}
```

### Que Venham Os Lambdas

Classe anônima, interface com somente um método abstrado, da para usar lambda. Interface funcional.

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
