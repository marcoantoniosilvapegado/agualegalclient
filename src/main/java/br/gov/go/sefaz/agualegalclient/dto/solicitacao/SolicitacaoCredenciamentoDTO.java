package br.gov.go.sefaz.agualegalclient.dto.solicitacao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SolicitacaoCredenciamentoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String tokenGrafica;

	private String inscricaoEstadual;

	private String tipoAgua;

	private List<CampoDTO> listaCampos = new ArrayList<CampoDTO>();

	private List<ArquivoDTO> listaArquivos = new ArrayList<ArquivoDTO>();

	private List<ProdutoDTO> listaProdutos = new ArrayList<ProdutoDTO>();

	private String nomeGrafica;

	private String cnpjGrafica;

	public SolicitacaoCredenciamentoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getTokenGrafica() {
		return tokenGrafica;
	}

	public void setTokenGrafica(String tokenGrafica) {
		this.tokenGrafica = tokenGrafica;
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

	public List<CampoDTO> getListaCampos() {
		return listaCampos;
	}

	public void setListaCampos(List<CampoDTO> listaCampos) {
		this.listaCampos = listaCampos;
	}

	public List<ArquivoDTO> getListaArquivos() {
		return listaArquivos;
	}

	public void setListaArquivos(List<ArquivoDTO> listaArquivos) {
		this.listaArquivos = listaArquivos;
	}

	public List<ProdutoDTO> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<ProdutoDTO> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public String getNomeGrafica() {
		return nomeGrafica;
	}

	public void setNomeGrafica(String nomeGrafica) {
		this.nomeGrafica = nomeGrafica;
	}

	public String getCnpjGrafica() {
		return cnpjGrafica;
	}

	public void setCnpjGrafica(String cnpjGrafica) {
		this.cnpjGrafica = cnpjGrafica;
	}

	@Override
	public String toString() {
		return "SolicitacaoCredenciamentoDTO [tokenGrafica=" + tokenGrafica + ", inscricaoEstadual=" + inscricaoEstadual
				+ ", tipoAgua=" + tipoAgua + ", listaCampos=" + listaCampos + ", listaArquivos=" + listaArquivos
				+ ", listaProdutos=" + listaProdutos + ", nomeGrafica=" + nomeGrafica + ", cnpjGrafica=" + cnpjGrafica
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpjGrafica, inscricaoEstadual, listaArquivos, listaCampos, listaProdutos, nomeGrafica,
				tipoAgua, tokenGrafica);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SolicitacaoCredenciamentoDTO other = (SolicitacaoCredenciamentoDTO) obj;
		return Objects.equals(cnpjGrafica, other.cnpjGrafica)
				&& Objects.equals(inscricaoEstadual, other.inscricaoEstadual)
				&& Objects.equals(listaArquivos, other.listaArquivos) && Objects.equals(listaCampos, other.listaCampos)
				&& Objects.equals(listaProdutos, other.listaProdutos) && Objects.equals(nomeGrafica, other.nomeGrafica)
				&& Objects.equals(tipoAgua, other.tipoAgua) && Objects.equals(tokenGrafica, other.tokenGrafica);
	}

}
