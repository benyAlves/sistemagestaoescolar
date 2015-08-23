/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.io.Serializable;
import java.util.List;
import uem.poo.sistema.escola.modelo.Despesa;

/**
 *
 * @author claucio
 */
public class DispesaDao extends GenericDao<Despesa>{
    
     public void guardarDispesa(Despesa dispesa){
       if(dispesa.getCodigo()!=null)
           actualizar(dispesa);
       else
           guardar(dispesa);
    }
    
    public void apagarDispesa(Despesa dispesa){
        apagar(dispesa);
    }
    
    public List<Despesa> buscaTodasDispesa(){
        return buscaTodos();
    }
    
    private Despesa buscaDispesaPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Despesa buscaDispesaPorNome(String nome){
        return procuraPorNome(nome);
    }
}
