

import org.junit.Test;
import static org.junit.Assert.*;


public class FilmesJUnitTest {
    
  @Test 
  public void TestarCadastro(){
      
       Filme peppa = new Filme();
       peppa.setNome("Peppa");
       peppa.setDiretor("Um ai");
       peppa.setCategoria("Infatil");
       peppa.setAno(2018);
       peppa.setAtorPrincipal("Peppa Pig");
       peppa.setTempoFilme(180);
       peppa.setOrcamento(2000);
       peppa.setFaturamento(3000);
       peppa.setFaixaEtaria("Livre");
       peppa.setLegenda(true);
       peppa.setDublado(false);
       peppa.setIdiomaOriginal("Ingles");
       int identificador = new FilmeDAO().
               cadastrar(peppa);
       
       assertNotSame(identificador, -1);
       Filme filmeBuscando = new FilmeDAO().
               obterPeloId(identificador);
       assertNotNull(filmeBuscando);
       assertEquals(peppa.getNome(),filmeBuscando.getNome());
       assertEquals(peppa.getDiretor(), filmeBuscando.getDiretor());
       assertEquals(peppa.getCategoria(), filmeBuscando.getCategoria());
       assertEquals(peppa.getAno(),filmeBuscando.getAno());
       assertEquals(peppa.getAtorPrincipal(),filmeBuscando.getAtorPrincipal());
       assertEquals(peppa.getTempoFilme(),filmeBuscando.getTempoFilme());
       assertEquals(peppa.getOrcamento(), filmeBuscando.getOrcamento());
       assertEquals(peppa.getFaturamento(),filmeBuscando.getFaturamento());
       assertEquals(peppa.getFaixaEtaria(), filmeBuscando.getFaixaEtaria());
       assertEquals(peppa.getLegenda(),filmeBuscando.getLegenda());
       assertEquals(peppa.getDublado(), filmeBuscando.getDublado());
       assertEquals(peppa.getIdiomaOriginal(),filmeBuscando.getIdiomaOriginal());
}
        
}
