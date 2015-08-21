/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Instituicao;

/**
 *
 * @author maluleque
 */
public class InstituicaoDao extends GenericDao<Instituicao>{

   public void guardarInstituicao(Instituicao instituicao){
       if(instituicao.getCodigo() != null){
           actualizar(instituicao);
       }else{
           guardar(instituicao);
       }
   }
      
   public void apagarInstituicao(Instituicao instituicao){
       apagar(instituicao);
   }
    
   public List<Instituicao> buscaTodasInstituicoes(){
       return buscaTodos();
   }
   
   public Instituicao buscaPorCodigoInstituicao(Long codigo){
       return procuraPorId(codigo);
   }
   
   public Instituicao buscaPorNomeInstituicao(String nome){
       return procuraPorNome(nome);
   }
    
}
