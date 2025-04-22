package com.example.ninoca.controllers;

import org.springframework.web.bind.annotation.*;

import com.example.ninoca.entities.Projeto;
import com.example.ninoca.services.ProjetoService;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

private final ProjetoService projetoService;

public ProjetoController (ProjetoService projetoService) {
this.projetoService = projetoService;
}

@GetMapping
public List<Projeto> listarProjetos() {
return projetoService.listarTodos();
}

@PostMapping
public Projeto criarProjeto(@RequestBody Projeto projeto) {
return projetoService.salvar(projeto);
}
}