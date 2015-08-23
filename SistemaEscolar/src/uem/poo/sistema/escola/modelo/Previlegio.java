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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author maluleque
 */
@Entity
public class Previlegio implements Serializable{
    @Id @GeneratedValue
    private Long codigo;
    @Column(name = "nr_previlegio")
    private int nrPrevilegio;
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name= "Utilizador_Previlegio",
    joinColumns={@JoinColumn(name= "cod_previlegio")},
    inverseJoinColumns={@JoinColumn(name= "cod_utilizador")})
    private List<Utilizador> utilizadores;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public int getNrPrevilegio() {
        return nrPrevilegio;
    }

    public void setNrPrevilegio(int nrPrevilegio) {
        this.nrPrevilegio = nrPrevilegio;
    }

    public List<Utilizador> getUtilizadores() {
        return utilizadores;
    }

    public void setUtilizadores(List<Utilizador> utilizadores) {
        this.utilizadores = utilizadores;
    }

    
    
}
