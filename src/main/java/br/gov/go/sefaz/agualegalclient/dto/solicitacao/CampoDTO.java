package br.gov.go.sefaz.agualegalclient.dto.solicitacao;

import java.io.Serializable;

public class CampoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nomeCampo;

	private String tipoCampo;

	private String conteudoCampo;

	public CampoDTO() {
		super();		
	}

	public CampoDTO(String nomeCampo, String tipoCampo, String conteudoCampo) {
		super();
		this.nomeCampo = nomeCampo;
		this.tipoCampo = tipoCampo;
		this.conteudoCampo = conteudoCampo;
	}

	public String getNomeCampo() {
		return nomeCampo;
	}

	public void setNomeCampo(String nomeCampo) {
		this.nomeCampo = nomeCampo;
	}

	public String getTipoCampo() {
		return tipoCampo;
	}

	public void setTipoCampo(String tipoCampo) {
		this.tipoCampo = tipoCampo;
	}

	public String getConteudoCampo() {
		return conteudoCampo;
	}

	public void setConteudoCampo(String conteudoCampo) {
		this.conteudoCampo = conteudoCampo;
	}

}
