/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Requesicao;

/**
 *
 * @author claucio
 */
public class RequesicaoDao extends GenericDao<Requesicao>{
    
     public void guardarAdministrador(Requesicao requesicao){
       if(requesicao.getChaveComposta()!=null)
           actualizar(requesicao);
       else
           guardar(requesicao);
    }
    
    public void apagarAdministrador(Requesicao requesicao){
        apagar(requesicao);
    }
    
    public List<Requesicao> buscaTodosRequesicoes(){
        return buscaTodos();
    }
    
    private Requesicao buscaRequesicaoPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Requesicao buscaRequesicaoPorNome(String nome){
        return procuraPorNome(nome);
    }
    
}
