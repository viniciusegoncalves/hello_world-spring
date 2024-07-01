package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/objetivos-aprendizagem")
public class ObjetivosAprendizagemController {

    @GetMapping
    public List objetivosAprendizagem() {
        List<String> objetivosAprendizagem = new ArrayList<>();

        objetivosAprendizagem.add("Spring");
        objetivosAprendizagem.add("Rest-API");
        objetivosAprendizagem.add("Backend Web");

        return objetivosAprendizagem;
    }

}
