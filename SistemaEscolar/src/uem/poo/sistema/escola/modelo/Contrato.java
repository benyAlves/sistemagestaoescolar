/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author machiza
 */
@Entity
public class Contrato implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    
    private Date data;
    
    private int mesesContracto;
    
    private Funcionario funcionario;
    
    private Contrato contrato;

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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
}
