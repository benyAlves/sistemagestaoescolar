/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Bairro;

/**
 *
 * @author claucio
 */
public class BairroDao extends GenericDao<Bairro> {
    
    public void guardarBairro(Bairro bairro){
       if(bairro.getCodigo()!=null)
           actualizar(bairro);
       else
           guardar(bairro);
    }
    
    public void apagarBairro(Bairro bairro){
        apagar(bairro);
    }
    
    public List<Bairro> buscaTodosBairros(){
        return buscaTodos();
    }
    
    private Bairro buscaBairroPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Bairro buscaBairroPorNome(String nome){
        return procuraPorNome(nome);
    }
}
