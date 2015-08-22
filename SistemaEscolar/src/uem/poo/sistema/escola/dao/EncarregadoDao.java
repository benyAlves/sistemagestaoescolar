/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Encarregado;

/**
 *
 * @author claucio
 */
public class EncarregadoDao extends GenericDao<Encarregado> {
    
    public void guardarEncarregado(Encarregado encarregado){
       if(encarregado.getCodigo()!=null)
           actualizar(encarregado);
       else
           guardar(encarregado);
    }
    
    public void apagarEncarregado(Encarregado encarregado){
        apagar(encarregado);
    }
    
    public List<Encarregado> buscaTodosEncarregados(){
        return buscaTodos();
    }
    
    private Encarregado buscaEncarregadoPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Encarregado buscaEncarregadoPorNome(String nome){
        return procuraPorNome(nome);
    }
}
