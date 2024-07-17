package br.gov.go.sefaz.agualegalclient.dto;

import java.io.Serializable;
import java.util.Objects;

public class ListaCamposRequestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String inscricaoEstadual;

	private String tipoAgua;

	private String tokenGrafica;

	public ListaCamposRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public String getTokenGrafica() {
		return tokenGrafica;
	}

	public void setTokenGrafica(String tokenGrafica) {
		this.tokenGrafica = tokenGrafica;
	}

	@Override
	public int hashCode() {
		return Objects.hash(inscricaoEstadual, tipoAgua, tokenGrafica);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaCamposRequestDTO other = (ListaCamposRequestDTO) obj;
		return Objects.equals(inscricaoEstadual, other.inscricaoEstadual) && Objects.equals(tipoAgua, other.tipoAgua)
				&& Objects.equals(tokenGrafica, other.tokenGrafica);
	}

	@Override
	public String toString() {
		return "ListarCamposDTO [inscricaoEstadual=" + inscricaoEstadual + ", tipoAgua=" + tipoAgua + ", tokenGrafica="
				+ tokenGrafica + "]";
	}

}
