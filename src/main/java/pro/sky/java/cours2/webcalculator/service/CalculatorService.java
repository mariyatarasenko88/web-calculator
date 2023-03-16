package pro.sky.java.cours2.webcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements pro.sky.java.cours2.webcalculator.service.Service {
    @Override
    public int printPlus(Integer a, Integer b) {
        return  a + b;
    }
    @Override
    public int printMinus(Integer a, Integer b) {
        return  a - b;
    }
    @Override
    public int printMultiply(Integer a, Integer b) {
        return a * b;
    }
    @Override
    public int printDivide(Integer a, Integer b) {
        return  a / b;
    }

}
