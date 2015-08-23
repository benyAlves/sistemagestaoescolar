/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author claucio
 */
@Embeddable
public class Aproveitamento implements Serializable{
    @EmbeddedId
    private AproveitamentoPK chaveComposta;
    private String aproveitamento;
    private double media;
    @Temporal(TemporalType.DATE)
    private Date data;
    private int faltas;
    private String observacao;

    public Aproveitamento() {
    }

    public AproveitamentoPK getChaveComposta() {
        return chaveComposta;
    }

    public void setChaveComposta(AproveitamentoPK chaveComposta) {
        this.chaveComposta = chaveComposta;
    }
            
    public String getAproveitamento() {
        return aproveitamento;
    }

    public void setAproveitamento(String aproveitamento) {
        this.aproveitamento = aproveitamento;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
}