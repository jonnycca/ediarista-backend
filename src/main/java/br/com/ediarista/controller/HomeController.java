package br.com.ediarista.controller;

import br.com.ediarista.dto.DiaristaForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @GetMapping("/modelMap")
    public String home2(ModelMap modelMap){
        modelMap.addAttribute("nome", "José");
        return "home";
    }

    @GetMapping("/modelAndView")
    public ModelAndView home3(){
        var modelAndView = new ModelAndView("home");

        modelAndView.addObject("nome", "José");

        return modelAndView;
    }

    @GetMapping("form")
    public ModelAndView form(){
        var modelAndView = new ModelAndView("form");

        modelAndView.addObject("form", new DiaristaForm());

        return modelAndView;
    }

    @PostMapping("/form")
    public String form2(DiaristaForm diaristaForm){
        System.out.println(diaristaForm);

        return "redirect:/form";
    }
}
