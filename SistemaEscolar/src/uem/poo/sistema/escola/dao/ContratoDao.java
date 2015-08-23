/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Contrato;

/**
 *
 * @author machiza
 */
public class ContratoDao extends GenericDao<Contrato> {
    
    public void apagar(Contrato contrato) {
        apagar(contrato);
    }
    
    public List<Contrato> buscaTodosContrados() {
        return buscaTodos();
    }
    
    public Contrato buscaPorCodigoContrato(Long codigo) {
        return procuraPorId(codigo);
    }
    
    public Contrato buscaPorNome(String nome) {
        return procuraPorNome(nome);
    }
}
