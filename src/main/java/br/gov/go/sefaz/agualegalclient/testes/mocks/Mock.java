package br.gov.go.sefaz.agualegalclient.testes.mocks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.gov.go.sefaz.agualegalclient.dto.solicitacao.DadosSolicitacaoDTO;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.LicencaDTO;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.ProdutoDTO;

public class Mock {

	public static DadosSolicitacaoDTO mock1() {

		DadosSolicitacaoDTO dto = new DadosSolicitacaoDTO();

		dto.getCadastro().setCnpj("55377488000162");
		dto.getCadastro().setRazaoSocial("ASB BEBIDAS E ALIMENTOS LTDA");
		dto.getCadastro().setNomeFantasia("ASB AGUAS");
		dto.getCadastro().setInscricaoEstadual("122437111");

		dto.setTipoAgua("3");

		dto.setCnpjGrafica("06989552000150");

		dto.setObservacao(
				"Solicitação de credenciamento de empresa envasadora para fins de atuação no SUL do maranhão");

		List<ProdutoDTO> listaProdutos = new ArrayList<>();
		ProdutoDTO produtoDTO = new ProdutoDTO();
		produtoDTO.setVolume(20);
		produtoDTO.setTipoProduto(1);
		produtoDTO.setTipoEmbalagem(1);
		produtoDTO.setDescricaoMarca("Água mineral estrela");
		produtoDTO.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao20.jpg"));
		produtoDTO.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo20.jpg"));

		ProdutoDTO produtoDTO2 = new ProdutoDTO();
		produtoDTO2.setVolume(40);
		produtoDTO2.setTipoProduto(2);
		produtoDTO2.setTipoEmbalagem(2);
		produtoDTO2.setDescricaoMarca("Água de sais minerais estrela");
		produtoDTO2.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao40.jpg"));
		produtoDTO2.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo40.jpg"));

		ProdutoDTO produtoDTO3 = new ProdutoDTO();
		produtoDTO3.setVolume(10);
		produtoDTO3.setTipoProduto(1);
		produtoDTO3.setTipoEmbalagem(1);
		produtoDTO3.setDescricaoMarca("Águas Gaseificada estrela");
		produtoDTO3.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao10.jpg"));
		produtoDTO3.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo10.jpg"));

		listaProdutos.add(produtoDTO);
		listaProdutos.add(produtoDTO2);
		listaProdutos.add(produtoDTO3);

		dto.setListaProdutos(listaProdutos);

		dto.getResponsavel().setCpfResponsavel("27345589048");
		dto.getResponsavel().setRgResponsavel("032152992006");
		dto.getResponsavel().setTelefoneResponsavel("98988566805");
		dto.getResponsavel().setNomeResponsavel("Marco Antonio Silva");
		dto.getResponsavel().setEmailResponsavel("marcoantoniosilvapegado@gmail.com");

		LicencaDTO licencaSanitaria = new LicencaDTO();
		licencaSanitaria.setEmissorLicenca(1);
		licencaSanitaria.setNumero("123456");
		licencaSanitaria.setImagem(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licencavigilancia.jpg"));

		LicencaDTO licencaAmbiental = new LicencaDTO();
		licencaAmbiental.setNumero("23456");
		licencaAmbiental.setImagem(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licencamineral.jpg"));

		dto.setLicencaVigilancia(licencaSanitaria);
		dto.setLicencaMineracao(licencaAmbiental);

		return dto;

	}

	public static DadosSolicitacaoDTO mock2() {

		DadosSolicitacaoDTO dto = new DadosSolicitacaoDTO();

		dto.getCadastro().setCnpj("55377488000162");
		dto.getCadastro().setRazaoSocial("ASB BEBIDAS E ALIMENTOS LTDA");
		dto.getCadastro().setNomeFantasia("ASB AGUAS");
		dto.getCadastro().setInscricaoEstadual("122437111");

		dto.setTipoAgua("3");

		dto.setCnpjGrafica("06989552000150");

		dto.setObservacao(
				"Solicitação de credenciamento de empresa envasadora para fins de atuação no SUL do maranhão");

		List<ProdutoDTO> listaProdutos = new ArrayList<>();
		ProdutoDTO produtoDTO = new ProdutoDTO();
		produtoDTO.setVolume(20);
		produtoDTO.setTipoProduto(1);
		produtoDTO.setTipoEmbalagem(3);
		produtoDTO.setDescricaoMarca("Água mineral estrela");
		produtoDTO.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao20.jpg"));
		produtoDTO.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo20.jpg"));

		ProdutoDTO produtoDTO2 = new ProdutoDTO();
		produtoDTO2.setVolume(40);
		produtoDTO2.setTipoProduto(2);
		produtoDTO2.setTipoEmbalagem(2);
		produtoDTO2.setDescricaoMarca("Água de sais minerais estrela");
		produtoDTO2.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao40.jpg"));
		// produtoDTO2.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo40.jpg"));

		ProdutoDTO produtoDTO3 = new ProdutoDTO();
		produtoDTO3.setVolume(10);
		produtoDTO3.setTipoProduto(3);
		produtoDTO3.setTipoEmbalagem(1);
		produtoDTO3.setDescricaoMarca("Águas Gaseificada estrela");
		produtoDTO3.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao10.jpg"));
		produtoDTO3.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\cnd.pdf"));

		listaProdutos.add(produtoDTO);
		listaProdutos.add(produtoDTO2);
		listaProdutos.add(produtoDTO3);

		dto.setListaProdutos(listaProdutos);

		dto.getResponsavel().setCpfResponsavel("27345589048");
		dto.getResponsavel().setRgResponsavel("032152992006");
		dto.getResponsavel().setTelefoneResponsavel("98988566805");
		dto.getResponsavel().setNomeResponsavel("Marco Antonio Silva");
		dto.getResponsavel().setEmailResponsavel("marcoantoniosilvapegado@gmail.com");

		LicencaDTO licencaSanitaria = new LicencaDTO();
		licencaSanitaria.setEmissorLicenca(1);
		licencaSanitaria.setNumero("12345");
		licencaSanitaria.setImagem(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licencavigilancia.jpg"));

		LicencaDTO licencaAmbiental = new LicencaDTO();
		licencaAmbiental.setNumero("23456");
		licencaAmbiental.setImagem(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licencamineral.jpg"));

		dto.setLicencaVigilancia(licencaSanitaria);
		dto.setLicencaMineracao(licencaAmbiental);

		return dto;

	}

	public static DadosSolicitacaoDTO mockSucesso() {

		DadosSolicitacaoDTO dto = new DadosSolicitacaoDTO();

		dto.getCadastro().setCnpj("55377488000162");
		dto.getCadastro().setRazaoSocial("ASB BEBIDAS E ALIMENTOS LTDA");
		dto.getCadastro().setNomeFantasia("ASB AGUAS");
		dto.getCadastro().setInscricaoEstadual("122437111");
		dto.setTokenGrafica("A1b2C3d4E5f6G7h8I9j0K1l2M3n4O5p6Q7r8S9t0U1v2W3x4Y5");
		dto.setTipoAgua("3");

		dto.setCnpjGrafica("06989552000150");

		dto.setObservacao(
				"Solicitação de credenciamento de empresa envasadora para fins de atuação no SUL do maranhão");

		List<ProdutoDTO> listaProdutos = new ArrayList<>();
		ProdutoDTO produtoDTO = new ProdutoDTO();
		produtoDTO.setVolume(20);
		produtoDTO.setTipoProduto(1);
		produtoDTO.setTipoEmbalagem(1);
		produtoDTO.setDescricaoMarca("Água mineral estrela");
		produtoDTO.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao20.jpg"));
		produtoDTO.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo20.jpg"));

		ProdutoDTO produtoDTO2 = new ProdutoDTO();
		produtoDTO2.setVolume(40);
		produtoDTO2.setTipoProduto(2);
		produtoDTO2.setTipoEmbalagem(2);
		produtoDTO2.setDescricaoMarca("Água de sais minerais estrela");
		produtoDTO2.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao40.jpg"));
		produtoDTO2.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo40.jpg"));

		ProdutoDTO produtoDTO3 = new ProdutoDTO();
		produtoDTO3.setVolume(10);
		produtoDTO3.setTipoProduto(2);
		produtoDTO3.setTipoEmbalagem(1);
		produtoDTO3.setDescricaoMarca("Águas Gaseificada estrela");
		produtoDTO3.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao10.jpg"));
		produtoDTO3.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo10.jpg"));

		listaProdutos.add(produtoDTO);
		listaProdutos.add(produtoDTO2);
		listaProdutos.add(produtoDTO3);

		dto.setListaProdutos(listaProdutos);

		dto.getResponsavel().setCpfResponsavel("27345589048");
		dto.getResponsavel().setRgResponsavel("032152992006");
		dto.getResponsavel().setTelefoneResponsavel("98988566805");
		dto.getResponsavel().setNomeResponsavel("Marco Antonio Silva");
		dto.getResponsavel().setEmailResponsavel("marcoantoniosilvapegado@gmail.com");

		LicencaDTO licencaSanitaria = new LicencaDTO();
		licencaSanitaria.setEmissorLicenca(1);
		licencaSanitaria.setNumero("12345");
		licencaSanitaria.setImagem(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\teste.pdf"));

		LicencaDTO licencaAmbiental = new LicencaDTO();
		licencaAmbiental.setNumero("23456");
		licencaAmbiental.setImagem(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\teste.pdf"));

		dto.setLicencaVigilancia(licencaSanitaria);
		dto.setLicencaMineracao(licencaAmbiental);

		dto.getEnderecoDTO().setEnderecoEnvasador("Rua da Alegria, 737, Centro - São Luis - MA");
		dto.getEnderecoDTO().setCoordenadasEnvasador("-2.5920175196049184, -44.18432958161534");
		dto.getEnderecoDTO().setEnderecoEnvase("Rua Agostinho Torres, SN, João Paulo - São Luis - MA");
		dto.getEnderecoDTO().setCoordenadasEnvase("-2.5920175196049183, -44.18432958161533");

		return dto;

	}

	public static DadosSolicitacaoDTO mockEmail() {

		DadosSolicitacaoDTO dto = new DadosSolicitacaoDTO();

		dto.getCadastro().setCnpj("55377488000162");
		dto.getCadastro().setRazaoSocial("ASB BEBIDAS E ALIMENTOS LTDA");
		dto.getCadastro().setNomeFantasia("ASB AGUAS");
		dto.getCadastro().setInscricaoEstadual("122437111");

		dto.setTipoAgua("3");

		dto.setCnpjGrafica("06989552000150");

		dto.setObservacao(
				"Solicitação de credenciamento de empresa envasadora para fins de atuação no SUL do maranhão");

		List<ProdutoDTO> listaProdutos = new ArrayList<>();
		ProdutoDTO produtoDTO = new ProdutoDTO();
		produtoDTO.setVolume(20);
		produtoDTO.setTipoProduto(1);
		produtoDTO.setTipoEmbalagem(1);
		produtoDTO.setDescricaoMarca("Água mineral estrela");
		produtoDTO.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao20.jpg"));
		produtoDTO.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo20.jpg"));

		ProdutoDTO produtoDTO2 = new ProdutoDTO();
		produtoDTO2.setVolume(40);
		produtoDTO2.setTipoProduto(2);
		produtoDTO2.setTipoEmbalagem(2);
		produtoDTO2.setDescricaoMarca("Água de sais minerais estrela");
		produtoDTO2.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao40.jpg"));
		produtoDTO2.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo40.jpg"));

		ProdutoDTO produtoDTO3 = new ProdutoDTO();
		produtoDTO3.setVolume(10);
		produtoDTO3.setTipoProduto(2);
		produtoDTO3.setTipoEmbalagem(1);
		produtoDTO3.setDescricaoMarca("Águas Gaseificada estrela");
		produtoDTO3.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao10.jpg"));
		produtoDTO3.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo10.jpg"));

		listaProdutos.add(produtoDTO);
		listaProdutos.add(produtoDTO2);
		listaProdutos.add(produtoDTO3);

		dto.setListaProdutos(listaProdutos);

		dto.getResponsavel().setCpfResponsavel("27345589048");
		dto.getResponsavel().setRgResponsavel("032152992006");
		dto.getResponsavel().setTelefoneResponsavel("98988566805");
		dto.getResponsavel().setNomeResponsavel("Marco Antonio Silva");
		dto.getResponsavel().setEmailResponsavel("marcoantoniosilvapegado@gmail.com");

		LicencaDTO licencaSanitaria = new LicencaDTO();
		licencaSanitaria.setEmissorLicenca(1);
		licencaSanitaria.setNumero("12345");
		licencaSanitaria.setImagem(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licencavigilancia.jpg"));

		LicencaDTO licencaAmbiental = new LicencaDTO();
		licencaAmbiental.setNumero("23456");
		licencaAmbiental.setImagem(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licencamineral.jpg"));

		dto.setLicencaVigilancia(licencaSanitaria);
		dto.setLicencaMineracao(licencaAmbiental);

		dto.getEnderecoDTO().setEnderecoEnvasador("Rua da Alegria, 737, Centro - São Luis - MA");
		dto.getEnderecoDTO().setCoordenadasEnvasador("-2.5920175196049184, -44.18432958161534");
		dto.getEnderecoDTO().setEnderecoEnvase("Rua Agostinho Torres, SN, João Paulo - São Luis - MA");
		dto.getEnderecoDTO().setCoordenadasEnvase("-2.5920175196049184, -44.18432958161534");

		return dto;

	}

	public static DadosSolicitacaoDTO mockCpfCnpj() {

		DadosSolicitacaoDTO dto = new DadosSolicitacaoDTO();

		dto.getCadastro().setCnpj("55377488000161");
		dto.getCadastro().setRazaoSocial("ASB BEBIDAS E ALIMENTOS LTDA");
		dto.getCadastro().setNomeFantasia("ASB AGUAS");
		dto.getCadastro().setInscricaoEstadual("122437111");

		dto.setTipoAgua("3");

		dto.setCnpjGrafica("06989552000150");

		dto.setObservacao(
				"Solicitação de credenciamento de empresa envasadora para fins de atuação no SUL do maranhão");

		List<ProdutoDTO> listaProdutos = new ArrayList<>();
		ProdutoDTO produtoDTO = new ProdutoDTO();
		produtoDTO.setVolume(20);
		produtoDTO.setTipoProduto(1);
		produtoDTO.setTipoEmbalagem(1);
		produtoDTO.setDescricaoMarca("Água mineral estrela");
		produtoDTO.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao20.jpg"));
		produtoDTO.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo20.jpg"));

		ProdutoDTO produtoDTO2 = new ProdutoDTO();
		produtoDTO2.setVolume(40);
		produtoDTO2.setTipoProduto(2);
		produtoDTO2.setTipoEmbalagem(2);
		produtoDTO2.setDescricaoMarca("Água de sais minerais estrela");
		produtoDTO2.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao40.jpg"));
		produtoDTO2.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo40.jpg"));

		ProdutoDTO produtoDTO3 = new ProdutoDTO();
		produtoDTO3.setVolume(10);
		produtoDTO3.setTipoProduto(2);
		produtoDTO3.setTipoEmbalagem(1);
		produtoDTO3.setDescricaoMarca("Águas Gaseificada estrela");
		produtoDTO3.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao10.jpg"));
		produtoDTO3.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo10.jpg"));

		listaProdutos.add(produtoDTO);
		listaProdutos.add(produtoDTO2);
		listaProdutos.add(produtoDTO3);

		dto.setListaProdutos(listaProdutos);

		dto.getResponsavel().setCpfResponsavel("27345589047");
		dto.getResponsavel().setRgResponsavel("032152992006");
		dto.getResponsavel().setTelefoneResponsavel("98988566805");
		dto.getResponsavel().setNomeResponsavel("Marco Antonio Silva");
		dto.getResponsavel().setEmailResponsavel("marcoantoniosilvapegado@gmail.com");

		LicencaDTO licencaSanitaria = new LicencaDTO();
		licencaSanitaria.setEmissorLicenca(1);
		licencaSanitaria.setNumero("12345");
		licencaSanitaria.setImagem(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licencavigilancia.jpg"));

		LicencaDTO licencaAmbiental = new LicencaDTO();
		licencaAmbiental.setNumero("23456");
		licencaAmbiental.setImagem(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licencamineral.jpg"));

		dto.setLicencaVigilancia(licencaSanitaria);
		dto.setLicencaMineracao(licencaAmbiental);

		dto.getEnderecoDTO().setEnderecoEnvasador("Rua da Alegria, 737, Centro - São Luis - MA");
		dto.getEnderecoDTO().setCoordenadasEnvasador("-2.5920175196049184, -44.18432958161534");
		dto.getEnderecoDTO().setEnderecoEnvase("Rua Agostinho Torres, SN, João Paulo - São Luis - MA");
		dto.getEnderecoDTO().setCoordenadasEnvase("-2.5920175196049184, -44.18432958161534");

		return dto;

	}

	public static DadosSolicitacaoDTO mockGraficas() {

		DadosSolicitacaoDTO dto = new DadosSolicitacaoDTO();

		dto.getCadastro().setCnpj("55377488000162");
		dto.getCadastro().setRazaoSocial("ASB BEBIDAS E ALIMENTOS LTDA");
		dto.getCadastro().setNomeFantasia("ASB AGUAS");
		dto.getCadastro().setInscricaoEstadual("122437111");

		dto.setTipoAgua("3");

		dto.setCnpjGrafica("81770213000102");

		dto.setObservacao(
				"Solicitação de credenciamento de empresa envasadora para fins de atuação no SUL do maranhão");

		List<ProdutoDTO> listaProdutos = new ArrayList<>();
		ProdutoDTO produtoDTO = new ProdutoDTO();
		produtoDTO.setVolume(20);
		produtoDTO.setTipoProduto(1);
		produtoDTO.setTipoEmbalagem(1);
		produtoDTO.setDescricaoMarca("Água mineral estrela");
		produtoDTO.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao20.jpg"));
		produtoDTO.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo20.jpg"));

		ProdutoDTO produtoDTO2 = new ProdutoDTO();
		produtoDTO2.setVolume(40);
		produtoDTO2.setTipoProduto(2);
		produtoDTO2.setTipoEmbalagem(2);
		produtoDTO2.setDescricaoMarca("Água de sais minerais estrela");
		produtoDTO2.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao40.jpg"));
		produtoDTO2.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo40.jpg"));

		ProdutoDTO produtoDTO3 = new ProdutoDTO();
		produtoDTO3.setVolume(10);
		produtoDTO3.setTipoProduto(2);
		produtoDTO3.setTipoEmbalagem(1);
		produtoDTO3.setDescricaoMarca("Águas Gaseificada estrela");
		produtoDTO3.setImagemRecipiente(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\galao10.jpg"));
		produtoDTO3.setImagemRotulo(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\rotulo10.jpg"));

		listaProdutos.add(produtoDTO);
		listaProdutos.add(produtoDTO2);
		listaProdutos.add(produtoDTO3);

		dto.setListaProdutos(listaProdutos);

		dto.getResponsavel().setCpfResponsavel("27345589048");
		dto.getResponsavel().setRgResponsavel("032152992006");
		dto.getResponsavel().setTelefoneResponsavel("98988566805");
		dto.getResponsavel().setNomeResponsavel("Marco Antonio Silva");
		dto.getResponsavel().setEmailResponsavel("marcoantoniosilvapegado@gmail.com");

		LicencaDTO licencaSanitaria = new LicencaDTO();
		licencaSanitaria.setEmissorLicenca(1);
		licencaSanitaria.setNumero("12345");
		licencaSanitaria.setImagem(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licencavigilancia.jpg"));

		LicencaDTO licencaAmbiental = new LicencaDTO();
		licencaAmbiental.setNumero("23456");
		licencaAmbiental.setImagem(carregaBytes("C:\\Users\\marco.pegado\\Desktop\\arqs\\licencamineral.jpg"));

		dto.setLicencaVigilancia(licencaSanitaria);
		dto.setLicencaMineracao(licencaAmbiental);

		dto.getEnderecoDTO().setEnderecoEnvasador("Rua da Alegria, 737, Centro - São Luis - MA");
		dto.getEnderecoDTO().setCoordenadasEnvasador("-2.5920175196049184, -44.18432958161534");
		dto.getEnderecoDTO().setEnderecoEnvase("Rua Agostinho Torres, SN, João Paulo - São Luis - MA");
		dto.getEnderecoDTO().setCoordenadasEnvase("-2.5920175196049184, -44.18432958161534");

		return dto;

	}

	public static byte[] carregaBytes(String caminho) {
		Path path = Paths.get(caminho);// ("C:\\Users\\marco.pegado\\Desktop\\arqs\\teste.pdf");
		try {
			return Files.readAllBytes(path);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}


}
