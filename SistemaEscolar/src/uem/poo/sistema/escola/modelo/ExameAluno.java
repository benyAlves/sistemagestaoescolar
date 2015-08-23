/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author machiza
 */
@Entity
public class ExameAluno implements Serializable {
    @EmbeddedId
    private ExameAlunoPK chaveComposta;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_inscricao")
    private Date dataInscricao;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="ExameDisciplina",
    joinColumns={@JoinColumn(name="cod_exame")},
    inverseJoinColumns={@JoinColumn(name="cod_disciplina")})
    private List<Disciplina> disciplinas;

    private double multa;
    
    private String situacao;
    
    private String observacao;
    
    private double valor;


    public ExameAlunoPK getChaveComposta() {
        return chaveComposta;
    }

    public void setChaveComposta(ExameAlunoPK chaveComposta) {
        this.chaveComposta = chaveComposta;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }


    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
 
}
