/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.io.Serializable;
import java.util.List;
import uem.poo.sistema.escola.modelo.AnoLetivo;

/**
 *
 * @author France Antonio cossa
 */
public class AnoLectivoDao extends GenericDao<AnoLetivo>{
    
     public void guardarAnoLectivoDao(AnoLetivo anoLetivo){
       if(anoLetivo.getCodigo()!=null)
           actualizar(anoLetivo);
       else
           guardar(anoLetivo);
    }
    
    public void apagarAnoLectivoDao(AnoLetivo anoLetivo){
        apagar(anoLetivo);
    }
    
    public List<AnoLetivo> buscaTodosAnoLectivoDao(){
        return buscaTodos();
    }
    
    private AnoLetivo buscaAnoLectivoDao(Long codigo){
        return (AnoLetivo) procuraPorId(codigo);
    }
    
    private AnoLetivo buscaAnoLectivoDao(String nome){
        return (AnoLetivo) procuraPorNome(nome);
    }
}
