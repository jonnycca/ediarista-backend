package br.com.ediarista.controller;

import br.com.ediarista.repository.DiaristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/diaristas")
public class DiaristaController {

    @Autowired
    private DiaristaRepository diaristaRepository;

    @GetMapping
    public ModelAndView buscarTodos(){
        var modelAndView = new ModelAndView("listar_diaristas");

        modelAndView.addObject("diaristas", diaristaRepository.findAll());

        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView buscarPorId(@PathVariable Long id){
        var modelAndView = new ModelAndView("detalhes_diarista");

        modelAndView.addObject("diarista", diaristaRepository.getById(id));

        return modelAndView;
    }
}
