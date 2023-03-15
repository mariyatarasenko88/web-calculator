package pro.sky.java.cours2.webcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements pro.sky.java.cours2.webcalculator.service.Service {
    @Override
    public String printPlus(Double a, Double b) {
        checkNums(a, b);
        return a + " + " + b + " = " + (a + b);
    }
    @Override
    public String printMinus(Double a, Double b) {
        checkNums(a, b);
        return a + " - " + b + " = " + (a - b);
    }
    @Override
    public String printMultiply(Double a, Double b) {
        checkNums(a, b);
        return a + " * " + b + " = " + (a * b);
    }
    @Override
    public String printDivide(Double a, Double b) {
        checkNums(a, b);
        if (b == 0) {
            return "делить на ноль нельзя";
        }
        return a + " / " + b + " = " + (a / b);
    }
    private void checkNums(Double a, Double b) {
        if (a == null) {
            System.out.println("Параметр num1 не передан");
            if (b == null) {
                System.out.println("Параметр num2 не передан");
            }
        }
    }
}
