/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Disciplina;

/**
 *
 * @author claucio
 */
public class DisciplinaDao extends GenericDao<Disciplina>{
    
    public void guardarDisciplina(Disciplina disciplina){
       if(disciplina.getCodigo()!=null)
           actualizar(disciplina);
       else
           guardar(disciplina);
    }
    
    public void apagarDisciplina(Disciplina disciplina){
        apagar(disciplina);
    }
    
    public List<Disciplina> buscaTodasDisciplinas(){
        return buscaTodos();
    }
    
    private Disciplina buscaDisciplinaPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Disciplina buscaDisciplinaPorNome(String nome){
        return procuraPorNome(nome);
    }
}
