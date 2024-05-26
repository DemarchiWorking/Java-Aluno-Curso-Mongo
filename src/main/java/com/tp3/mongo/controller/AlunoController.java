package com.tp3.mongo.controller;

import com.tp3.mongo.model.Aluno;
import com.tp3.mongo.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("aluno")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;
    @PostMapping
    public Aluno createCliente(@RequestBody Aluno aluno)
    {
        return alunoService.save(aluno);
    }

}
