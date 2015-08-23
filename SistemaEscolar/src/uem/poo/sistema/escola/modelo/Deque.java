/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author France Antonio cossa
 */
@Entity
public class Deque implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    @Column(name = "caminho_ficheiro", nullable = false,unique = true)
    private String caminhoFicheiro;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getCaminhoFicheiro() {
        return caminhoFicheiro;
    }

    public void setCaminhoFicheiro(String caminhoFicheiro) {
        this.caminhoFicheiro = caminhoFicheiro;
    }
    
    
    
}
