/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.io.Serializable;
import java.util.List;
import uem.poo.sistema.escola.modelo.Dispesa;

/**
 *
 * @author claucio
 */
public class DispesaDao extends GenericDao<Dispesa>{
    
     public void guardarDispesa(Dispesa dispesa){
       if(dispesa.getCodigo()!=null)
           actualizar(dispesa);
       else
           guardar(dispesa);
    }
    
    public void apagarDispesa(Dispesa dispesa){
        apagar(dispesa);
    }
    
    public List<Dispesa> buscaTodasDispesa(){
        return buscaTodos();
    }
    
    private Dispesa buscaDispesaPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Dispesa buscaDispesaPorNome(String nome){
        return procuraPorNome(nome);
    }
}
