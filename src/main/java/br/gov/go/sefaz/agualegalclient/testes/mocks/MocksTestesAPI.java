package br.gov.go.sefaz.agualegalclient.testes.mocks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.ArquivoDTO;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.CampoDTO;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.ProdutoDTO;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.SolicitacaoCredenciamentoDTO;

public class MocksTestesAPI {

	public static byte[] carregaBytes(String caminho) {
		Path path = Paths.get(caminho);// ("C:\\Users\\marco.pegado\\Desktop\\arqs\\teste.pdf");
		try {
			return Files.readAllBytes(path);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static SolicitacaoCredenciamentoDTO solicitacaoCredenciamento1() {

		SolicitacaoCredenciamentoDTO dto = new SolicitacaoCredenciamentoDTO();

		dto.setCnpjGrafica("35113067000117");
		dto.setNomeGrafica("GRAFICA E EDITORA SAO LUIS LTDA");
		dto.setInscricaoEstadual("1992791044");
		dto.setTipoAgua("2");
		dto.setTokenGrafica("Bearer 4567");

		List<CampoDTO> listaCampos = new ArrayList<>();
		listaCampos.add(new CampoDTO("CNPJ", "CNPJ", "38545378000143"));
		listaCampos.add(new CampoDTO("Nome Fantasia", "Nome Fantasia", "AGUA 6 ESTRELAS"));
		listaCampos.add(new CampoDTO("Razão Social", "Razão Social", "EMPRESA ENVASADORA DE ÁGUAS 6 ESTRELAS"));
		listaCampos.add(new CampoDTO("Inscrição Estadual", "Inscrição Estadual", "1992791044"));
		listaCampos.add(new CampoDTO("Endereço do Envasador", "Endereço do Envasador",
				"Rua das águas, N. 34, bairro águas de lindoia"));
		listaCampos.add(new CampoDTO("Endereço do local do envase", "Endereço do local do envase",
				"Rua do Envasamento, número 45, bairro Águas claras"));
		listaCampos.add(new CampoDTO("Coordenadas geográficas do local do envase",
				"Coordenadas geográficas do local do envase", "-2.5586510457993286, -44.18226982781076"));

		listaCampos.add(
				new CampoDTO("RG do responsável pelo Envasador", "RG do responsável pelo Envasador", "0321529920064"));
		listaCampos.add(
				new CampoDTO("CPF do responsável pelo Envasador", "CPF do responsável pelo Envasador", "04102178325"));
		listaCampos.add(new CampoDTO("E-mail do responsável pelo Envasador", "E-mail do responsável pelo Envasador",
				"marcoantonio@gmail.com"));
		listaCampos.add(new CampoDTO("Nome completo do responsável pelo Envasador",
				"Nome completo do responsável pelo Envasador", "Marco Antonio Silva"));
		listaCampos.add(new CampoDTO("Telefones de contato do responsável pelo Envasador",
				"Telefones de contato do responsável pelo Envasador", "98988566805"));

		dto.setListaCampos(listaCampos);

		List<ArquivoDTO> listaArquivo = new ArrayList<>();
		listaArquivo.add(new ArquivoDTO("Imagem da licença sanitária", "Imagem da licença sanitária",
				carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licenca.jpg")));
		dto.setListaArquivos(listaArquivo);

		List<ProdutoDTO> listaProdutos = new ArrayList<>();
		ProdutoDTO produtoDTO = new ProdutoDTO();
		produtoDTO.setVolume("20");
		produtoDTO.setTipo("Água mineral");
		produtoDTO.setTipoEmbalagem("Galão");
		produtoDTO.setDescricaoMarca("Marca águas de lindoia");
		produtoDTO.setFotoRecipienteBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao20.jpg"));
		produtoDTO.setImagemRotuloBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo20.jpg"));

		ProdutoDTO produtoDTO2 = new ProdutoDTO();
		produtoDTO2.setVolume("40");
		produtoDTO2.setTipo("Água de sais minerais");
		produtoDTO2.setTipoEmbalagem("Garrafa");
		produtoDTO2.setDescricaoMarca("Marca águas de sal");
		produtoDTO2.setFotoRecipienteBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao40.jpg"));
		produtoDTO2.setImagemRotuloBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo40.jpg"));

		ProdutoDTO produtoDTO3 = new ProdutoDTO();
		produtoDTO3.setVolume("10");
		produtoDTO3.setTipo("Água Gaseificada");
		produtoDTO3.setTipoEmbalagem("Garrafa média");
		produtoDTO3.setDescricaoMarca("Águas Tônicas");
		produtoDTO3.setFotoRecipienteBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao10.jpg"));
		produtoDTO3.setImagemRotuloBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo10.jpg"));

		listaProdutos.add(produtoDTO);
		listaProdutos.add(produtoDTO2);
		listaProdutos.add(produtoDTO3);

		dto.setListaProdutos(listaProdutos);

		return dto;

	}

	public static SolicitacaoCredenciamentoDTO solicitacaoCredenciamentoComErrosProdutos() {

		SolicitacaoCredenciamentoDTO dto = new SolicitacaoCredenciamentoDTO();

		dto.setCnpjGrafica("35113067000117");
		dto.setNomeGrafica("GRAFICA E EDITORA SAO LUIS LTDA");
		dto.setInscricaoEstadual("1992791044");
		dto.setTipoAgua("2");
		dto.setTokenGrafica("Bearer 4567");

		List<CampoDTO> listaCampos = new ArrayList<>();
		listaCampos.add(new CampoDTO("CNPJ", "CNPJ", "38545378000143"));
		listaCampos.add(new CampoDTO("Nome Fantasia", "Nome Fantasia", "AGUA 6 ESTRELAS"));
		listaCampos.add(new CampoDTO("Razão Social", "Razão Social", "EMPRESA ENVASADORA DE ÁGUAS 6 ESTRELAS"));
		listaCampos.add(new CampoDTO("Inscrição Estadual", "Inscrição Estadual", "1992791044"));
		listaCampos.add(new CampoDTO("Endereço do Envasador", "Endereço do Envasador",
				"Rua das águas, N. 34, bairro águas de lindoia"));
		listaCampos.add(new CampoDTO("Endereço do local do envase", "Endereço do local do envase",
				"Rua do Envasamento, número 45, bairro Águas claras"));
		listaCampos.add(new CampoDTO("Coordenadas geográficas do local do envase",
				"Coordenadas geográficas do local do envase", "-2.5586510457993286, -44.18226982781076"));

		listaCampos.add(
				new CampoDTO("RG do responsável pelo Envasador", "RG do responsável pelo Envasador", "0321529920064"));
		listaCampos.add(
				new CampoDTO("CPF do responsável pelo Envasador", "CPF do responsável pelo Envasador", "04102178325"));
		listaCampos.add(new CampoDTO("E-mail do responsável pelo Envasador", "E-mail do responsável pelo Envasador",
				"marcoantonio@gmail.com"));
		listaCampos.add(new CampoDTO("Nome completo do responsável pelo Envasador",
				"Nome completo do responsável pelo Envasador", "Marco Antonio Silva"));
		listaCampos.add(new CampoDTO("Telefones de contato do responsável pelo Envasador",
				"Telefones de contato do responsável pelo Envasador", "98988566805"));

		dto.setListaCampos(listaCampos);

		List<ArquivoDTO> listaArquivo = new ArrayList<>();
		listaArquivo.add(new ArquivoDTO("Imagem da licença sanitária", "Imagem da licença sanitária",
				carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licenca.jpg")));
		dto.setListaArquivos(listaArquivo);

		List<ProdutoDTO> listaProdutos = new ArrayList<>();
		ProdutoDTO produtoDTO = new ProdutoDTO();
		produtoDTO.setVolume("20");
		produtoDTO.setTipo("Água mineral");
		produtoDTO.setTipoEmbalagem("Galão");
		produtoDTO.setDescricaoMarca("Marca águas de lindoia");
		produtoDTO.setFotoRecipienteBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao20.jpg"));
		// produtoDTO.setImagemRotuloBase(null);

		ProdutoDTO produtoDTO2 = new ProdutoDTO();
		produtoDTO2.setVolume("40");
		produtoDTO2.setTipo("Água de sais minerais");
		// produtoDTO2.setTipoEmbalagem("Garrafa");
		produtoDTO2.setDescricaoMarca("Marca águas de sal");
		produtoDTO2.setFotoRecipienteBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\teste.pdf"));
		produtoDTO2.setImagemRotuloBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo40.jpg"));

		ProdutoDTO produtoDTO3 = new ProdutoDTO();
		produtoDTO3.setVolume("10");
		produtoDTO3.setTipo("Água Gaseificada");
		produtoDTO3.setTipoEmbalagem("Garrafa média");
		produtoDTO3.setDescricaoMarca("Águas Tônicas");
		produtoDTO3.setFotoRecipienteBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao10.jpg"));
		produtoDTO3.setImagemRotuloBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\tamanho1.png"));

		listaProdutos.add(produtoDTO);
		listaProdutos.add(produtoDTO2);
		listaProdutos.add(produtoDTO3);

		dto.setListaProdutos(listaProdutos);

		return dto;

	}

	public static SolicitacaoCredenciamentoDTO mockSolicitacaoSemErrosValidacao() {

		SolicitacaoCredenciamentoDTO dto = new SolicitacaoCredenciamentoDTO();

		dto.setCnpjGrafica("35113067000117");
		dto.setNomeGrafica("GRAFICA E EDITORA SAO LUIS LTDA");
		dto.setInscricaoEstadual("1992791044");
		dto.setTipoAgua("2");
		dto.setTokenGrafica("Bearer 4567");

		/* Campos texto */
		List<CampoDTO> listaCampos = new ArrayList<>();
		listaCampos.add(new CampoDTO("CNPJ", "CNPJ", "38545378000143"));
		listaCampos.add(new CampoDTO("Razão Social", "Razão Social", "Empresa de Envasamento Diamantina LTDA"));
		listaCampos.add(new CampoDTO("Nome Fantasia", "Nome Fantasia", "Águas de Diamente"));
		listaCampos.add(new CampoDTO("Inscrição Estadual", "Inscrição Estadual", "38817923"));
		listaCampos.add(new CampoDTO("Endereço do Envasador", "Endereço do Envasador",
				"Rua da água, número 343, Centro - PINHEIRO"));
		listaCampos.add(new CampoDTO("Endereço do local do envase", "Endereço do local do envase",
				"Rua Mineral, 444, Nova Rosa - PINHEIRO"));
		listaCampos.add(new CampoDTO("E-mail do responsável pelo Envasador", "E-mail do responsável pelo Envasador",
				"marcoantoniosilvapegado@gmail.com"));
		listaCampos.add(
				new CampoDTO("RG do responsável pelo Envasador", "RG do responsável pelo Envasador", "0321529920064"));
		listaCampos.add(new CampoDTO("Nome completo do responsável pelo Envasador",
				"Nome completo do responsável pelo Envasador", "Marco Antonio Silva Pegado"));
		listaCampos.add(new CampoDTO("Telefones de contato do responsável pelo Envasador",
				"Telefones de contato do responsável pelo Envasador", "98966566805"));
		listaCampos.add(new CampoDTO("Coordenadas geográficas do local do envase",
				"Coordenadas geográficas do local do envase", "-2.582555999374191, -44.1607847753762"));
		listaCampos.add(
				new CampoDTO("CPF do responsável pelo Envasador", "CPF do responsável pelo Envasador", "04102178325"));
		listaCampos.add(new CampoDTO("Emissor da licença Sanitária", "Emissor da licença Sanitária", "Anvisa"));
		listaCampos.add(new CampoDTO("Emissor da Licença da Agência Nacional de Mineração",
				"Emissor da Licença da Agência Nacional de Mineração", "DNPM"));
		listaCampos.add(new CampoDTO("Número identificador da Licença Sanitária",
				"Número identificador da Licença Sanitária", "12345678"));
		listaCampos.add(new CampoDTO("Número identificador da Licença da Agência Nacional de Mineração",
				"Número identificador da Licença da Agência Nacional de Mineração", "29188281"));
		listaCampos.add(new CampoDTO("Data Fundação", "Data Fundação", "07/06/1992"));

		dto.setListaCampos(listaCampos);

		/* Campos arquivo */
		List<ArquivoDTO> listaArquivo = new ArrayList<>();
		listaArquivo.add(new ArquivoDTO("CND", "Certidão Negativa de débitos",
				carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\cnd.pdf")));

		listaArquivo.add(new ArquivoDTO("Nada Consta", "Nada Consta",
				carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\nadaconsta.jpg")));

		listaArquivo.add(new ArquivoDTO("Imagem da licença sanitária", "Imagem da licença sanitária",
				carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licenca.jpg")));

		listaArquivo.add(new ArquivoDTO("Imagem da licença da Agência Nacional de Mineração",
				"Imagem da licença da Agência Nacional de Mineração",
				carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licenca.jpg")));

		dto.setListaArquivos(listaArquivo);

		/* Lista produtos */
		List<ProdutoDTO> listaProdutos = new ArrayList<>();
		ProdutoDTO produtoDTO = new ProdutoDTO();
		produtoDTO.setVolume("20");
		produtoDTO.setTipo("Água mineral");
		produtoDTO.setTipoEmbalagem("Galão");
		produtoDTO.setDescricaoMarca("Marca águas de lindoia");
		produtoDTO.setFotoRecipienteBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao20.jpg"));
		produtoDTO.setImagemRotuloBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo20.jpg"));

		ProdutoDTO produtoDTO2 = new ProdutoDTO();
		produtoDTO2.setVolume("40");
		produtoDTO2.setTipo("Água de sais minerais");
		produtoDTO2.setTipoEmbalagem("Garrafa");
		produtoDTO2.setDescricaoMarca("Marca águas de sal");
		produtoDTO2.setFotoRecipienteBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao40.jpg"));
		produtoDTO2.setImagemRotuloBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo40.jpg"));

		ProdutoDTO produtoDTO3 = new ProdutoDTO();
		produtoDTO3.setVolume("10");
		produtoDTO3.setTipo("Água Gaseificada");
		produtoDTO3.setTipoEmbalagem("Garrafa média");
		produtoDTO3.setDescricaoMarca("Águas Tônicas");
		produtoDTO3.setFotoRecipienteBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao10.jpg"));
		produtoDTO3.setImagemRotuloBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo10.jpg"));

		listaProdutos.add(produtoDTO);
		listaProdutos.add(produtoDTO2);
		listaProdutos.add(produtoDTO3);

		dto.setListaProdutos(listaProdutos);

		return dto;
	}
	
	public static SolicitacaoCredenciamentoDTO mockSolicitacaoFaltandoCampos() {

		SolicitacaoCredenciamentoDTO dto = new SolicitacaoCredenciamentoDTO();

		dto.setCnpjGrafica("35113067000117");
		dto.setNomeGrafica("GRAFICA E EDITORA SAO LUIS LTDA");
		dto.setInscricaoEstadual("1992791044");
		dto.setTipoAgua("2");
		dto.setTokenGrafica("Bearer 4567");

		/* Campos texto */
		List<CampoDTO> listaCampos = new ArrayList<>();
		listaCampos.add(new CampoDTO("CNPJ", "CNPJ", "38545378000143"));
		listaCampos.add(new CampoDTO("Razão Social", "Razão Social", "Empresa de Envasamento Diamantina LTDA"));
		listaCampos.add(new CampoDTO("Nome Fantasia", "Nome Fantasia", "Águas de Diamente"));
		listaCampos.add(new CampoDTO("Inscrição Estadual", "Inscrição Estadual", "38817923"));
		listaCampos.add(new CampoDTO("Endereço do Envasador", "Endereço do Envasador",
				"Rua da água, número 343, Centro - PINHEIRO"));
		listaCampos.add(new CampoDTO("Endereço do local do envase", "Endereço do local do envase",
				"Rua Mineral, 444, Nova Rosa - PINHEIRO"));
		listaCampos.add(new CampoDTO("E-mail do responsável pelo Envasador", "E-mail do responsável pelo Envasador",
				"marcoantoniosilvapegado@gmail.com"));
		listaCampos.add(
				new CampoDTO("RG do responsável pelo Envasador", "RG do responsável pelo Envasador", "0321529920064"));
		listaCampos.add(new CampoDTO("Nome completo do responsável pelo Envasador",
				"Nome completo do responsável pelo Envasador", "Marco Antonio Silva Pegado"));
		listaCampos.add(new CampoDTO("Telefones de contato do responsável pelo Envasador",
				"Telefones de contato do responsável pelo Envasador", "98966566805"));
		listaCampos.add(new CampoDTO("Coordenadas geográficas do local do envase",
				"Coordenadas geográficas do local do envase", "-2.582555999374191, -44.1607847753762"));
		listaCampos.add(
				new CampoDTO("CPF do responsável pelo Envasador", "CPF do responsável pelo Envasador", "04102178325"));
		listaCampos.add(new CampoDTO("Emissor da licença Sanitária", "Emissor da licença Sanitária", "Anvisa"));
		listaCampos.add(new CampoDTO("Emissor da Licença da Agência Nacional de Mineração",
				"Emissor da Licença da Agência Nacional de Mineração", "DNPM"));
		listaCampos.add(new CampoDTO("Número identificador da Licença Sanitária",
				"Número identificador da Licença Sanitária", "12345678"));
		listaCampos.add(new CampoDTO("Número identificador da Licença da Agência Nacional de Mineração",
				"Número identificador da Licença da Agência Nacional de Mineração", "29188281"));
		listaCampos.add(new CampoDTO("Data Fundação", "Data Fundação", "07/06/1992"));

		dto.setListaCampos(listaCampos);

		/* Campos arquivo */
		List<ArquivoDTO> listaArquivo = new ArrayList<>();
		listaArquivo.add(new ArquivoDTO("CND", "Certidão Negativa de débitos",
				carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\cnd.pdf")
				));
		
		listaArquivo.add(new ArquivoDTO("Nada Consta", "Nada Consta",
				carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\tamanho1.png")
				));

		listaArquivo.add(new ArquivoDTO("Imagem da licença sanitária", "Imagem da licença sanitária",
				carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licenca.jpg")
				));

		listaArquivo.add(new ArquivoDTO("Imagem da licença da Agência Nacional de Mineração",
				"Imagem da licença da Agência Nacional de Mineração",
				carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\tamanho1.png")
				));

		dto.setListaArquivos(listaArquivo);

		/* Lista produtos */
		List<ProdutoDTO> listaProdutos = new ArrayList<>();
		ProdutoDTO produtoDTO = new ProdutoDTO();
		produtoDTO.setVolume("20");
		produtoDTO.setTipo("Água mineral");
		produtoDTO.setTipoEmbalagem("Galão");
		produtoDTO.setDescricaoMarca("Marca águas de lindoia");
		produtoDTO.setFotoRecipienteBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao20.jpg"));
		produtoDTO.setImagemRotuloBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo20.jpg"));

		ProdutoDTO produtoDTO2 = new ProdutoDTO();
		produtoDTO2.setVolume("40");
		produtoDTO2.setTipo("Água de sais minerais");
		produtoDTO2.setTipoEmbalagem("Garrafa");
		produtoDTO2.setDescricaoMarca("Marca águas de sal");
		produtoDTO2.setFotoRecipienteBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao40.jpg"));
		produtoDTO2.setImagemRotuloBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo40.jpg"));

		ProdutoDTO produtoDTO3 = new ProdutoDTO();
		produtoDTO3.setVolume("10");
		produtoDTO3.setTipo("Água Gaseificada");
		produtoDTO3.setTipoEmbalagem("Garrafa média");
		produtoDTO3.setDescricaoMarca("Águas Tônicas");
		produtoDTO3.setFotoRecipienteBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao10.jpg"));
		produtoDTO3.setImagemRotuloBase(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo10.jpg"));

		listaProdutos.add(produtoDTO);
		listaProdutos.add(produtoDTO2);
		listaProdutos.add(produtoDTO3);

		dto.setListaProdutos(listaProdutos);

		return dto;
	}

}
