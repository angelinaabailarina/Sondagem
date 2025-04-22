package com.example.ninoca.entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    private Long idFuncionario;

    private String nome;
    private String sobrenome;

    @ManyToMany
    @JoinTable(
        name = "funcionario_projeto",joinColumns = @JoinColumn(name = "id_funcionario"),inverseJoinColumns = @JoinColumn(name = "id_projeto")
    )
    private Set<Projeto> projetos;

    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Set<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(Set<Projeto> projetos) {
        this.projetos = projetos;
    }
}