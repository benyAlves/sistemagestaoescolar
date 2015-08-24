/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author claucio
 */
public class Trimestre {
    private Long codigo;
    private String trimestre;
    
    @ManyToOne
    @JoinColumn(name = "cod_AnoLectivo",nullable = false)
    private AnoLetivo anoLectivo;
    
    @OneToMany(mappedBy = "trimestre")
    private List<Trimestre> trimestres;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }
        
}
