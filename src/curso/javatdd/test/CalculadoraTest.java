package curso.javatdd.test;

import curso.javatdd.Calculadora;

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
