/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.TipoPagamento;

/**
 *
 * @author France Antonio cossa
 */
public class TipoPagamentoDao extends GenericDao<TipoPagamento>{
    
     public void guardarTipoPagamento(TipoPagamento tipoPagamento){
       if(tipoPagamento.getCodigo()!=null)
           actualizar(tipoPagamento);
       else
           guardar(tipoPagamento);
    }
    
    public void apagarTipoPagamento(TipoPagamento tipoPagamento){
        apagar(tipoPagamento);
    }
    
    public List<TipoPagamento> buscaTodosTipoPagamento(){
        return buscaTodos();
    }
    
    private TipoPagamento buscaTipoPagamentoPorId(Long codigo){
        return (TipoPagamento) procuraPorId(codigo);
    }
    
    private TipoPagamento buscaTipoPagamentoPorNome(String nome){
        return (TipoPagamento) procuraPorNome(nome);
    }
    
}
