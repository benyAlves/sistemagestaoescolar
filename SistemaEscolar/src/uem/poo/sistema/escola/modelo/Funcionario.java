/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author maluleque
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Funcionario extends Pessoa{
    
    private String especializacao;
    @Column(name = "caminho_foto", nullable = true)
    private String caminhoFoto;
    private String estado;
    @Column(name = "estado_civil")
    private String estadoCivil;
    @Column(name = "nivel_academico", nullable = false)
    private String nivelAcademico;
    
     //Funcionario(com Cargo professor) relacionado a varias disciplinas
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="Deque",
    joinColumns={@JoinColumn(name="cod_funcionario")},
    inverseJoinColumns={@JoinColumn(name="cod_disciplina")})
    private List<Disciplina> disciplinas;
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="Contrato",
    joinColumns={@JoinColumn(name="cod_funcionario")},
    inverseJoinColumns={@JoinColumn(name="cod_instituicao")})
    private List<Instituicao> instituicoes;
    
    @ManyToOne
    @JoinColumn(name = "cod_endereco", nullable = false)
    private Endereco endereco;
    
    @ManyToOne
    @JoinColumn(name = "cod_cargo", nullable = false)
    private Cargo cargo;
    
    @OneToMany(mappedBy = "funcionario")
    private List<Telefone> telefones;
    
    
    
}
