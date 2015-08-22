/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Distrito;

/**
 *
 * @author claucio
 */
public class DistritoDao extends GenericDao<Distrito>{
    
    public void guardarDistrito(Distrito classe){
       if(classe.getCodigo()!=null)
           actualizar(classe);
       else
           guardar(classe);
    }
    
    public void apagarDistrito(Distrito classe){
        apagar(classe);
    }
    
    public List<Distrito> buscaTodosDistritos(){
        return buscaTodos();
    }
    
    private Distrito buscaDistritoPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Distrito buscaDistritoPorNome(String nome){
        return procuraPorNome(nome);
    }
}
