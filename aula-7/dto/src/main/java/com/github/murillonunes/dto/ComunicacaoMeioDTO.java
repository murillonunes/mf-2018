package com.github.murillonunes.dto;

/**
 * Created by murillonunes.
 */
public class ComunicacaoMeioDTO {

    private int codigo;
    private String descricao;
    private String alternativo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAlternativo() {
        return alternativo;
    }

    public void setAlternativo(String alternativo) {
        this.alternativo = alternativo;
    }
}
