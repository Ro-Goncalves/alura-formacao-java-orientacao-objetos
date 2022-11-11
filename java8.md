# Java 8: Conheça As Novidade Dessa Versão <!-- omit in toc -->

## Links Importantes <!-- omit in toc -->

* [JAVADOC - Collections](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html)

## Menu <!-- omit in toc -->

- [Aulas](#aulas)
  - [Default Methods](#default-methods)

## Aulas

### Default Methods

Intefaces podem ter métodos defaut

```java
default void sort(Comparator<? super E> c){
    Collections.sort(this, c);
}
```
