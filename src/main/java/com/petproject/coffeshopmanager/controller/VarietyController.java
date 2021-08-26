package com.petproject.coffeshopmanager.controller;

import com.petproject.coffeshopmanager.service.VarietyService;
import com.petproject.coffeshopmanager.model.Variety;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class VarietyController {

    private final VarietyService varietyService;

    @Autowired
    public VarietyController(VarietyService varietyService) {
        this.varietyService = varietyService;
    }

    @GetMapping("/varieties")
    public String findAll(Model model){
        List<Variety> varieties = varietyService.findAll();
        model.addAttribute("varieties", varieties);
        return "variety-list";
    }

    @GetMapping("/variety-create")
    public String createVarietyForm(Variety variety){
        return "variety-create";
    }

    @PostMapping("/variety-create")
    public String createVariety(Variety variety){
        varietyService.saveVariety(variety);
        return "redirect:/varieties";
    }

    @GetMapping("variety-delete/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        varietyService.deleteById(id);
        return "redirect:/varieties";
    }

    @GetMapping("/variety-update/{id}")
    public String updateUserForm(@PathVariable("id") Long id, Model model){
        Variety variety = varietyService.findById(id);
        model.addAttribute("variety", variety);
        return "variety-update";
    }

    @PostMapping("/variety-update")
    public String updateVariety(Variety variety){
        varietyService.saveVariety(variety);
        return "redirect:/varieties";
    }
}
