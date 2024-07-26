package br.gov.go.sefaz.agualegalclient.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiError {
	
	  @JsonProperty("descricao")
	    private String descricao;
	    @JsonProperty("codigo")
	    private int codigo;
	    @JsonProperty("resultado")
	    private boolean resultado;

	    // Getters and Setters
	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	    public int getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public boolean isResultado() {
	        return resultado;
	    }

	    public void setResultado(boolean resultado) {
	        this.resultado = resultado;
	    }
}
