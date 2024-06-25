package edu.escuelaing.arsw.springMVC.model;

import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

@Service
public class Calculator {
    public double evaluate(String expression) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            return Double.parseDouble(engine.eval(expression).toString());
        } catch (ScriptException e) {
            throw new IllegalArgumentException("Invalid expression");
        }
    }
}
