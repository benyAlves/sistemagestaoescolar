/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author claucio
 */
@Embeddable
public class RequesicaoPK {
    @ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name="cod_dispesa")
private Despesa despesa;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "cod_fornecedor")
private Fornecedor fornecedor;
}
