package com.example.ninoca.services;

import org.springframework.stereotype.Service;

import com.example.ninoca.entities.Projeto;
import com.example.ninoca.repositories.ProjetoRepository;

import java.util.List;

@Service
public class ProjetoService {

    private final ProjetoRepository projetoRepository;

    public ProjetoService (ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    public List<Projeto> listarTodos() {
        return projetoRepository.findAll();
    }

    public Projeto salvar(Projeto projeto) {
        return projetoRepository.save(projeto);
    }
}
