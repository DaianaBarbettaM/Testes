/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Bean.Macarrao;
import DAO.MacarraoDAO;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class MacarraoJUnitTest {
    
   @Test 
   public void testarCadastro(){
       Macarrao nissin = new Macarrao();
       nissin.setMarca("Nissin");
       nissin.setPeso(100);
       nissin.setAldente(false);
       nissin.setTipo("Na hora");
       
       int identificador = new MacarraoDAO().
               cadastrar(nissin);
       
       assertNotSame(identificador, -1);
       Macarrao macarraoBuscando = new MacarraoDAO().
               obterPeloId(identificador);
       
       //verifica se o que foi guardado em um objeto java
       // foi o que realmente foiarmazenado no banco, ou seja
       //consistir se as informaçoes sao iguais
       //ANTES DE CRIAR O DAO CRIAR O TEST!
       assertNotNull(macarraoBuscando);
       assertEquals(nissin.getMarca(),macarraoBuscando.getMarca());
       assertEquals(nissin.getPeso(), macarraoBuscando.getPeso(),0);
       assertEquals(nissin.isAldente(),macarraoBuscando.isAldente());
       assertEquals(nissin.getTipo(), macarraoBuscando.getTipo());
       
       
       
   }

   @Test
   public void testarEditar(){
       Macarrao magali = new Macarrao();
       magali.setMarca("Magali");
       magali.setPeso(80);
       magali.setAldente(true);
       magali.setTipo("Na hora");
       
       int identificador = new MacarraoDAO().cadastrar(magali);
       magali.setId(identificador);
       
       magali.setMarca("Monica");
       magali.setPeso(8001);
       magali.setAldente(false);
       magali.setTipo("Da hora");
       boolean alterado =new MacarraoDAO().alterar(magali);
       assertTrue(alterado);
       
       Macarrao macarraoBuscando = new MacarraoDAO().
               obterPeloId(identificador);
       
       assertNotNull(macarraoBuscando);
       assertEquals(magali.getMarca(),macarraoBuscando.getMarca());
       assertEquals(magali.getPeso(), macarraoBuscando.getPeso(),0);
       assertEquals(magali.isAldente(),macarraoBuscando.isAldente());
       assertEquals(magali.getTipo(), macarraoBuscando.getTipo());
       
   }
   
   @Test 
   public void testarApagar(){
       Macarrao magali = new Macarrao();
       magali.setMarca("Magali");
       magali.setPeso(80);
       magali.setAldente(true);
       magali.setTipo("Da hora");
       
       int identificador = new MacarraoDAO().cadastrar(magali);
       boolean excluido = new MacarraoDAO().apagar(identificador);
       assertTrue(excluido);
       
       Macarrao macarraoBuscado = new MacarraoDAO().obterPeloId(identificador);
       assertNull(macarraoBuscado);
   }
}
