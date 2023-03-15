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
    public String plus(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
                return calculatorService.printPlus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
                return calculatorService.printMinus(num1,num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
                return calculatorService.printMultiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
             return calculatorService.printDivide(num1, num2);
    }
}
