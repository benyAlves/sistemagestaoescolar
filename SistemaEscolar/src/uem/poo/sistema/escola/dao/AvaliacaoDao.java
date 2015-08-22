/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Aproveitamento;

/**
 *
 * @author claucio
 */
public class AvaliacaoDao extends GenericDao<uem.poo.sistema.escola.modelo.Aproveitamento>{
    
    public void guardarAvaliacao(Aproveitamento avaliacao){
       if(avaliacao.getChaveComposta()!=null)
           actualizar(avaliacao);
       else
           guardar(avaliacao);
    }
    
    public void apagarAvaliacao(Aproveitamento avaliacao){
        apagar(avaliacao);
    }
    
    public List<Aproveitamento> buscaTodasAvaliacoes(){
        return buscaTodos();
    }
    
    private Aproveitamento buscaAvaliacaoPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Aproveitamento buscaAvaliacaoPorNome(String nome){
        return procuraPorNome(nome);
    }
    
}
