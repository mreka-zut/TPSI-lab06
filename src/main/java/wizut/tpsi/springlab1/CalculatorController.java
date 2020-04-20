package wizut.tpsi.springlab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CalculatorController {
    @RequestMapping("/simpleCalculator")
    public String simpleCalculator(Model model, CalculatorForm calculator) {
        Integer x=nullToZero(calculator.getX());  //zeby nie bylo error 500
        Integer y=nullToZero(calculator.getY());
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        model.addAttribute("method", "+");
        model.addAttribute("solution", x+y);
        return "calculator";
    }
    @RequestMapping("/calculator")
    public String calculator(Model model,CalculatorForm calculator)
    {
        int solution=0;
        Integer x=nullToZero(calculator.getX());  //zeby nie bylo error 500
        Integer y=nullToZero(calculator.getY());
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        model.addAttribute("method", calculator.getMethod());
        if(calculator.getMethod().trim().equals("+"))
        {
            solution=x+y;
        }
        if(calculator.getMethod().trim().equals("*"))
        {
            solution=x*y;
        }
        if(calculator.getMethod().trim().equals("-"))
        {
            solution=x-y;
        }
        model.addAttribute("solution",solution);
        return "calculator";
    }
    private Integer nullToZero(Integer number)
    {
        if(number==null)
        {
            number=0;
        }
        return number;
    }
}
