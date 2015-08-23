/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Administrador;

/**
 *
 * @author claucio
 */
public class AdministradorDao extends GenericDao<Administrador>{
    
    public void guardarAdministrador(Administrador administrador){
       if(administrador.getCodigo()!=null)
           actualizar(administrador);
       else
           guardar(administrador);
    }
    
    public void apagarAdministrador(Administrador administrador){
        apagar(administrador);
    }
    
    public List<Administrador> buscaTodosAdministradores(){
        return buscaTodos();
    }
    
    private Administrador buscaAdministradorPorId(Long codigo){
        return procuraPorId(codigo);
    }
    
    private Administrador buscaAdministradorPorNome(String nome){
        return procuraPorNome(nome);
    }
    
}
