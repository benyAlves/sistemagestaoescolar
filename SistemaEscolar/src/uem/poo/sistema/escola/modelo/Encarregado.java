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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 *
 * @author claucio
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Encarregado extends Parente implements Serializable{
    @Column(name = "tipo", nullable = false)
    private String tipo;
    
    @OneToMany(mappedBy = "encarregado")
    private List<Aluno> alunos;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
