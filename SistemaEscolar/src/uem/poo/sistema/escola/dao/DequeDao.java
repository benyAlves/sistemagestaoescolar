/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Deque;

/**
 *
 * @author France Antonio cossa
 */
public class DequeDao extends GenericDao<Deque>{

    
    public void apagarDeque(Deque deque){
        apagar(deque);
    }
    
    public List<Deque> buscaTodosDeques(){
        return buscaTodos();
    }
    
    private Deque buscaDequePorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Deque buscaDequePorNome(String nome){
        return procuraPorNome(nome);
    }
    
}
