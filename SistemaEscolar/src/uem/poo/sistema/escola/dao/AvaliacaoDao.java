/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Avaliacao;

/**
 *
 * @author claucio
 */
public class AvaliacaoDao extends GenericDao<uem.poo.sistema.escola.modelo.Avaliacao>{
    
    public void guardarAvaliacao(Avaliacao avaliacao){
       if(avaliacao.getChaveComposta()!=null)
           actualizar(avaliacao);
       else
           guardar(avaliacao);
    }
    
    public void apagarAvaliacao(Avaliacao avaliacao){
        apagar(avaliacao);
    }
    
    public List<Avaliacao> buscaTodasAvaliacoes(){
        return buscaTodos();
    }
    
    private Avaliacao buscaAvaliacaoPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Avaliacao buscaAvaliacaoPorNome(String nome){
        return procuraPorNome(nome);
    }
    
}
