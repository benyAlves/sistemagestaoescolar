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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author claucio
 */
@Entity
public class Despesa implements Serializable{
    @Id
    private Long codigo;
    @Column(name = "tipo_despesa")
    private String tipoDespesa;
    private double valor;
    private String descricao;
    @Column(name = "tipo_pagamento", nullable = false,unique = false)
    private String tipoPagamento;
    @Temporal(TemporalType.DATE)
    private Date data;
    @ManyToOne
    @JoinColumn(name = "cod_instituicao",nullable = false)
    private Instituicao instituicao;
    
    //Despesa Fornecedor
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="Requisicao",
    joinColumns={@JoinColumn(name="cod_despesa")},
    inverseJoinColumns={@JoinColumn(name="cod_fornecedor")})
    private List<Fornecedor> fornecedores;

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTipoDispesa() {
        return tipoDespesa;
    }

    public void setTipoDispesa(String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
