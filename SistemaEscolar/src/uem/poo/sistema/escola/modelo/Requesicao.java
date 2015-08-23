/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author claucio
 */
public class Requesicao implements Serializable {
    private RequesicaoPK chaveComposta;
    private Long codigoDispesa;
    private Long codigoFornecedor;
    private double valor;
    private Date data;

    public RequesicaoPK getChaveComposta() {
        return chaveComposta;
    }

    public void setChaveComposta(RequesicaoPK chaveComposta) {
        this.chaveComposta = chaveComposta;
    }

    public Long getCodigoDispesa() {
        return codigoDispesa;
    }

    public void setCodigoDispesa(Long codigoDispesa) {
        this.codigoDispesa = codigoDispesa;
    }

    public Long getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(Long codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
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
