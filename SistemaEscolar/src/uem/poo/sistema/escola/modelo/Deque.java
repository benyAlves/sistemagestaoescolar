/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author France Antonio cossa
 */
@Entity
public class Deque implements Serializable{
    
    @EmbeddedId
    private DequePK chaveComposta;

    @Column(name = "caminho_ficheiro", nullable = false,unique = true)
    private String caminhoFicheiro;
    private String observacao;
    @ManyToOne
    @JoinColumn(name = "cod_turma", nullable = false)
    private Turma turma; 


    public String getCaminhoFicheiro() {
        return caminhoFicheiro;
    }

    public void setCaminhoFicheiro(String caminhoFicheiro) {
        this.caminhoFicheiro = caminhoFicheiro;
    }
    
    
    
}
