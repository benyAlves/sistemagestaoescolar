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
 * @author claucio
 */
@Embeddable
public class AproveitamentoPK implements Serializable{
    //necessidade de criar pela existencia de atributos alem das chaves estrangeiras
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cod_aluno")
    private Aluno aluno;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cod_disciplina")
    private Disciplina disciplina;
    
    
}
