package com.example.calculatorrr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    public void sumWithNumber() {
        int num1 = 12;
        int num2 = 21;


        int sum1 = calculatorService.sum(num1,num2);
        int sum2 = num1 + num2;

        assertEquals(sum1, sum2);

    }

    @Test
    public void sumWithNegativeNumber() {
        int num1 = -12;
        int num2 = -21;


        int sum1 = calculatorService.sum(num1,num2);
        int sum2 = num1 + num2;

        assertEquals(sum1, sum2);
    }

    @Test
    public void decreaseWithNumber() {
        int num1 = 12;
        int num2 = 21;


        int dec1 = calculatorService.decrease(num1,num2);
        int dec2 = num1 - num2;

        assertEquals(dec1, dec2);

    }

    @Test
    public void decreaseWithNegativeNumber() {
        int num1 = -12;
        int num2 = -21;


        int dec1 = calculatorService.decrease(num1,num2);
        int dec2 = num1 - num2;

        assertEquals(dec1, dec2);
    }

    @Test
    public void multiplicationWithNumber() {
        int num1 = 12;
        int num2 = 21;

        int mult1 = calculatorService.multiplication(num1,num2);
        int mult2 = num1 * num2;

        assertEquals(mult1, mult1);
    }

    @Test
    public void multiplicationWithNegativeNumber() {
        int num1 = -12;
        int num2 = -21;


        int mult1 = calculatorService.multiplication(num1,num2);
        int mult2 = num1 * num2;

        assertEquals(mult1, mult1);
    }

    @Test
    public void divisionWithNumber() {
        int num1 = 12;
        int num2 = 21;


        int div1 = calculatorService.division(num1,num2);
        int div2 = num1 / num2;

        assertEquals(div1, div2);

    }

    @Test
    public void divisionWithNegativeNumber() {
        int num1 = -12;
        int num2 = -21;


        int div1 = calculatorService.division(num1,num2);
        int div2 = num1 / num2;

        assertEquals(div1, div2);

    }

    @Test
    public void throwExceptionDivisionToZero() {
        int num1 = 12;
        int num2 = 0;

        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.division(num1, num2));
    }
}