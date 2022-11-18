package curso.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasDate = LocalDate.of(2022, Month.SEPTEMBER, 20);

        Integer anos = olimpiadasDate.getDayOfYear() - hoje.getDayOfYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, olimpiadasDate);
        System.out.println(periodo.getDays());

        LocalDate proximasOlipiadas = olimpiadasDate.plusYears(4);
        System.out.println(proximasOlipiadas);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(proximasOlipiadas.format(f));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")));
        System.out.println(agora.toLocalDate().format(f));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);
    }
}
