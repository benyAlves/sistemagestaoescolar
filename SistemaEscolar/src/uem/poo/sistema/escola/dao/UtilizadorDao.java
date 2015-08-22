/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Utilizador;

/**
 *
 * @author claucio
 */
public class UtilizadorDao extends GenericDao<Utilizador>{
    
    public void guardarUtilizador(Utilizador utilizador){
       if(utilizador.getCodigo()!=null)
           actualizar(utilizador);
       else
           guardar(utilizador);
    }
    
    public void apagarUtilizador(Utilizador utilizador){
        apagar(utilizador);
    }
    
    public List<Utilizador> buscaTodosUtilizadores(){
        return buscaTodos();
    }
    
    private Utilizador buscaUtilizadorPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Utilizador buscaUtilizadorPorNome(String nome){
        return procuraPorNome(nome);
    }
    
}
