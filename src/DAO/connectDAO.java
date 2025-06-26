/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

//import Uteis.DateParser;
import CLASSES.Noticia;
import UTEIS.DateParser;
import UTEIS.ValidationException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.logging.Level;
/**
 *
 * @author Trabalhos
 */
public class connectDAO {
    Connection con;
    public Connection connectDB(){
 
         //JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");
 
        /* NO NOTE DA FATEC 
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=PI_JAVA;"
                + "encrypt=true;trustServerCertificate=true;"; 
        String usuario = "sa";
        String senha = ".";
        
        /* Em casa */
        
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=PI_JAVA;"
                + "integratedSecurity=true;encrypt=true;trustServerCertificate=true;"; 

        String usuario = "";
        String senha = "";
       /* */

        
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
        }
        return con;
        // con.close();
    }
    
    public void insereRegistros(String tabela, String strDados){
        con = connectDB();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String sql = "Insert into dbo." + tabela + " Values (" + strDados + ")";
            try {
                JOptionPane.showMessageDialog(null,sql);
                stmt.execute(sql);
                JOptionPane.showMessageDialog(null, "Notícia cadastrada com sucesso");
                con.close();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
        } catch (SQLException erro) {
             Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
        }

    }
    public Noticia pesquisaNoticia(String pesquisaId) throws ValidationException{
        Noticia noticiaReturn = new Noticia();
        con = connectDB();
        Statement stmt;
            
        try {
            stmt = con.createStatement();
            String sql = "SELECT * FROM Noticias " + " WHERE " + pesquisaId;
            JOptionPane.showMessageDialog(null, "String de Select: " + sql);
            try {
                ResultSet dados;
                dados = stmt.executeQuery(sql);
                if(dados.next() == false)
                    noticiaReturn = null;
                else{
                    String dataFormatada = DateParser.parseDMA(dados.getString(4));
                    try {
                        noticiaReturn.setId(dados.getInt(1));
                        noticiaReturn.setTitulo(dados.getString(2));
                        noticiaReturn.setDescricao(dados.getString(3));
                        noticiaReturn.setDataPuclicacao(dataFormatada);
                        noticiaReturn.setIdAdmin(dados.getInt(5));
                    } catch (ValidationException e) {
                        con.close();
                        throw e;
                    }
                }
                con.close();
                return noticiaReturn;
            } catch(SQLException erro){
                noticiaReturn = null;
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            con.close();
        } catch(SQLException ex){
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return noticiaReturn;
    }
    
    public void alteraRegistroJFDB(String tabela,String strDados, String pesquisaID){
        con = connectDB();
        Statement stmt;
        try{
            stmt = con.createStatement();
            String sql = "UPDATE dbo." + tabela +
                    " SET " + strDados +
                    " WHERE " + pesquisaID + ";";
                    
            JOptionPane.showMessageDialog(null, "String de Update: " + sql);
            
            try{
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Notícia atualizada com sucesso");
            } catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            con.close();
        } catch(SQLException ex){
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluiRegistroJFDB(String tabela, String pesquisaID){
        con = connectDB();
        Statement stmt;
        try{
            stmt = con.createStatement();
            String sql = "DELETE from dbo." + tabela +
                  " WHERE id ='" + pesquisaID + "'";
            
            JOptionPane.showMessageDialog(null, "String de Delete: " + sql);
            
            try{
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Notícia removida com sucesso");
            } catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            con.close();
        } catch(SQLException ex){
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet consultaNoticia(){
        con = connectDB();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String sql = "SELECT * FROM Noticias";

            try {
                ResultSet dados;
                dados = stmt.executeQuery(sql);
                return dados;
            } catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            
        } catch(SQLException ex){
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
