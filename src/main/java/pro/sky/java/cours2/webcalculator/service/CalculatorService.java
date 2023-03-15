package pro.sky.java.cours2.webcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements pro.sky.java.cours2.webcalculator.service.Service {
    @Override
    public String printPlus(Integer a, Integer b) {
        return a + " + " + b + " = " + (a + b);
    }
    @Override
    public String printMinus(Integer a, Integer b) {
        return a + " - " + b + " = " + (a - b);
    }
    @Override
    public String printMultiply(Integer a, Integer b) {
        return a + " * " + b + " = " + (a * b);
    }
    @Override
    public String printDivide(Integer a, Integer b) {
        return a + " / " + b + " = " + (a / b);
    }

}
