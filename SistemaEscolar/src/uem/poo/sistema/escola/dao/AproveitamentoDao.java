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
 * @author France Antonio cossa
 */
public class AproveitamentoDao extends GenericDao<Aproveitamento>{
    
 public void guardarAproveitamento(Aproveitamento aproveitamento){
//       if(aproveitamento.getCodigo()!=null)
//           actualizar(aproveitamento);
//       else
           guardar(aproveitamento);
    }
    
    public void apagarAproveitamento(Aproveitamento aproveitamento){
        apagar(aproveitamento);
    }
    
    public List<Aproveitamento> buscaTodosAproveitamentos(){
        return buscaTodos();
    }
    
    private Aproveitamento buscaAproveitamentoPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Aproveitamento buscaAproveitamentoPorNome(String nome){
        return procuraPorNome(nome);
    }    
}
