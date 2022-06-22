package com.example.demoacademyspring.controller;


import com.example.demoacademyspring.entity.Docente;
import com.example.demoacademyspring.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/Docente")
public class DocenteController {


    @Autowired
    DocenteService docenteService;


    @GetMapping(value = "/listaDocenti")
    public ModelAndView getDocenti(){
        ModelAndView modelAndView = new ModelAndView();
        List<Docente> docenteList = docenteService.getAllDocenti();
        modelAndView.addObject("elencoDocenti",docenteList);
        modelAndView.setViewName("/Docente/List");
        return  modelAndView;
    }

    @GetMapping(value = "/addDocente")
    public ModelAndView addDocente(){
        ModelAndView modelAndView = new ModelAndView("Docente/AddEditDocente");
        Docente docente = new Docente();
        modelAndView.addObject("oggettoDocente",docente);
        return modelAndView;
    }

    @PostMapping(value = "/SaveDocente")
    public ModelAndView saveDocente(@ModelAttribute("oggettoDocente") Docente docente) {
        ModelAndView modelAndView = new ModelAndView();
        docenteService.save(docente);
        modelAndView.setViewName("/Docente/List");
        return  modelAndView;
    }






}
