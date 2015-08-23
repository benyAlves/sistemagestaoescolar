/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author claucio
 */
@Entity
public class Mensalidade implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    @Column(nullable = false)
    private double valorApagar;
    @Column(nullable = false)
    private double valorPago;
    
    // Relacionamento de Mensalidade e matricula
    @ManyToOne
    @JoinColumn(name = "cod_matricula")
    private Matricula matricula;
    
    // Relacionamento de Mensalidade e Tipo de Pagamento 
    @ManyToOne
    @JoinColumn(name = "cod_tipo_pagamento")
    private TipoPagamento tipoPagamento;
    

    public Mensalidade(Date dataVencimento, Date dataPagamento, double valorApagar, double valorPago) {
        
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.valorApagar = valorApagar;
        this.valorPago = valorPago;
    }
        
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValorApagar() {
        return valorApagar;
    }

    public void setValorApagar(double valorApagar) {
        this.valorApagar = valorApagar;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
    
}
