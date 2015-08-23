/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author machiza
 */
@Entity
public class Contrato implements Serializable{
    @EmbeddedId
    private ContratoPK chaveComposta;
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "meses_contrato")
    private int mesesContracto;
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getMesesContracto() {
        return mesesContracto;
    }

    public void setMesesContracto(int mesesContracto) {
        this.mesesContracto = mesesContracto;
    }    
}
