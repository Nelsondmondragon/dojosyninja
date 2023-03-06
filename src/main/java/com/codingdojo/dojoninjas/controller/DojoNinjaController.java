package com.codingdojo.dojoninjas.controller;

import com.codingdojo.dojoninjas.model.Dojo;
import com.codingdojo.dojoninjas.model.Ninja;
import com.codingdojo.dojoninjas.services.DojoService;
import com.codingdojo.dojoninjas.services.NinjaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class DojoNinjaController {

    private final DojoService dojoService;

    private final NinjaService ninjaService;

    @GetMapping("/dojos/new")
    public String viewNewDojo(@ModelAttribute("dojo") Dojo dojo) {
        return "dojo.jsp";
    }

    @PostMapping("/dojos/new")
    public String NewDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("errr");
            return "dojo.jsp";
        }
        this.dojoService.save(dojo);
        return "redirect:/dojos/new";
    }

    @GetMapping("/ninjas/new")
    public String viewNewNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
        model.addAttribute("dojos", this.dojoService.findAll());
        System.out.println("get ninja");
        return "ninja.jsp";
    }


    @PostMapping("/ninjas/new")
    public String newNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("dojos", this.dojoService.findAll());
            System.out.println("errr");
            return "ninja.jsp";
        }
        ninjaService.save(ninja);
        return "redirect:/ninjas/new";
    }

    @GetMapping("dojos/{id}")
    public String viewNinjaId(@PathVariable Long id, Model model) {
        model.addAttribute("dojo", this.dojoService.findById(id));
        model.addAttribute("ninjas", this.ninjaService.findAllByDojosId(id));
        return "ninjadojo.jsp";
    }

}
