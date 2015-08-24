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
import javax.persistence.OneToMany;

/**
 *
 * @author France Antonio cossa
 */
@Entity
public class TipoPagamento implements Serializable{
  
    @Id @GeneratedValue(strategy = GenerationType.AUTO )
    private Long codigo;
    @Column(length = 20,nullable = false,unique = false)
    private String tipo;
    @Column(length = 20,nullable=false,unique=false)
    private Long numero;

    @OneToMany(mappedBy = "tipo_Pagamento")
    private List<Matricula> matriculas;
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    
}
