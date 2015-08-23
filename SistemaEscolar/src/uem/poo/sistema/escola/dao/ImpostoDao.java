/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Imposto;

/**
 *
 * @author machiza
 */
public class ImpostoDao extends GenericDao<Imposto>{
    public void guardarInposto(Imposto imposto) {
        if(imposto.getCodigo() != null) {
            actualizar(imposto);
        }else {
            guardar(imposto);
        }
    }
    
    public void apagarImposto(Imposto imposto) {
        apagar(imposto);
    }
    
    public List<Imposto> buscaTodosImpostos() {
        return buscaTodos();
    }
    
    public Imposto buscaPorIdImposto(Long codigo) {
        return procuraPorId(codigo);
    }
    
    public Imposto buscaPorNomeImposto(String nome) {
        return procuraPorNome(nome);
    }
}
