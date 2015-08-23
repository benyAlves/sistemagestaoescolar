/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
    
    @OneToMany(fetch=FetchType.LAZY)
    private List<Funcionario> funcionarios;
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name= "CargoImposto",
    joinColumns={@JoinColumn(name= "cod_cargo")},
    inverseJoinColumns={@JoinColumn(name= "cod_imposto")})
    private List<Imposto> impostos;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Imposto> getImpostos() {
        return impostos;
    }

    public void setImpostos(List<Imposto> impostos) {
        this.impostos = impostos;
    }


    
}
