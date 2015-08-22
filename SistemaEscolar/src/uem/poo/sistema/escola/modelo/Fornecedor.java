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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author maluleque
 */

@Entity
public class Fornecedor implements Serializable{
    @Id @GeneratedValue
    private Long codigo;
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(name = "razao_social")
    private String razaoSocial;
    @ManyToOne
    @JoinColumn(name = "cod_endereco", nullable = false)
    private Endereco endereco;
    @OneToMany(mappedBy = "fornecedor")
    private List<Telefone> telefones;
}
