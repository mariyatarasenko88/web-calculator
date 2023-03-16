package pro.sky.java.cours2.webcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.cours2.webcalculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        checkNums(num1, num2);
        return num1 + " + " + num2 + " = " + calculatorService.printPlus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        checkNums(num1, num2);
        return num1 + " - " + num2 + " = " + calculatorService.printMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        checkNums(num1, num2);
        return num1 + " * " + num2 + " = " + calculatorService.printMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        checkNums(num1, num2);
        if (num2 == 0) {
            return "делить на ноль нельзя";
        }
        return num1 + " / " + num2 + " = " + calculatorService.printDivide(num1, num2);
    }

    private void checkNums(Integer num1, Integer num2) {
        if (num1 == null) {
            System.out.println("Параметр num1 не передан");
            if (num2 == null) {
                System.out.println("Параметр num2 не передан");
            }
        }
    }
}
