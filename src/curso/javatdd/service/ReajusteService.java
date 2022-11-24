package curso.javatdd.service;

import java.math.BigDecimal;

import curso.javatdd.modelo.Desempenho;
import curso.javatdd.modelo.Funcionario;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {        
        BigDecimal percentual = desempenho.percentualReajuste();
        BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
        funcionario.reajustarSalario(reajuste);
    }
}
