/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Funcionario;

/**
 *
 * @author machiza
 */
public class FuncionarioDao extends GenericDao<Funcionario> {
    public void guardaFuncionario(Funcionario funcionario) {
        if(funcionario.getCodigo() != null) {
            actualizar(funcionario);
        }else {
            guardar(funcionario);
        }
    }
    
    public void apagarFuncionario(Funcionario funcionario) {
        apagar(funcionario);
    }
    
    public List<Funcionario> buscaTodosFuncionarios() {
        return buscaTodos();
    }
    
    public Funcionario buscaPorCodigoFuncionario(Long codigo) {
        return procuraPorId(codigo);
    }
    
    public Funcionario buscaPorNomeFuncionario(String nome) {
        return procuraPorNome(nome);
    }
}
