package br.gov.go.sefaz.agualegalclient.dto.solicitacao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class ArquivoDTO implements Serializable {

	/**
	 * \\\
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nomeCampo;

	private String tipoCampo;

	private byte[] file;

	public ArquivoDTO(String nomeCampo, String tipoCampo, byte[] file) {
		super();
		this.nomeCampo = nomeCampo;
		this.tipoCampo = tipoCampo;
		this.file = file;
	}

	public ArquivoDTO() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(file);
		result = prime * result + Objects.hash(nomeCampo, tipoCampo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArquivoDTO other = (ArquivoDTO) obj;
		return Arrays.equals(file, other.file) && Objects.equals(nomeCampo, other.nomeCampo)
				&& Objects.equals(tipoCampo, other.tipoCampo);
	}

	@Override
	public String toString() {
		return "ArquivoDTO [nomeCampo=" + nomeCampo + ", tipoCampo=" + tipoCampo + ", file=" + Arrays.toString(file)
				+ "]";
	}

}
