/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Classe;

/**
 *
 * @author claucio
 */
public class ClasseDao extends GenericDao<Classe>{
    public void guardarClasse(Classe classe){
       if(classe.getCodigo()!=null)
           actualizar(classe);
       else
           guardar(classe);
    }
    
    public void apagarClasse(Classe classe){
        apagar(classe);
    }
    
    public List<Classe> buscaTodasClasses(){
        return buscaTodos();
    }
    
    private Classe buscaClassePorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Classe buscaClassePorNome(String nome){
        return procuraPorNome(nome);
    }
    
}
