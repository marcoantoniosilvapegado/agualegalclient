package br.gov.go.sefaz.agualegalclient.dto.solicitacao;

import java.io.Serializable;
import java.util.Objects;


public class ResponsavelDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nomeResponsavel;

	private String emailResponsavel;

	private String rgResponsavel;

	private String cpfResponsavel;

	private String telefoneResponsavel;

	public ResponsavelDTO() {
		super();
	}

	public ResponsavelDTO(String nomeResponsavel, String emailResponsavel, String rgResponsavel, String cpfResponsavel,
			String telefoneResponsavel) {
		super();
		this.nomeResponsavel = nomeResponsavel;
		this.emailResponsavel = emailResponsavel;
		this.rgResponsavel = rgResponsavel;
		this.cpfResponsavel = cpfResponsavel;
		this.telefoneResponsavel = telefoneResponsavel;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getEmailResponsavel() {
		return emailResponsavel;
	}

	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}

	public String getRgResponsavel() {
		return rgResponsavel;
	}

	public void setRgResponsavel(String rgResponsavel) {
		this.rgResponsavel = rgResponsavel;
	}

	public String getCpfResponsavel() {
		return cpfResponsavel;
	}

	public void setCpfResponsavel(String cpfResponsavel) {
		this.cpfResponsavel = cpfResponsavel;
	}

	public String getTelefoneResponsavel() {
		return telefoneResponsavel;
	}

	public void setTelefoneResponsavel(String telefoneResponsavel) {
		this.telefoneResponsavel = telefoneResponsavel;
	}


}
