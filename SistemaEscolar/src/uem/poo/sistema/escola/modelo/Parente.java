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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author France Antonio cossa
 */
@Entity
public class Parente implements Serializable{
    @Id @GeneratedValue()
    private Long codigo;
    @Column(nullable = false ,unique = true)
    private String profissao;
    @Column(nullable = false ,unique = true)
    private String localTrabalho;
    @Column(nullable = false ,unique = true)
    private String grauParentestico;
    @Column(nullable = false ,unique = true)
    private String nome;
    //relacionamento parente-aluno, se pudessem rever o relacionamento seria muito bom
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="ParenteAluno",
    joinColumns={@JoinColumn(name="cod_parente")},
    inverseJoinColumns={@JoinColumn(name="cod_aluno")})
    private Collection<Aluno> alunos;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Collection<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Collection<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
    
    public String getProfissa() {
        return profissao;
    }

    public void setProfissa(String profissa) {
        this.profissao = profissa;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    public String getGrauParentestico() {
        return grauParentestico;
    }

    public void setGrauParentestico(String grauParentestico) {
        this.grauParentestico = grauParentestico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
