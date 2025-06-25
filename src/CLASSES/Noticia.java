/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASSES;

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
    private String dataPublicacao;

    public Noticia(int id, String titulo, String descricao, int idAdmin, String dataPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.idAdmin = idAdmin;
        this.dataPublicacao = dataPublicacao;
    }

    public Noticia() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            JOptionPane.showMessageDialog(null, "O campo id da noticia não pode ser menor ou igual a zero");
            return;
        } 
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty() || titulo.isBlank()) {
            JOptionPane.showMessageDialog(null, "O título é obrigatório");
            return;
        }
        if (titulo.length() > 100) {
            JOptionPane.showMessageDialog(null, "O título não deve conter mais do que 100 caracteres");
            return;
        }
        if (titulo.length() < 15) {
            JOptionPane.showMessageDialog(null,"O título deve conter pelo menos 15 caracteres");
            return;
        }
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.isBlank() || descricao.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A descrição é obrigatória");
            return;
        }

        if(descricao.length() < 30){
            JOptionPane.showMessageDialog(null, "A descrição deve ter no mínimo 30 caracteres");
            return;
        }
        
        if (descricao.length() > 500) {
            JOptionPane.showMessageDialog(null, "A descrição deve ter no máximo 500 caracteres");
            return;
        }
        this.descricao = descricao;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        if (idAdmin <= 0) {
            JOptionPane.showMessageDialog(null, "O campo id do admin não pode ser menor ou igual a zero");
            return;
        } 
        this.idAdmin = idAdmin;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPuclicacao(String dataPublicacao) {
        if (dataPublicacao == null || dataPublicacao.isBlank() || dataPublicacao.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A data de publicação é obrigatória");
            return;
        } 
        if (!dataPublicacao.matches("\\d{2}/\\d{2}/\\d{4}")) {
            JOptionPane.showMessageDialog(null, "O formato da data deve ser dd/mm/yyyy");
            return;
        } 
        
        this.dataPublicacao = dataPublicacao;
    }

    public String valuesInsereNoticia() {
        String dados
                = "'" + getTitulo() + "',"
                + "'" + getDescricao() + "',"
                + "'" + getDataPublicacao() + "',"
                + "'" + getIdAdmin() + "'";
        return dados;
    }

    public String valuesAlterarNoticia() {
        String dados
                = "titulo='" + getTitulo() + "',"
                + "descricao='" + getDescricao() + "',"
                + "data='" + getDataPublicacao() + "',"
                + "fkAdmin='" + getIdAdmin() + "'";
        return dados;
    }

}
