/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author France Antonio cossa
 */
@Entity
public class Exame implements  Serializable{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    @Column(nullable = false,unique = true)
    private String epoca;
    @Column(name = "data_inicial" ,nullable = false,unique = true)
    @Temporal(TemporalType.DATE)
    private Date dataInicial;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_final", nullable =false ,unique = true)
    private Date dataFinal;
    
     //relacionamento Exame Disciplina
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="ExameDisciplina",
    joinColumns={@JoinColumn(name="cod_exame")},
    inverseJoinColumns={@JoinColumn(name="cod_disciplina")})
    private List<Disciplina> disciplinas;
    
    @ManyToOne
    @JoinColumn(name = "cod_ano_lectivo")
    private AnoLetivo anoLectivo;

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public AnoLetivo getAnoLectivo() {
        return anoLectivo;
    }

    public void setAnoLectivo(AnoLetivo anoLectivo) {
        this.anoLectivo = anoLectivo;
    }
    
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    
    
    
}
