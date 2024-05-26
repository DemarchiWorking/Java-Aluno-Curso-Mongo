package com.tp3.mongo.service;

import com.tp3.mongo.model.Aluno;
import com.tp3.mongo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno save(Aluno aluno){
        return alunoRepository.save(aluno);
    }

}
