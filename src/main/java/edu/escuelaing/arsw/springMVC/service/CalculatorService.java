package edu.escuelaing.arsw.springMVC.service;

import edu.escuelaing.arsw.springMVC.model.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    private final Calculator calculator = new Calculator();

    public double add(double a, double b) {
        return calculator.add(a, b);
    }

    public double subtract(double a, double b) {
        return calculator.substraction(a, b);
    }

    public double multiply(double a, double b) {
        return calculator.product(a, b);
    }

    public double divide(double a, double b) {
        return calculator.divide(a, b);
    }

    public double allClear() {
        return calculator.allClear();
    }
}
