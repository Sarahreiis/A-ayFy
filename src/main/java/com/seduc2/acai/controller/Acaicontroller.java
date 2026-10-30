package com.seduc2.acai.controller;


import com.seduc2.acai.entity.Acai;
import com.seduc2.acai.service.AcaiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/acai")
public class Acaicontroller {

    private final AcaiService service;

    public Acaicontroller(AcaiService service) {
        this.service = service;
    }

    @GetMapping
    public List<Acai> mostrarAcai(){
        return service.mostrarAcai();
    }

    @PostMapping
    public void cadastrarAcai(@RequestBody Acai s){
        service.cadastrarAcai(s);
    }

}
