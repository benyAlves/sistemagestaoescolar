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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author maluleque
 */
@Entity
public class Endereco implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    @Column(nullable = true)
    private String quarteirao;
    @Column(name = "rua_avenida", nullable = true)
    private String ruaAvenida;
    @Column(name = "nr_casa", nullable = true)
    private int nrCasa;
    @ManyToOne
    @JoinColumn(name = "cod_cidade", nullable = true)
    private Cidade cidade;
    @ManyToOne
    @JoinColumn(name = "cod_distrito", nullable = true)
    private Distrito distrito;
    @ManyToOne
    @JoinColumn(name = "cod_bairro", nullable = false)
    private Bairro bairro;
    @OneToMany(mappedBy = "endereco")
    private List<Aluno> alunos;
    @OneToOne(mappedBy = "endereco")
    private Instituicao instituicao;

    public Endereco(String quarteirao, String ruaAvenida, int nrCasa, Cidade cidade, Distrito distrito, Bairro bairro) {
        this.quarteirao = quarteirao;
        this.ruaAvenida = ruaAvenida;
        this.nrCasa = nrCasa;
        this.cidade = cidade;
        this.distrito = distrito;
        this.bairro = bairro;
    }
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getQuarteirao() {
        return quarteirao;
    }

    public void setQuarteirao(String quarteirao) {
        this.quarteirao = quarteirao;
    }

    public String getRuaAvenida() {
        return ruaAvenida;
    }

    public void setRuaAvenida(String ruaAvenida) {
        this.ruaAvenida = ruaAvenida;
    }

    public int getNrCasa() {
        return nrCasa;
    }

    public void setNrCasa(int nrCasa) {
        this.nrCasa = nrCasa;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAluno(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
}
