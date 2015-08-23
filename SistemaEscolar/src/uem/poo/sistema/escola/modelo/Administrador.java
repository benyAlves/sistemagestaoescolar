/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author claucio
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Administrador extends Utilizador implements Serializable{
    
    public void registaUtilizador(){}
    
}
