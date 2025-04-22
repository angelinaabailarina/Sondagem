package com.example.ninoca.controllers;

import org.springframework.web.bind.annotation.*;

import com.example.ninoca.entities.Funcionario;
import com.example.ninoca.services.FuncionarioService;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

private final FuncionarioService funcionarioService;

public FuncionarioController (FuncionarioService funcionarioService) {
this.funcionarioService = funcionarioService;
}

@GetMapping
public List<Funcionario> listarFuncionario() {
return funcionarioService.listarTodos();
}

@PostMapping
public Funcionario criarFuncionario(@RequestBody Funcionario funcionario) {
return funcionarioService.salvar(funcionario);
}
}