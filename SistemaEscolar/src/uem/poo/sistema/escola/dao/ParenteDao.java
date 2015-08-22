/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Parente;

/**
 *
 * @author claucio
 */
public class ParenteDao extends GenericDao<Parente>{
    
    public void guardarParente(Parente utilizador){
       if(utilizador.getCodigo()!=null)
           actualizar(utilizador);
       else
           guardar(utilizador);
    }
    
    public void apagarParente(Parente utilizador){
        apagar(utilizador);
    }
    
    public List<Parente> buscaTodosParentes(){
        return buscaTodos();
    }
    
    private Parente buscaParentePorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Parente buscaParenterPorNome(String nome){
        return procuraPorNome(nome);
    }
    
}
