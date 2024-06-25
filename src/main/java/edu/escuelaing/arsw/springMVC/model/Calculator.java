package edu.escuelaing.arsw.springMVC.model;


public class Calculator {
    private double result;
    private String currentInput;
    private String operator;

    public Calculator() {
        result = 0;
        currentInput = "";
        operator = "";
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getCurrentInput() {
        return currentInput;
    }

    public void setCurrentInput(String currentInput) {
        this.currentInput = currentInput;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
