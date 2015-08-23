/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author maluleque
 */
@Entity
public class Matricula implements Serializable{
    
@EmbeddedId
private MatriculaPK chaveComposta;

private double valor;
private String estado;
private String observacao;
@Temporal(TemporalType.DATE)
private Date data;

//Relacionamento de Matricula e Mensalidade
@OneToMany(mappedBy = "matricula")
private List<Mensalidade> mensalidade;
//Relacionamento de Matricula e Tipo de Pagamento
@ManyToOne
@JoinColumn(name = "cod_tipo_pagamento")
private TipoPagamento tipoPagamento;

//Relacionamento de Matricula e Turma
@ManyToOne
@JoinColumn(name = "cod_turma", nullable = true)
private Turma turma;

//Relacionamento de Matricula e Turma
@ManyToOne
@JoinColumn(name = "cod_ano_lectivo", nullable = false)
private AnoLetivo anoLectivo;

//Relacionamento de Matricula e Disciplinas
@ManyToMany(fetch=FetchType.LAZY)
@JoinTable(name="Matricula_Disciplina",
joinColumns=@JoinColumn(name="cod_matricula"),
inverseJoinColumns=@JoinColumn(name="cod_disciplina"))
private List<Disciplina> disciplinas;

    public MatriculaPK getChaveComposta() {
        return chaveComposta;
    }

    public void setChaveComposta(MatriculaPK chaveComposta) {
        this.chaveComposta = chaveComposta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Mensalidade> getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(List<Mensalidade> mensalidade) {
        this.mensalidade = mensalidade;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public AnoLetivo getAnoLectivo() {
        return anoLectivo;
    }

    public void setAnoLectivo(AnoLetivo anoLectivo) {
        this.anoLectivo = anoLectivo;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }



    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

}
