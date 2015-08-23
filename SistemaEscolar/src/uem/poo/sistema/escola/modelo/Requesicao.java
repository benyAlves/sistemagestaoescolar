/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author claucio
 */
@Entity
public class Requesicao implements Serializable {
    @EmbeddedId
    private RequesicaoPK chaveComposta;
    private double valor;
    @Temporal(TemporalType.DATE)
    private Date data;

    public RequesicaoPK getChaveComposta() {
        return chaveComposta;
    }

    public void setChaveComposta(RequesicaoPK chaveComposta) {
        this.chaveComposta = chaveComposta;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
