/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author machiza
 */
@Entity
public class Funcionario implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    
    private String especializacao;
    
    @Column(name = "caminho_foto")
    private String caminhoFoto;
    
    private boolean estado;
    
    private String estadoCivil;
    
    @Column(name = "nivel_academico")
    private String nivelAcademico;
    
    @OneToMany(fetch=FetchType.LAZY)
    @JoinTable(name= "Salario",
    joinColumns={@JoinColumn(name= "cod_funcionario")},
    inverseJoinColumns={@JoinColumn(name= "cod_cargo")})
    private Cargo cargo;
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name= "Locais_Trabalho",
    joinColumns={@JoinColumn(name= "cod_funcionario")},
    inverseJoinColumns={@JoinColumn(name= "cod_instituicao")})
    private Collection<Instituicao> instituicoes;
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name= "disciplinas_lecionadas",
    joinColumns={@JoinColumn(name= "cod_funcionario")},
    inverseJoinColumns={@JoinColumn(name= "cod_disciplina")})
    private Collection<Disciplina> disciplinas;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Collection<Instituicao> getInstituicoes() {
        return instituicoes;
    }

    public void setInstituicoes(Collection<Instituicao> instituicoes) {
        this.instituicoes = instituicoes;
    }

    public Collection<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Collection<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
}
