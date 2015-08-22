/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.io.Serializable;
import java.util.List;
import uem.poo.sistema.escola.modelo.DirectorTurma;

/**
 *
 * @author France Antonio cossa
 */
public class DirectorTurmaDao extends GenericDao<DirectorTurma>{
    
      public void guardarDirectorTurma(DirectorTurma directorturma){
       if(directorturma.getCodigo()!=null)
           actualizar(directorturma);
       else
           guardar(directorturma);
    }
    
    public void apagarDirectorTurma(DirectorTurma directorturma){
        apagar(directorturma);
    }
    
    public List<DirectorTurma> buscaTodosBairros(){
        return buscaTodos();
    }
    
    private DirectorTurma buscaDirectorTurmaPorId(Long codigo){
        return (DirectorTurma) procuraPorId(codigo);
    }
    
    private DirectorTurma buscaDirectorTurmaPorNome(String nome){
        return (DirectorTurma) procuraPorNome(nome);
    }
    
}
