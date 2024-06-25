package edu.escuelaing.arsw.springMVC.model;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double substraction(double a, double b) {
        return a - b;
    }

    public double product(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return a / b;
    }

    public double allClear() {
        return 0.0;
    }
}

