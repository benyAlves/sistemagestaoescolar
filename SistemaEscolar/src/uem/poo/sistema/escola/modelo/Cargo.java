/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author machiza
 */
@Entity
public class Cargo implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    
    private String cargo;
    
    private double salario;
    
    @ManyToOne(fetch=FetchType.LAZY)
    private Collection<Funcionario> funcionarios;
    
    @ManyToMany(fetch=FetchType.LAZY)
    private Collection<Imposto> impostos;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Collection<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Collection<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Collection<Imposto> getImpostos() {
        return impostos;
    }

    public void setImpostos(Collection<Imposto> impostos) {
        this.impostos = impostos;
    }
    
}
