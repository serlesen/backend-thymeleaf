package com.sergio.thymeleaf.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class ExportController {

    @GetMapping("/export")
    public String export(@RequestParam(name = "showDetails", required = false) boolean showDetails, Model model) {
        model.addAttribute("features", Arrays.asList(
                "Working in projects with an experienced mentor.",
                "Getting real feedback from your work.",
                "Learn some Best practices about Software Design.",
                "Security Concerns needed when building a Backend.",
                "Important Architecture Patterns when building an application."
        ));
        model.addAttribute("showDetails", showDetails);
        return "export";
    }

}
