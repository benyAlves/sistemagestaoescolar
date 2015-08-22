/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.dao.GenericDao;
import uem.poo.sistema.escola.modelo.Mensalidade;

/**
 *
 * @author claucio
 */
public class MensalidadeDao extends GenericDao<Mensalidade>{
    
    public void guardarMensalidade(Mensalidade mensalidade){
       if(mensalidade.getCodigo()!=null)
           actualizar(mensalidade);
       else
           guardar(mensalidade);
    }
    
    public void apagarMensalidade(Mensalidade mensalidade){
        apagar(mensalidade);
    }
    
    public List<Mensalidade> buscaTodasMensalidades(){
        return buscaTodos();
    }
    
    private Mensalidade buscaMensalidadePorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Mensalidade buscaMensalidadePorNome(String nome){
        return procuraPorNome(nome);
    }
    
}
