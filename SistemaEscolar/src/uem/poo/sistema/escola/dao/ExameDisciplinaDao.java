/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.ExameAluno;

/**
 *
 * @author machiza
 */
public class ExameDisciplinaDao extends GenericDao<ExameAluno> {

    
    public void apagarExameDisciplina(ExameAluno exameDisciplina) {
        apagar(exameDisciplina);
    }
    
    public List<ExameAluno> buscaTodosExamesDisciplina() {
        return buscaTodos();
    }
    
    public ExameAluno buscaPorIdExameDisciplina(Long codigo) {
        return procuraPorId(codigo);
    }
    
    public ExameAluno buscaPorNomeExameDisciplina(String nome) {
        return procuraPorNome(nome);
    }
}
