/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author maluleque
 */
@Entity
public class Matricula {
    
@EmbeddedId
private MatriculaPK chaveComposta;

private double valor;
private String estado;
private String observacao;
@Temporal(TemporalType.DATE)
private Date data;
}
