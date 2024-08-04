package br.gov.go.sefaz.agualegalclient.dto.solicitacao;

import java.io.Serializable;

public class LicencaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String numero;

	private byte[] imagem;

	private Integer emissorLicenca;

	private Boolean isLicencaSanitaria;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public Integer getEmissorLicenca() {
		return emissorLicenca;
	}

	public void setEmissorLicenca(Integer emissorLicenca) {
		this.emissorLicenca = emissorLicenca;
	}


}
