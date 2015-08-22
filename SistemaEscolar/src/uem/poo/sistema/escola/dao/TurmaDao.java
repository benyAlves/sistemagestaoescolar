/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Turma;

/**
 *
 * @author claucio
 */
public class TurmaDao extends GenericDao<Turma> {
    
    public void guardarTurma(Turma utilizador){
       if(utilizador.getCodigo()!=null)
           actualizar(utilizador);
       else
           guardar(utilizador);
    }
    
    public void apagarTurma(Turma utilizador){
        apagar(utilizador);
    }
    
    public List<Turma> buscaTodasTurmas(){
        return buscaTodos();
    }
    
    private Turma buscaTurmaPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Turma buscaTurmaPorNome(String nome){
        return procuraPorNome(nome);
    }
    
}
