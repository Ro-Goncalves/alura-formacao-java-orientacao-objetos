# Java 8: Conheça As Novidade Dessa Versão <!-- omit in toc -->

## Links Importantes <!-- omit in toc -->

* https://www.alura.com.br/artigos/git-flow-o-que-e-como-quando-utilizar
* https://pt.stackoverflow.com/questions/116069/qual-%C3%A9-a-finalidade-do-simbolo-no-java

## Menu <!-- omit in toc -->

- [Aulas](#aulas)
  - [Default Methods](#default-methods)
  - [Que Venham Os Lambdas](#que-venham-os-lambdas)

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