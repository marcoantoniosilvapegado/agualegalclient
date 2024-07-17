package br.gov.go.sefaz.agualegalclient.testes.mocks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import br.gov.go.sefaz.agualegalclient.dto.SituacaoEnvasadoraDTO;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.ArquivoDTO;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.CampoDTO;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.ProdutoDTO;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.SolicitacaoCredenciamentoDTO;

public class MocksTestesAPI {

	public static SituacaoEnvasadoraDTO retornaTesteSituacaoEnvasadora(String inscricao) {
		SituacaoEnvasadoraDTO dto = new SituacaoEnvasadoraDTO(inscricao, "1", "Bearer 4567");
		return dto;
	}

	public static SolicitacaoCredenciamentoDTO retornaTesteSolicitacaoCredenciamento1() {
		SolicitacaoCredenciamentoDTO dto = new SolicitacaoCredenciamentoDTO();
		dto.setInscricaoEstadual("19928719");
		dto.setTipoAgua("3");
		dto.setTokenGrafica("Bearer 34567");

		List<CampoDTO> listaCampos = new ArrayList<>();

		listaCampos.add(new CampoDTO("CNPF", "TEXTO", "04102178325"));
		listaCampos.add(new CampoDTO("NOME", "TEXTO", "MARCO ANTONIO"));
		listaCampos.add(new CampoDTO("ENDERECO", "TEXTO", "RUA 33"));

		dto.setListaCampos(listaCampos);

		/*mock lista produtos*/
		List<ProdutoDTO> listaProd = new ArrayList<>();
		ProdutoDTO prod = new ProdutoDTO();
		prod.setDescricaoMarca("Marca de água engarrafada");
		prod.setTipo("Água");
		prod.setVolume("20");
		prod.setTipoEmbalagem("Embalagem engarrafada pequena");
		byte[] imagemRotulo = loadArchiveAsBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\recipienteAgua.jpg");
		byte[] imagemRecipiente = loadArchiveAsBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotuloAgua.jpg");			
		prod.setFotoRecipienteBase(imagemRecipiente);
		prod.setImagemRotuloBase(imagemRotulo);		
		listaProd.add(prod);
		dto.setListaProdutos(listaProd);
		/*mock lista produtos*/
		
		/*mock lista campos - arquivos*/
		List<ArquivoDTO> listaArquivo = new ArrayList<>();
		ArquivoDTO arquivoDTO = new ArquivoDTO();
		arquivoDTO.setNomeCampo("Licença Sanitária");
		arquivoDTO.setTipoCampo("PDF");
		byte[] pdf = loadArchiveAsBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\teste.pdf");
		arquivoDTO.setFile(pdf);
		listaArquivo.add(arquivoDTO);
		dto.setListaArquivos(listaArquivo);
		/*mock lista campos - arquivos*/
		return dto;
	}
	
	public static byte[] loadArchiveAsBytes(String caminho) {
        Path path = Paths.get(caminho);
        try {
            return Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

	
}
