package curso.javatdd.test;

//import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import curso.javatdd.modelo.Funcionario;
import curso.javatdd.service.BonusService;

public class BonusServiceTest {
    
    @Test
    public void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto(){
        BonusService bs = new BonusService();
        // assertThrows(
        //     IllegalArgumentException.class,
        //     () -> bs.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")))
        // );
        try {
            bs.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
            fail("Não deu bom");
        } catch (Exception e) {
            assertEquals("Funcionário com salário maior do que R$10.000,00 não pode receber bônus", e.getMessage());
        }
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
