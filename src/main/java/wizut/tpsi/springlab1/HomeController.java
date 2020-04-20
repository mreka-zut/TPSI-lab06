package wizut.tpsi.springlab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        //model.addAttribute("imie", "Kleofas");
        return "home";
    }
    @RequestMapping("/hello")
    public String hello(Model model, OsobaForm osoba) {
        model.addAttribute("imie", osoba.getImie());
        model.addAttribute("nazwisko", osoba.getNazwisko());
        model.addAttribute("wiek", osoba.getWiek());
        return "hello";
    }

}
