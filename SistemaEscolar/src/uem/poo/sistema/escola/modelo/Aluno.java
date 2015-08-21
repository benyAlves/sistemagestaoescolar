/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.util.Collection;
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
public class Aluno extends Pessoa{
    @Column(name = "caminho_foto", nullable = true)
    private String caminhoFoto;
    private String profissao;
    private String estado;
    @ManyToOne
    @JoinColumn(name = "endereco", nullable = false)
    private Endereco endereco;
    @OneToMany(mappedBy = "aluno")    
    private List<Telefone> telefones;
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="Matricula",
    joinColumns={@JoinColumn(name="cod_aluno")},
    inverseJoinColumns={@JoinColumn(name="cod_classe")})
     private Collection<Classe> classes;
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="Avaliacao",
    joinColumns={@JoinColumn(name="cod_aluno")},
    inverseJoinColumns={@JoinColumn(name="cod_disciplina")})
    private List<Disciplina> disciplinas;
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="ParenteAluno",
    joinColumns={@JoinColumn(name="cod_aluno")},
    inverseJoinColumns={@JoinColumn(name="cod_parente")})
    private Collection<Parente> parente;
}
