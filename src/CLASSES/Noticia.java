/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASSES;

import static CLASSES.DataValidation.validarData;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 *
 * @author SaneaSP
 */
public class Noticia {

    private int id;
    private String titulo;
    private String descricao;
    private int idAdmin;
    private String dataPublicacao;
    private String formatoData = "dd/MM/yyyy";

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
        if (id == 0) {
            JOptionPane.showMessageDialog(null, "Id passado com valor 0");
        }
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.isBlank() && titulo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Título Vazio");
        } else if (titulo.length() > 150) {
            JOptionPane.showMessageDialog(null, "Título muito grande");
        }
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.isBlank() && titulo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Descrição vazia");
        } else if (descricao.length() > 500) {
            JOptionPane.showMessageDialog(null, "Descrição muito grande");
        }
        this.descricao = descricao;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        if (idAdmin == 0) {
            JOptionPane.showMessageDialog(null, "Id passado com valor 0");
        }
        this.idAdmin = idAdmin;
    }

    public String getDataPuclicacao() {
        return dataPublicacao;
    }

    public void setDataPuclicacao(String dataPublicacao) {
        if (dataPublicacao.isBlank() && dataPublicacao.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Descrição vazia");
        } else if (validarData(dataPublicacao, formatoData)) {
            JOptionPane.showMessageDialog(null, "O formato da data informana não"
                    + " corresponde ao padrão: " + formatoData);
        }
        this.dataPublicacao = dataPublicacao;
    }

    public String valuesInsereNoticia() {
        String dados
                = "'" + getTitulo() + "',"
                + "'" + getDescricao() + "',"
                + "'" + getDataPuclicacao() + "',"
                + "'" + getIdAdmin() + "'";
        return dados;
    }

    public String valuesAlterarNoticia() {
        String dados
                = "titulo='" + getTitulo() + "',"
                + "descricao='" + getDescricao() + "',"
                + "data='" + getDataPuclicacao() + "',"
                + "fkAdmin='" + getIdAdmin() + "'";
        return dados;
    }

}
