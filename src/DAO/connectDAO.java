/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

//import Uteis.DateParser;
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
 
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;"
                + "encrypt=true;trustServerCertificate=true;"; 
        String usuario = "sa";
        String senha = ".";
        
        
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
            String sql = "Insert into dbo. " + tabela + "Values (" + strDados + ")";
            try {
                stmt.execute(sql);
                JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso");
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
    public Noticia pesquisaNoticia(String pesquisaId){
        Noticia noticiaReturn = new Noticia();
        con = connectDB();
        Statement stmt;
            
        try {
            stmt = con.createStatement();
            String sql = "SELECT * FROM NOTICIA " + " WHERE " + pesquisaId;
            JOptionPane.showMessageDialog(null, "String de Select: " + sql);
            try {
                ResultSet dados;
                dados = stmt.executeQuery(sql);
                if(dados.next() == false){
                    JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado para essa pesquisa");
                    noticiaReturn = null;
                }
                else{
                    noticiaReturn.setId(dados.getInt(1));
                    noticiaReturn.setTitulo(dados.getString(2));
                    noticiaReturn.setDescricao(dados.getString(3));
                    noticiaReturn.setDataPuclicacao(dados.getString(4));
                    noticiaReturn.setIdAdmin(dados.getInt(5));
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
                JOptionPane.showMessageDialog(null, "Alteração executada com sucesso");
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
    
}
