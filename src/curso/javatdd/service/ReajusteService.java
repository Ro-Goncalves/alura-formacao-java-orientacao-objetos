package curso.javatdd.service;

import java.math.BigDecimal;

import curso.javatdd.modelo.Desempenho;
import curso.javatdd.modelo.Funcionario;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        if(desempenho == Desempenho.A_DESEJAR){
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
            funcionario.reajustarSalario(reajuste);
        } else if(desempenho == Desempenho.BOM){
            BigDecimal reajuste = funcionario.getSalario()
                                            .multiply(new BigDecimal("0.15"));
            funcionario.reajustarSalario(reajuste);
        } else if(desempenho == Desempenho.OTIMO){
            BigDecimal reajuste = funcionario.getSalario()
                                             .multiply(new BigDecimal("0.2"));
            funcionario.reajustarSalario(reajuste);
        }
    }

}
