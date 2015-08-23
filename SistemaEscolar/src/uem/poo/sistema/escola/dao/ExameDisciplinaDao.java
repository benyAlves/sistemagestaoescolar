/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.ExameDisciplina;

/**
 *
 * @author machiza
 */
public class ExameDisciplinaDao extends GenericDao<ExameDisciplina> {
    public void guardarExameDisciplina(ExameDisciplina exameDisciplina) {
        if(exameDisciplina.getCodigo() != null) {
            actualizar(exameDisciplina);
        }else {
            guardar(exameDisciplina);
        }
    }
    
    public void apagarExameDisciplina(ExameDisciplina exameDisciplina) {
        apagar(exameDisciplina);
    }
    
    public List<ExameDisciplina> buscaTodosExamesDisciplina() {
        return buscaTodos();
    }
    
    public ExameDisciplina buscaPorIdExameDisciplina(Long codigo) {
        return procuraPorId(codigo);
    }
    
    public ExameDisciplina buscaPorNomeExameDisciplina(String nome) {
        return procuraPorNome(nome);
    }
}
