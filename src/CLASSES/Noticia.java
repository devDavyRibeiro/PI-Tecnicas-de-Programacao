/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASSES;

import UTEIS.DataValidation;
import UTEIS.ValidationEnum;
import UTEIS.ValidationException;

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
    private final String dataFormato = "dd/MM/yyyy";

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

    public void setId(int id) throws ValidationException{
        if (id <= 0) 
            throw new ValidationException("O campo id da noticia não pode ser menor ou igual a zero", ValidationEnum.ID_NOTICIA_ERROR);
        
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws ValidationException {
        ValidationEnum validationType = ValidationEnum.TITULO_ERROR;
        if (titulo == null || titulo.isEmpty() || titulo.isBlank()) 
            throw new ValidationException("O título é obrigatório",validationType);
        
        titulo = titulo.trim();
        
        if (titulo.length() < 15) 
            throw new ValidationException("O título deve conter pelo menos 15 caracteres",validationType);
        
        if (titulo.length() > 100) 
            throw new ValidationException("O título não deve conter mais do que 100 caracteres", validationType);
        
        
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws ValidationException{
        ValidationEnum validationType = ValidationEnum.DESCRICAO_ERROR;
        
        if (descricao == null || descricao.isBlank() || descricao.isEmpty()) 
            throw new ValidationException("A descrição é obrigatória", validationType);

        descricao = descricao.trim();
         
        if(descricao.length() < 30)
            throw new ValidationException("A descrição deve ter no mínimo 30 caracteres", validationType);
        
        if (descricao.length() > 500) 
            throw new ValidationException("A descrição deve ter no máximo 500 caracteres", validationType);
        
        this.descricao = descricao;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) throws ValidationException{
        if (idAdmin <= 0) 
            throw new ValidationException("O campo id do admin não pode ser menor ou igual a zero", ValidationEnum.ID_ADMIN_ERROR);
        this.idAdmin = idAdmin;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPuclicacao(String dataPublicacao) throws ValidationException{
        ValidationEnum validationType = ValidationEnum.DATA_PUBLICACAO_ERROR;
        if (dataPublicacao == null || dataPublicacao.isBlank() || dataPublicacao.isEmpty()) 
             throw new ValidationException("A data de publicação é obrigatória", validationType);
        
        dataPublicacao = dataPublicacao.trim();
        
        if (!dataPublicacao.matches("\\d{2}/\\d{2}/\\d{4}")) 
            throw new ValidationException("O formato da data deve ser dd/mm/yyyy", validationType);
        
        //Verifica se é uma data válida 
        if(!DataValidation.validarData(dataPublicacao,dataFormato))
             throw new ValidationException("A data inserida é inválida", validationType);
        
        //Verifica se está no intervalo especificado (min 5 anos atrás e max ano atual)
        if(!DataValidation.validarIntervalo(dataPublicacao, dataFormato))
            throw new ValidationException("A data de publicação deve ser no ano atual ou nos 5 anos anteriores", validationType);        
        
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
                + "descricao='" + getDescricao() + "'";
        return dados;
    }

}
