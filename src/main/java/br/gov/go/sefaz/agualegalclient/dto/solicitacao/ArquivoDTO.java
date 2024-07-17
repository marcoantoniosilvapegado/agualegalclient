package br.gov.go.sefaz.agualegalclient.dto.solicitacao;

import java.io.Serializable;

public class ArquivoDTO implements Serializable {

	/**
	 * \\\
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nomeCampo;

	private String tipoCampo;

	private byte[] file;

	public ArquivoDTO() {
		super();
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

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

}
