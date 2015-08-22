/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Telefone;

/**
 *
 * @author claucio
 */
public class TelefoneDao extends GenericDao<Telefone>{
    
    public void guardarTelefone(Telefone utilizador){
       if(utilizador.getCodigo()!=null)
           actualizar(utilizador);
       else
           guardar(utilizador);
    }
    
    public void apagarTelefone(Telefone utilizador){
        apagar(utilizador);
    }
    
    public List<Telefone> buscaTodosTelefones(){
        return buscaTodos();
    }
    
    private Telefone buscaTelefonePorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Telefone buscaTelefonerPorNome(String nome){
        return procuraPorNome(nome);
    }
}
