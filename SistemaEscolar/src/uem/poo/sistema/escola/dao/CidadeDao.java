/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Aproveitamento;
import uem.poo.sistema.escola.modelo.Cidade;

/**
 *
 * @author claucio
 */
public class CidadeDao extends GenericDao<Cidade> {
    public void guardarCidade(Cidade cidade){
       if(cidade.getCodigo()!=null)
           actualizar(cidade);
       else
           guardar(cidade);
    }
    
    public void apagarCidade(Cidade cidade){
        apagar(cidade);
    }
    
    public List<Cidade> buscaTodasCidade(){
        return buscaTodos();
    }
    
    private Cidade buscaCidadePorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Cidade buscaCidadePorNome(String nome){
        return procuraPorNome(nome);
    }        
}
