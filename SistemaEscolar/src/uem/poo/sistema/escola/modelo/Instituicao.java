/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToOne;

/**
 *
 * @author maluleque
 */
@Entity
public class Instituicao implements  Serializable{
  @Id @GeneratedValue(strategy = GenerationType.AUTO)
  private Long codigo;
  @Column( nullable = false,unique = false)
  private String sigla;
  @Column(nullable = false,unique = false)
  private String nome;
  @Column(nullable = false,unique = false)
  private String site;
  @Column(unique = false)
  private String fax;

  @OneToOne
  @JoinColumn(name = "cod_endereco")
  private Endereco endereco;
  @OneToMany(mappedBy = "instituicao")
  private List<Telefone> telefone;
  
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name= "Contrato",
    joinColumns={@JoinColumn(name= "cod_instituicao")},
    inverseJoinColumns={@JoinColumn(name= "cod_funcionario")})
    private List<Funcionario> funcionarios;
  
    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the site
     */
    public String getSite() {
        return site;
    }

    /**
     * @param site the site to set
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the codigo
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
}
