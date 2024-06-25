package edu.escuelaing.arsw.springMVC.controller;

import edu.escuelaing.arsw.springMVC.service.CalculatorService;
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
    private CalculatorService calculatorService;

    @GetMapping("/")
    public String index(HttpSession session, Model model) {
        Double result = (Double) session.getAttribute("result");
        if (result == null) {
            result = 0.0;
        }
        model.addAttribute("result", result);
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam("a") double a,
            @RequestParam("b") double b,
            @RequestParam("operation") String operation,
            HttpSession session,
            Model model) {

        double result = 0;
        switch (operation) {
            case "add":
                result = calculatorService.add(a, b);
                break;
            case "subtract":
                result = calculatorService.subtract(a, b);
                break;
            case "multiply":
                result = calculatorService.multiply(a, b);
                break;
            case "divide":
                result = calculatorService.divide(a, b);
                break;
            case "allClear":
                result = calculatorService.allClear();
                break;
        }
        session.setAttribute("result", result);
        model.addAttribute("result", result);
        return "index";
    }
}
