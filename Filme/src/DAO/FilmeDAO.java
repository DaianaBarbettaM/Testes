
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FilmeDAO {
    
    public int cadastrar (Filme filme){
        Connection conexao = new Conexao.conexao();
        if(conexao != null){
            String sql= "INSERT INTO filme"
                    + "nome, diretor, categoria, categoria, ano, "
                    + "atorPrincipal, tempoFilme, orcamento, "
                    + "faturamento,faixaEtaria, legenda, idiomaOriginal"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            try{
                PreparedStatement ps = conexao.PreparedStatement(sql,
                        PreparedStatement );
                
                
            }catch(SQLException e)
                e.printStackTrace();
            }finally{
                Conexao.desconectar();
            }
        }
        return -1;
        
        
        
            
           
}
