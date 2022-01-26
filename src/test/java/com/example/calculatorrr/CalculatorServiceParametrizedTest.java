package com.example.calculatorrr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorServiceParametrizedTest {

    private final static int NUM1 = 30;
    private final static int NUM2 = 15;
    private final static int NEG_NUM1 = -10;
    private final static int NEG_NUM2 = -5;

    private final static int NUM1_PLUS_NUM2 = 45;
    private final static int NUM1_PLUS_NEG_NUM1 = 20;
    private final static int NEG_NUM1_PLUS_NEG_NUM2 = -15;

    private final static int NUM1_DECREASE_NUM2 = 15;
    private final static int NUM1_DECREASE_NEG_NUM1 = 40;
    private final static int NEG_NUM1_DECREASE_NEG_NUM2 = -5;

    private final static int NUM1_MULTIPLICATION_NUM2 = 450;
    private final static int NUM1_MULTIPLICATION_NEG_NUM1 = -300;
    private final static int NEG_NUM1_MULTIPLICATION_NEG_NUM2 = 50;

    private final static int NUM1_DIVISION_NUM2 = 2;
    private final static int NUM1_DIVISION_NEG_NUM1 = -3;
    private final static int NEG_NUM1_DIVISION_NEG_NUM2 = 2;

    private final CalculatorService calculatorService = new CalculatorService();

    public static Stream<Arguments> paramsForSum() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, NUM1_PLUS_NUM2),
                Arguments.of(NUM1, NEG_NUM1, NUM1_PLUS_NEG_NUM1),
                Arguments.of(NEG_NUM1, NEG_NUM2, NEG_NUM1_PLUS_NEG_NUM2)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForSum")
    public void sum(int num1, int num2, int expected) {
        int result = calculatorService.sum(num1, num2);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> paramsForDecrease() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, NUM1_DECREASE_NUM2),
                Arguments.of(NUM1, NEG_NUM1, NUM1_DECREASE_NEG_NUM1),
                Arguments.of(NEG_NUM1, NEG_NUM2, NEG_NUM1_DECREASE_NEG_NUM2)
        );
    }
    @ParameterizedTest
    @MethodSource("paramsForDecrease")
    public void decrease(int num1, int num2, int expected) {
        int result = calculatorService.decrease(num1, num2);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> paramsForMultiplication() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, NUM1_MULTIPLICATION_NUM2),
                Arguments.of(NUM1, NEG_NUM1, NUM1_MULTIPLICATION_NEG_NUM1),
                Arguments.of(NEG_NUM1, NEG_NUM2, NEG_NUM1_MULTIPLICATION_NEG_NUM2)
        );
    }
    @ParameterizedTest
    @MethodSource("paramsForMultiplication")
    public void multiplication(int num1, int num2, int expected) {
        int result = calculatorService.multiplication(num1, num2);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> paramsForDivision() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, NUM1_DIVISION_NUM2),
                Arguments.of(NUM1, NEG_NUM1, NUM1_DIVISION_NEG_NUM1),
                Arguments.of(NEG_NUM1, NEG_NUM2, NEG_NUM1_DIVISION_NEG_NUM2)
        );
    }
    @ParameterizedTest
    @MethodSource("paramsForDivision")
    public void division(int num1, int num2, int expected) {
        int result = calculatorService.division(num1, num2);
        assertEquals(expected, result);
    }

}
