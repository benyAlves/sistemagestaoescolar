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

/**
 *
 * @author claucio
 */
@Entity
public class Disciplina implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    @Column(name = "nome",nullable = false, unique = true)
    private String nome;
    @Column(name = "carga_horaria", nullable = true)
    private int cargaHoraria;    
    private String sigla;
    private String estado;
    //relacionamento Disciplina-Aluno, se pudessem rever o relacionamento seria muito bom
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="Aproveitamento",
    joinColumns={@JoinColumn(name="cod_disciplina")},
    inverseJoinColumns={@JoinColumn(name="cod_aluno")})
    private Collection<Aluno> alunos;
    
    

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
