/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author maluleque
 */
@MappedSuperclass
public class Pessoa implements Serializable{
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    @Column(nullable = false)
    private String apelido;
    @Column(name = "outros_nomes", nullable = false)
    private String outrosNomes;
    @Column(nullable = false)
    private String nacionalidade;
    @Column(name = "nr_bi", nullable = false)
    private String nrBi;
    @Column(name = "email", nullable = true)
    private String email;
    @Column(nullable = false)
    private String sexo;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento", nullable = false)
    private Date dataNascimento;
    
    
    
    
}
