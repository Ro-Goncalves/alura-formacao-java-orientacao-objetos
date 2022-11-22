package curso.javatdd.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import curso.javatdd.modelo.Desempenho;
import curso.javatdd.modelo.Funcionario;
import curso.javatdd.service.ReajusteService;

public class ReajusteServiceTest {
    
    @Test
    public void reajusteDeveriaSerDeTresProcentoQuandoDesempenhoForADesejar(){
        ReajusteService rs = new ReajusteService();
        Funcionario f = new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("1000.00"));

        rs.concederReajuste(f, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), f.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeQuinzeProcentoQuandoDesempenhoForBom(){
        ReajusteService rs = new ReajusteService();
        Funcionario f = new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("1000.00"));

        rs.concederReajuste(f, Desempenho.BOM);

        assertEquals(new BigDecimal("1150.00"), f.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeVinteProcentoQuandoDesempenhoForOtimo(){
        ReajusteService rs = new ReajusteService();
        Funcionario f = new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("1000.00"));

        rs.concederReajuste(f, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200.00"), f.getSalario());
    }
}
