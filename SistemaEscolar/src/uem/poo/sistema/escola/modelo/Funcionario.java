/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
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
    @JoinTable(name= "Contrato",
    joinColumns={@JoinColumn(name= "cod_funcionario")},
    inverseJoinColumns={@JoinColumn(name= "cod_instituicao")})
    private List<Instituicao> instituicoes;
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name= "Deque",
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

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
    

    public List<Instituicao> getInstituicoes() {
        return instituicoes;
    }

    public void setInstituicoes(List<Instituicao> instituicoes) {
        this.instituicoes = instituicoes;
    }

    public Collection<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Collection<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
}
