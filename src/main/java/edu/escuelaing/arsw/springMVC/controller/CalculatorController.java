package edu.escuelaing.arsw.springMVC.controller;

import edu.escuelaing.arsw.springMVC.model.Calculator;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class CalculatorController {
    @Autowired
    private Calculator calculator;

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam("input") String input,
            HttpSession session,
            Model model) {

        String expression = (String) session.getAttribute("expression");
        if (expression == null) {
            expression = "";
        }

        expression += input;

        try {
            double result = calculator.evaluate(expression);
            session.setAttribute("expression", expression);
            session.setAttribute("result", Double.toString(result));
            model.addAttribute("result", result);
        } catch (IllegalArgumentException e) {
            session.setAttribute("expression", expression);
            model.addAttribute("error", e.getMessage());
        }

        return "index";
    }
}