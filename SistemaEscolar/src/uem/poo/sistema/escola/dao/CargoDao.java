/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Cargo;

/**
 *
 * @author machiza
 */
public class CargoDao extends GenericDao<Cargo> {
    public void guardarCargo(Cargo cargo) {
        if(cargo.getCodigo() != null) {
            actualizar(cargo);
        }else {
            guardar(cargo);
        }
    }
    
    public void apagarCargo(Cargo cargo) {
        apagar(cargo);
    }
    
    public List<Cargo> buscaTodosCargos() {
        return buscaTodos();
    }
    
    public Cargo buscaPorIdCargo(Long codigo) {
        return procuraPorId(codigo);
    }
    
    public Cargo buscaPorNomeCargo(String nome) {
        return procuraPorNome(nome);
    }
}
