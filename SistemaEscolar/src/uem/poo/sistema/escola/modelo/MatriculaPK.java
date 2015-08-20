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
public class MatriculaPK implements Serializable{
    
@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name="cod_aluno")
private Aluno aluno;
@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "cod_classe")
private Classe classe;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    


}
