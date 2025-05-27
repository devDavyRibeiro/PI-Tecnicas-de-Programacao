/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import javax.swing.JOptionPane;

/**
 *
 * @author Trabalhos
 */
public class Noticia {
    private int id;
    private String titulo;
    private String descricao;
    private int idAdmin;
    private String dataPuclicacao;

    public Noticia(int id, String titulo, String descricao, int idAdmin, String dataPuclicacao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.idAdmin = idAdmin;
        this.dataPuclicacao = dataPuclicacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
       if(id == 0){
           JOptionPane.showMessageDialog(null, "Id passado com valor 0");  
       }
       else{
           this.id = id;
       }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.isBlank() && titulo.isEmpty()){
            JOptionPane.showMessageDialog(null, "Título Vazio"); 
        }
        else if(titulo.length() > 50){
            JOptionPane.showMessageDialog(null, "Título muito grande"); 
        }
        else{
            this.titulo = titulo;
        }
        
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.isBlank() && titulo.isEmpty()){
            JOptionPane.showMessageDialog(null, "Descrição vazia"); 
        }
        else if(descricao.length() > 50){
            JOptionPane.showMessageDialog(null, "Descrição muito grande"); 
        }
        else{
            this.descricao = descricao;
        }
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        if(idAdmin == 0){
           JOptionPane.showMessageDialog(null, "Id passado com valor 0");  
       }
       else{
           this.idAdmin = idAdmin;
       }
    }

    public String getDataPuclicacao() {
        return dataPuclicacao;
    }

    public void setDataPuclicacao(String dataPuclicacao) {
        if(dataPuclicacao.isBlank() && dataPuclicacao.isEmpty()){
            JOptionPane.showMessageDialog(null, "Descrição vazia"); 
        }
        else if(dataPuclicacao.length() != 10){
            JOptionPane.showMessageDialog(null, "Data fora do tamanho(DD/MM/YYYY)"); 
        }
        else{
            this.dataPuclicacao = dataPuclicacao;
        }
    }
    
    
}
