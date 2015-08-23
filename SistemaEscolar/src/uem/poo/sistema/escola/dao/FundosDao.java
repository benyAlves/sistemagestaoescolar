/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Fundos;

/**
 *
 * @author claucio
 */
public class FundosDao extends GenericDao<Fundos>{
    
    public void guardarFundos(Fundos fundos){
       if(fundos.getCodigo()!=null)
           actualizar(fundos);
       else
           guardar(fundos);
    }
    
    public void apagarFundos(Fundos fundos){
        apagar(fundos);
    }
    
    public List<Fundos> buscaTodasFundos(){
        return buscaTodos();
    }
    
    private Fundos buscaFundosPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Fundos buscaFundosPorNome(String nome){
        return procuraPorNome(nome);
    }
    
}
