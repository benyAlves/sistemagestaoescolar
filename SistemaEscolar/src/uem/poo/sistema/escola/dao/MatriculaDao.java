/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Encarregado;
import uem.poo.sistema.escola.modelo.Matricula;

/**
 *
 * @author claucio
 */
public class MatriculaDao extends GenericDao<Matricula> {
    
    public void guardarMatricula(Matricula matricula){
       if(matricula.getChaveComposta()!=null)
           actualizar(matricula);
       else
           guardar(matricula);
    }
    
    public void apagarMatricula(Matricula matricula){
        apagar(matricula);
    }
    
    public List<Matricula> buscaTodasMatriculas(){
        return buscaTodos();
    }
    
    private Matricula buscaMatriculaPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Matricula buscaMatriculaPorNome(String nome){
        return procuraPorNome(nome);
    }
}
