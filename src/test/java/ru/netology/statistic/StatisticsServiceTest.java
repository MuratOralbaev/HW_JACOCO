package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findMaxIfCurrent() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {13, 12, 28, 4, 5, 0, 8, 6, 190, 11, 12};
        long expected = 190;

        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);


    }
}