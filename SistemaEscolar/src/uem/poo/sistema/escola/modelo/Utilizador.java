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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author maluleque
 */
@Entity
public class Utilizador implements  Serializable{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long codigo;
    @Column(nullable = false,unique = false)
    private String nomeUtilizador;
    @Column(nullable = false,unique = false)
    private String nomeCompleto;
    @Column(nullable = false,unique = false)
    private String senha;
    private String estado;
    @OneToMany(mappedBy = "utilizador")
    private List<Telefone> telefones;
    
    @OneToMany(mappedBy = "utilizador")
    private List<Expediente> expedientes;
    
    @OneToMany(mappedBy = "utilizador")
    private List<Ocorrencia> ocorrencias;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="Utilizador_Previlegio",
    joinColumns={@JoinColumn(name="cod_utilizador")},
    inverseJoinColumns={@JoinColumn(name="cod_previlegio")})
    private List<Previlegio> previlegios;
    
    public Long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nomeUtilizador
     */
    public String getNomeUtilizador() {
        return nomeUtilizador;
    }

    /**
     * @param nomeUtilizador the nomeUtilizador to set
     */
    public void setNomeUtilizador(String nomeUtilizador) {
        this.nomeUtilizador = nomeUtilizador;
    }

    /**
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
