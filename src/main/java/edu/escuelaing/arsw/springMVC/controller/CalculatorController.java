package edu.escuelaing.arsw.springMVC.controller;


import edu.escuelaing.arsw.springMVC.model.Calculator;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {

    private Calculator calculator = new Calculator();

    @GetMapping("/")
    public String calculatorForm(Model model, HttpSession session) {
        Calculator calculator = (Calculator) session.getAttribute("calculator");
        if (calculator == null) {
            calculator = new Calculator();
            session.setAttribute("calculator", calculator);
        }
        model.addAttribute("calculator", calculator);
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@ModelAttribute Calculator calculator, Model model) {
        double num1 = Double.parseDouble(calculator.getCurrentInput());
        double num2 = calculator.getResult();
        String operator = calculator.getOperator();

        switch (operator) {
            case "+":
                calculator.setResult(num1 + num2);
                break;
            case "-":
                calculator.setResult(num2 - num1);
                break;
            case "*":
                calculator.setResult(num1 * num2);
                break;
            case "/":
                calculator.setResult(num2 / num1);
                break;
            default:
                break;
        }

        model.addAttribute("calculator", calculator);
        return "calculator";
    }
}

