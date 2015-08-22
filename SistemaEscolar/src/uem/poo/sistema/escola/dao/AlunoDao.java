/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uem.poo.sistema.escola.dao;

import java.util.List;
import uem.poo.sistema.escola.modelo.Aluno;

/**
 *
 * @author claucio
 */
public class AlunoDao extends GenericDao<Aluno>{
    
    public void guardarAluno(Aluno aluno){
       if(aluno != null){//o codigo nao foi criado porque????? necessario para continuar
           actualizar(aluno);
       }else{
           guardar(aluno);
       }
   }
      
   public void apagarAluno(Aluno aluno){
       apagar(aluno);
   }
    
   public List<Aluno> buscaTodosAluno(){
       return buscaTodos();
   }
   
   public Aluno buscaAlunoPorCodigo(Long codigo){
       return procuraPorId(codigo);
   }
   
   public Aluno buscaAlunoPorNome(String nome){
       return procuraPorNome(nome);
   }
    
}
