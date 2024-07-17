package br.gov.go.sefaz.agualegalclient.dto.solicitacao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

import org.springframework.web.multipart.MultipartFile;


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
	
	

}
