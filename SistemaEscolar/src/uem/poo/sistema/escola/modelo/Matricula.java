/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.util.Date;
import java.util.List;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@OneToMany(mappedBy = "matricula")
private List<Matricula> matricula;

@ManyToOne
@JoinColumn(name = "cod_turma")
private Turma turma;

}
