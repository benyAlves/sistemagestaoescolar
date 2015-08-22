/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Endereco;

/**
 *
 * @author claucio
 */
public class EnderecoDao extends GenericDao<Endereco> {
    
    public void guardarEndereco(Endereco endereco){
       if(endereco.getCodigo()!=null)
           actualizar(endereco);
       else
           guardar(endereco);
    }
    
    public void apagarEndereco(Endereco endereco){
        apagar(endereco);
    }
    
    public List<Endereco> buscaTodosEnderecos(){
        return buscaTodos();
    }
    
    private Endereco buscaEnderecoPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Endereco buscaDistritoPorEndereco(String nome){
        return procuraPorNome(nome);
    }
    
}
