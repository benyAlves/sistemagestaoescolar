/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Sala;

/**
 *
 * @author France Antonio cossa
 */
public class SalaDao extends  GenericDao<Sala>{
    
     public void guardarSala(Sala sala){
       if(sala.getCodigo()!=null)
           actualizar(sala);
       else
           guardar(sala);
    }
    
    public void apagarSala(Sala sala){
        apagar(sala);
    }
    
    public List<Sala> buscaTodosSalas(){
        return buscaTodos();
    }
    
    private Sala buscaSalaPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Sala buscaSalaPorNome(String nome){
        return procuraPorNome(nome);
    }
    
}
