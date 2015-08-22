/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author claucio
 */
@Entity
public class Turma implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    @Column(name = "pseudo_nome", nullable = false, unique = true)
    private String pseudoNome;

    @OneToMany(mappedBy = "turma")
    private List<Turma> turma;
    
    public Turma(String pseudoNome) {
        this.pseudoNome = pseudoNome;
    }
        
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getPseudoNome() {
        return pseudoNome;
    }

    public void setPseudoNome(String pseudoNome) {
        this.pseudoNome = pseudoNome;
    }
    
    
}
