/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.io.Serializable;
import java.util.List;

import uem.poo.sistema.escola.modelo.Fornecedor;
/**
 *
 * @author France Antonio cossa
 */
public class FornecedorDao extends GenericDao<Serializable>{
     public void guardarFornecedor(Fornecedor bairro){
       if(bairro.getCodigo()!=null)
           actualizar(bairro);
       else
           guardar(bairro);
    }
    
    public void apagarFornecedor(Fornecedor bairro){
        apagar(bairro);
    }
    
    public List<Serializable> buscaTodosFornecedor(){
        return buscaTodos();
    }
    
    private Fornecedor buscaFornecedorPorId(Long codigo){
        return (Fornecedor) procuraPorId(codigo);
    }
    
    private Fornecedor buscaFornecedorPorNome(String nome){
        return (Fornecedor) procuraPorNome(nome);
    }
    
}
