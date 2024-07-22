package br.gov.go.sefaz.agualegalclient.dto.solicitacao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class ProdutoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String descricaoMarca;

	private String tipo;

	private String volume;

	private String tipoEmbalagem;

	private byte[] imagemRotuloBase;

	private byte[] fotoRecipienteBase;

	public ProdutoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDescricaoMarca() {
		return descricaoMarca;
	}

	public void setDescricaoMarca(String descricaoMarca) {
		this.descricaoMarca = descricaoMarca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getTipoEmbalagem() {
		return tipoEmbalagem;
	}

	public void setTipoEmbalagem(String tipoEmbalagem) {
		this.tipoEmbalagem = tipoEmbalagem;
	}

	public byte[] getImagemRotuloBase() {
		return imagemRotuloBase;
	}

	public void setImagemRotuloBase(byte[] imagemRotuloBase) {
		this.imagemRotuloBase = imagemRotuloBase;
	}

	public byte[] getFotoRecipienteBase() {
		return fotoRecipienteBase;
	}

	public void setFotoRecipienteBase(byte[] fotoRecipienteBase) {
		this.fotoRecipienteBase = fotoRecipienteBase;
	}



	@Override
	public String toString() {
		return "ProdutoDTO [descricaoMarca=" + descricaoMarca + ", tipo=" + tipo + ", volume=" + volume
				+ ", tipoEmbalagem=" + tipoEmbalagem + ", imagemRotuloBase=" + Arrays.toString(imagemRotuloBase)
				+ ", fotoRecipienteBase=" + Arrays.toString(fotoRecipienteBase) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(fotoRecipienteBase);
		result = prime * result + Arrays.hashCode(imagemRotuloBase);
		result = prime * result + Objects.hash(descricaoMarca, tipo, tipoEmbalagem, volume);
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
		ProdutoDTO other = (ProdutoDTO) obj;
		return Objects.equals(descricaoMarca, other.descricaoMarca)
				&& Arrays.equals(fotoRecipienteBase, other.fotoRecipienteBase)
				&& Arrays.equals(imagemRotuloBase, other.imagemRotuloBase) && Objects.equals(tipo, other.tipo)
				&& Objects.equals(tipoEmbalagem, other.tipoEmbalagem) && Objects.equals(volume, other.volume);
	}

}
