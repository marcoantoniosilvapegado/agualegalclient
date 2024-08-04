package br.gov.go.sefaz.agualegalclient.dto.solicitacao;

import java.io.Serializable;
import java.util.Objects;

public class CadastroDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cnpj;

	private String razaoSocial;

	private String nomeFantasia;

	private String inscricaoEstadual;

	public CadastroDTO() {
		super();
	}

	public CadastroDTO(String cnpj, String razaoSocial, String nomeFantasia, String inscricaoEstadual) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	

}
