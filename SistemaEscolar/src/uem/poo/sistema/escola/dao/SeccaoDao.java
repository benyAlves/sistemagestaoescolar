/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.io.Serializable;
import java.util.List;
import uem.poo.sistema.escola.modelo.Seccao;

/**
 *
 * @author France Antonio cossa
 */
public class SeccaoDao extends GenericDao<Seccao>{
    
     public void guardarSeccao(Seccao seccao){
       if(seccao.getCodigo()!=null)
           actualizar(seccao);
       else
           guardar(seccao);
    }
    
    public void apagarSeccao(Seccao seccao){
        apagar(seccao);
    }
    
    public List<Seccao> buscaTodasSeccoes(){
        return buscaTodos();
    }
    
    private Seccao buscaSeccaoPorId(Long codigo){
        return (Seccao) procuraPorId(codigo);
    }
    
    private Seccao buscaSeccaoPorNome(String nome){
        return (Seccao) procuraPorNome(nome);
    }
    
}
