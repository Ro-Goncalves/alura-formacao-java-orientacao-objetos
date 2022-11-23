# TDD E Java: Teste Automatizados Com JUnit <!-- omit in toc -->

Por algum motivo os desenvolvedores não gostam de escrever código, bem eu penso que o motivo é o mesmo de todas as outras profissões, geralmente o pessoal não leva o trabalho a sério. Eu, ao menos até agora, achei fantástico o que as possibilidades da utilizaçã de testes. Até agora não utilizava em meus projeto, predendo começar.

Garantir que o que escrevemos está de acordo com a regra de negócio e que alterações não estragaram o que já estava certo já é um grande motivador para escrever bons testes.

A cada passo que dou para dentro desse oceano eu me apaixono mais pelo mundo de desenovolvimento. Que Deus não me deixe afogar e que a Verdade seja a minha búlsola.

## Links Importantes <!-- omit in toc -->

## Menu <!-- omit in toc -->

* [Aulas](#aulas)
  * [Motivação Dos Teste Automatizados](#motivação-dos-teste-automatizados)
  * [Escrevendo Um Teste Automatizado](#escrevendo-um-teste-automatizado)
  * [JUnit](#junit)
  * [Escrevendo Um Teste Com O JUnit](#escrevendo-um-teste-com-o-junit)
  * [Testando Uma Funcionalidade](#testando-uma-funcionalidade)
  * [Conhecendo TDD](#conhecendo-tdd)
  * [Implementando Uma Funcionalidade Com TDD](#implementando-uma-funcionalidade-com-tdd)
  * [Refactoring](#refactoring)
  * [Quando usar TDD](#quando-usar-tdd)
  * [Lidando com exceptions](#lidando-com-exceptions)
  * [Organizando O Código De Teste](#organizando-o-código-de-teste)
  * [Como Testar Métodos Privados](#como-testar-métodos-privados)
  * [O Que Testar Na Aplicação](#o-que-testar-na-aplicação)

## Aulas

### Motivação Dos Teste Automatizados

Realmente testar é uma tarefa maçante, ficar passando parâmentros para métodos e verificando a saída não é legal. Ainda bem que alguém resolveu pensar em como automatizar essa tarefa. Essa automação possibilitou uma cobertura maior de teste no código, menor tempo de teste e menor indice de erro humano.

Além de tudo isso, eles estimulam a evolução do código; podemos refatorar sem medo de errar. Veja que maravilha: refatoramos e rotamos o teste, dando tudo certo, é só publicar; dando errado voltamos à versão anterior e pronto, nada de errado.

### Escrevendo Um Teste Automatizado

Acabamos de nascer para os testes; iremos começar com algo bem simples: dado um classe calculadora que sabe somente como somar, criaremos alguns testes para ela.

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

No começo é tudo muito simples: Para usar JUnit no VS Code precisamos ter uma versã do Java maior do que 11 e os pluguins *Test Runner for java* e *JUnit JAR Downloader*, o segundo facilitará o download dos JARs.

Tendo tudo configurado, basta criar uma classe para teste com o mesmo nome da classe a ser testada mais o sulfixo ***Test***. Cada método dessa classe representará um teste a ser feito, e é ideal que ele tenha um nome bem descritivo. Outro fator importante é anotar o método com `@Test`.

```java
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

  @Test
  public void deveriaSomarDoisNumerosPositivos(){
      Calculadora c = new Calculadora();
      int s = c.somar(3, 7);

      Assert.assertEquals(10, s);
  }
}
```

Se tudo estiver configurado como deve, o VS Code terá um menu lateral de teste, abrindo ele conseguiremos ver todos os testes escritos e o resultado de sua última execução

![TESTE-CALCULADORA](assets/tdd-java/teste-calculadora.png)

### Testando Uma Funcionalidade

Quanto mais eu me aprofundo em programação, mais eu me apaixono pelo que vejo. Muito bom ver as possibilidades que encontramos quando trabalhamos com testes automatizados. Cada vez mais estamos nós tornando magos da programação; um dia seremos o "Doutro Estranho"?

Agora estamos colocando a perna na água, já da para sentir o friozinho. Iremos realizar um teste um pouco mais real. Por questão de organização criei a pasta **test**, é dentro dela que estarão meus testes. Nosso objetivo é testar a seguinte classe:

```java
public class BonusService {

public BigDecimal calcularBonus(Funcionario funcionario) {
  BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
  if (valor.compareTo(new BigDecimal("1000")) > 0) {
    valor = BigDecimal.ZERO;
  }
  return valor.setScale(2, RoundingMode.HALF_UP);
}

}
```

Em casos que temos uma condição que testa um valor numerico é sempre bom realizar 3 testes: Um menor do que o valor testado, uma maior e outro igual. E lembre-se:

>Os nomes dos métodos devem ser o mais descritivos possível.

```java
public class BonusServiceTest {
    
    @Test
    public void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto(){
        BonusService bs = new BonusService();
        BigDecimal b = bs.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));

        assertEquals(new BigDecimal("0.00"), b);
    }

    @Test
    public void bonusDeveriaSer10PorCentoDoSalario(){
        BonusService bs = new BonusService();
        BigDecimal b = bs.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.00"), b);
    }

    @Test
    public void bonusDeveriaSer10ProCentoParaSalarioDe10000(){
        BonusService bs = new BonusService();
        BigDecimal b = bs.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), b);
    }
}
```

Todos os sinais verdes, vida que segue.

TODO: Imagem Dos Testes Passando.

### Conhecendo TDD

>Primeiro **Teste**; depois **Implementação**; com sorte **Refatora**.

Parece estranho, sim, mas funciona. Escrever primeiro o teste nós ajuda a garantir que nosso código vai fazer exatamente, e somente, aquilo que é necessário. Além disso os testes incentivam a refatoração; se fizermos alguma cagada o teste falha na hora, é só arrumar para que ele passe.

O problema aqui está na mentalidade do programador, normalmente não queremos ficar escrevendo teste, nem pensar nisso, queremos mesmo é código funcionando e rodando, queremos dar vida ao que está na cabeça das outras pessoas. "Acalme-te, escreva bons testes, isso será de grande ajuda, cedo ou tarde".

O conceito é simples, e com prática e tempo iremos escrever testes cada vez melhores.

### Implementando Uma Funcionalidade Com TDD

Regra da nova funcionalidade:

1. Se o desempenho foi "A desejar", reajuste será de 3% do salário;
2. Se o desempenho foi "Bom", reajuste será de 15% do salário;
3. Se o desempenho foi "Ótimo", reajuste será de 20% do salário;

Primeira coisa a se pensar é: Qual o nome classe que implementará esse método? Não iremos criar a classe e sim a classe de teste, sendo assim criaremos a `ReajusteServiceTest`:

```java
public class ReajusteServiceTest {
    
  @Test
  public void reajusteDeveriaSerDeTresProcentoQuandoDesempenhoForADesejar(){
      ReajusteService rs = new ReajusteService();      
  }
}
```

Logo teremos uma classe `ReajusteService`, ao esrever essa parte, nosso teste não irá funcionar, deixe estar. Essa nossa clase ter uma método que cálcule o reajutes, `concederReajuste` me parece um bom nome, esse método precisa receber um funcionário, claro, e o desempenho dele, iremos querer que as possibilidades de desempenho estejam no enun `Desempenho`.

```java
public class ReajusteServiceTest {
    
  @Test
  public void reajusteDeveriaSerDeTresProcentoQuandoDesempenhoForADesejar(){
      ReajusteService rs = new ReajusteService();
      Funcionario f = new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("1000.00"));

      rs.concederReajuste(f, Desempenho.A_DESEJAR);

      assertEquals(new BigDecimal("1030.00"), f.getSalario());
  }
}
```

Veja, até aqui não implementamos nada, a classe de teste nem compila. O interessante é que já pensamos no designer de nosso classe, já temos o nome do método, a parte mais difícil, diga-se de passagem, o que ele deve receber e o que ele deve fazer.

"Ctrl + ." irá ser uma mão na roda agora. Primeiro criamos a classe `ReajusteService`, depois o método `concederReajuste`, depois o enun `Desempenho` por fim colocamos a contante **A_DESEJAR** no enun.

Ufa, muito código gerado *automagicamente*, tudo compila, masss, o teste falha. Claro, falta a impementação do método `concederReajuste`. Sabemos que quando o desempenho for **A_DESEJAR** é preciso aumentar o salário em 3%, começaremos por ai. Tendo o valor do reajuste precisamos soma-lo ao salário atual, quereremos que o classe `Funcionario` realize essa operação, para isso ela precisa ter o método `reajustarSalario`, mais "Ctrl + .".

```java
public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
    if(desempenho == Desempenho.A_DESEJAR){
        BigDecimal reajuste = funcionario.getSalario()
                                         .multiply(new BigDecimal("0.03"));
        funcionario.reajustarSalario(reajuste);
    }
  }

public void reajustarSalario(BigDecimal reajuste) {
  this.salario = this.salario.add(reajuste)
                             .setScale(2, RoundingMode.HALF_UP);
}
```

Ao final do dia: Teste OK; podemos ir embora feliz.

### Refactoring

### Quando usar TDD

Ao final da utilização do TDD já temos o código testar, fazer depois, nem sempre o teremos. Preguiça.
Começando pelo teste evitamos testes viciados. O teste deve ser voltado ao comportamento e não implementação. Propicia a refatoração, ajuda a manter o foco. Tendência a escrever código mais simples. Vemos a real vantagem quando iremos implementar um código um pouco mais complexa.

### Lidando com exceptions

Testamos o valor retornado por um método, o objeto alterado pelo método ou a exceção lançada pelo método.

### Organizando O Código De Teste

É importante refatorar o teste também. comentar sobre essas anotações

```java
@BeforeEach
public void inicializar(){
  this.reajusteService = new ReajusteService();
  this.funcionario = new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("1000.00"));
}

@AfterEach
public void finalizar(){
  System.out.println("Fim");
}

@BeforeAll
public static void antesDeTodos(){
  System.out.println("Aconteço antes de todos");
}

@AfterAll
public static void depoisDeTodos(){
  System.out.println("Aconteço depois de todos");
}
```

### Como Testar Métodos Privados

Resposta curta: Não precisamos.

Explico: Testamos os efeitos dos métodos privados, se eles são privados quer dizer que a própria classe os utiliza para modificar algo.

Por exemplo: temos o método privado `arredondarSalario` que é utilizado no método `reajustarSalario`, dessa forma, ao testar o reajustaSalario já estamos testando o arredondarSalario.

```java
public void reajustarSalario(BigDecimal reajuste) {
  this.salario = this.salario.add(reajuste);
  arredondarSalario();
}

private void arredondarSalario() {
  this.salario = this.salario.setScale(2, RoundingMode.HALF_UP);
}
```

### O Que Testar Na Aplicação

Não precisa testar todas as classes e métodos. Regra de négocio, algoritmo, calculo, validações, coisas que tentem a serem alteradas no futuro.
