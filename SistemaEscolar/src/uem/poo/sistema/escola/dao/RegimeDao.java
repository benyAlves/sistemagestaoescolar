/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Regime;

/**
 *
 * @author claucio
 */
public class RegimeDao extends GenericDao<Regime>{
    
    public void guardarRegime(Regime utilizador){
       if(utilizador.getCodigo()!=null)
           actualizar(utilizador);
       else
           guardar(utilizador);
    }
    
    public void apagarRegime(Regime utilizador){
        apagar(utilizador);
    }
    
    public List<Regime> buscaTodosRegimes(){
        return buscaTodos();
    }
    
    private Regime buscaRegimePorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Regime buscaRegimerPorNome(String nome){
        return procuraPorNome(nome);
    }
    
}
