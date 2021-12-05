package com.example.calculatorrr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return "Hello my lord, Necrolculator is here!";
    }

    @GetMapping(path = "/decrease")
    public String decrease(@RequestParam("number1") Integer num1, @RequestParam("number2") Integer num2) {
        if (calculatorService.flag(num1, num2)) {
            throw new RuntimeException("Введено некоректное число");
        }
        int decrease = calculatorService.decrease(num1, num2);
        return num1 + "-" + num2 + "=" + decrease;

    }
    @GetMapping(path = "/division")
    public String division(@RequestParam("number1") Integer num1, @RequestParam("number2") Integer num2) {
        if (calculatorService.flag(num1, num2)) {
            throw new RuntimeException("Введено некоректное число");
        }
        if (num2 == 0) {
            throw new RuntimeException("На ноль делить нельзя");
        }
        int division = calculatorService.division(num1, num2);
        return num1 + "/" + num2 + "=" + division;
    }
    @GetMapping(path = "/sum")
    public String sum(@RequestParam("number1") Integer num1, @RequestParam("number2") Integer num2) {
        if (calculatorService.flag(num1, num2)) {
            throw new RuntimeException("Введено некоректное число");
        }
        int sum = calculatorService.sum(num1, num2);
        return num1 + "+" + num2 + "=" + sum;
    }
    @GetMapping(path = "/sum")
    public String multiplication(@RequestParam("number1") Integer num1, @RequestParam("number2") Integer num2) {
        if (calculatorService.flag(num1, num2)) {
            throw new RuntimeException("Введено некоректное число");
        }
        int multiplication = calculatorService.multiplication(num1, num2);
        return num1 + "*" + num2 + "=" + multiplication;
    }

}
