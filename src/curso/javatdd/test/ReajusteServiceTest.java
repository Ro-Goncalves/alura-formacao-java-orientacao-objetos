package curso.javatdd.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import curso.javatdd.modelo.Desempenho;
import curso.javatdd.modelo.Funcionario;
import curso.javatdd.service.ReajusteService;

public class ReajusteServiceTest {
    
    private ReajusteService reajusteService;
    private Funcionario funcionario;

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

    @Test
    public void reajusteDeveriaSerDeTresProcentoQuandoDesempenhoForADesejar(){
        reajusteService.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeQuinzeProcentoQuandoDesempenhoForBom(){
        reajusteService.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeVinteProcentoQuandoDesempenhoForOtimo(){
        reajusteService.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
