/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author maluleque
 */
@Embeddable
public class ContratoPK implements Serializable{
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cod_istituicao")
    private Instituicao instituicao;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cod_funcionario")
    private Funcionario funcionario;
}
