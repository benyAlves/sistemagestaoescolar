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
    @JoinTable(name="Aproveitamento",
    joinColumns={@JoinColumn(name="cod_aluno")},
    inverseJoinColumns={@JoinColumn(name="cod_disciplina")})
    private List<Disciplina> disciplinas;
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="ParenteAluno",
    joinColumns={@JoinColumn(name="cod_aluno")},
    inverseJoinColumns={@JoinColumn(name="cod_parente")})
    private List<Parente> parentes;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_encarregado")
    private Encarregado encarregado;
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="ExameAluno",
    joinColumns={@JoinColumn(name="cod_aluno")},
    inverseJoinColumns={@JoinColumn(name="cod_exame")})
    private List<Exame> exames;

    public List<Parente> getParentes() {
        return parentes;
    }

    public void setParentes(List<Parente> parentes) {
        this.parentes = parentes;
    }

    public Encarregado getEncarregado() {
        return encarregado;
    }

    public void setEncarregado(Encarregado encarregado) {
        this.encarregado = encarregado;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }
    
    public Aluno(String caminhoFoto, String profissao, String estado, Endereco endereco, List<Telefone> telefones, List<Classe> classes, List<Disciplina> disciplinas, List<Parente> parentes) {
        this.caminhoFoto = caminhoFoto;
        this.profissao = profissao;
        this.estado = estado;
        this.endereco = endereco;
        this.telefones = telefones;
        this.classes = classes;
        this.disciplinas = disciplinas;
        this.parentes = parentes;
    }
    
    
    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Collection<Classe> getClasses() {
        return classes;
    }

    public void setClasses(Collection<Classe> classes) {
        this.classes = classes;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Parente> getParente() {
        return parentes;
    }

    public void setParente(List<Parente> parente) {
        this.parentes = parente;
    }
    
}
