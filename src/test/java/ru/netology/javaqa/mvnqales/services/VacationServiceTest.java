package ru.netology.javaqa.mvnqales.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.javaqa.mvnqales.services.VacationService;

public class VacationServiceTest {

    @Test
    public void testMonth1() {
        VacationService service = new VacationService();

        int expected = 9;
        int actual = service.calculate(10_000, 3000, 20_000);
        //System.out.println("Месяцев отдыха: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonth2() {
        VacationService service = new VacationService();

        int expected = 7;
        int actual = service.calculate(100_000, 60_000, 150_000);
        //System.out.println("Месяцев отдыха: " + actual);

        Assertions.assertEquals(expected, actual);

    }

}
