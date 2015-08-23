/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Exame;

/**
 *
 * @author France Antonio cossa
 */
public class ExameDao extends  GenericDao<Exame>{
    
     public void guardarExame(Exame exame){
       if(exame.getCodigo()!=null)
           actualizar(exame);
       else
           guardar(exame);
    }
    
    public void apagarExame(Exame exame){
        apagar(exame);
    }
    
    public List<Exame> buscaTodosExames(){
        return buscaTodos();
    }
    
    private Exame buscaExamePorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Exame buscaExamePorNome(String nome){
        return procuraPorNome(nome);
    }
    
}
