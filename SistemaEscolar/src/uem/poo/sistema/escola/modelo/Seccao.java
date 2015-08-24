/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author France Antonio cossa
 */
@Entity
public class Seccao implements Serializable{
   @Id @GeneratedValue(strategy = GenerationType.AUTO )
    private Long codigo;
   @Column(length = 40,nullable = false,unique = false)
    private String nome;

    @ManyToMany
    @JoinTable(name = "DisciplinaSeccao",
            joinColumns={@JoinColumn(name="cod_seccao")},
            inverseJoinColumns={@JoinColumn(name="cod_disciplina")})
    private List<Disciplina> disciplinas;
 
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
    
}
