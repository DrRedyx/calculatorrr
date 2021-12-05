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
        return number1/number2;
    }

    public boolean flag(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            return false;
        } else {
            return true;
        }
    }
}
