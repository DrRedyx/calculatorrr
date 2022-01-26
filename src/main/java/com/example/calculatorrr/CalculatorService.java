package com.example.calculatorrr;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int sum(Integer number1, Integer number2) {

        return number1 + number2;
    }

    public int decrease(Integer number1, Integer number2) {
        return number1 - number2;
    }

    public int multiplication(Integer number1, Integer number2) {

        return number1 * number2;
    }

    public int division(Integer number1, Integer number2) {
        if (number2 != 0) {
            return number1/number2;
        }
        else {
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
    }

}
