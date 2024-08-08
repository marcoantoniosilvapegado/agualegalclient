package br.gov.go.sefaz.agualegalclient.testes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.go.sefaz.agualegalclient.domain.RespostaPadrao;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.DadosSolicitacaoDTO;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.RespostaPreAnalise;
import br.gov.go.sefaz.agualegalclient.testes.mocks.Mock;
import br.gov.go.sefaz.agualegalclient.testes.service.AguaLegalClient;

@RestController
@RequestMapping(value = "/feign")
public class TestesController {

	@Autowired
	AguaLegalClient client;

	@GetMapping(value = "/teste1")
	public ResponseEntity<RespostaPreAnalise> teste1() {

		DadosSolicitacaoDTO dto = Mock.mock1();

		ResponseEntity<RespostaPreAnalise> resposta;

		resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		return resposta;
	}

	@GetMapping(value = "/teste2")
	public ResponseEntity<RespostaPreAnalise> teste2() {

		DadosSolicitacaoDTO dto = Mock.mock2();

		ResponseEntity<RespostaPreAnalise> resposta;

		resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		return resposta;
	}

	@GetMapping(value = "/teste3")
	public ResponseEntity<RespostaPreAnalise> teste3() {

		DadosSolicitacaoDTO dto = Mock.mockSucesso();

		ResponseEntity<RespostaPreAnalise> resposta;

		resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		return resposta;
	}

	@GetMapping(value = "/teste4")
	public ResponseEntity<RespostaPreAnalise> teste4() {

		DadosSolicitacaoDTO dto = Mock.mockEmail();

		ResponseEntity<RespostaPreAnalise> resposta;

		resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		return resposta;
	}

	@GetMapping(value = "/teste5")
	public ResponseEntity<RespostaPreAnalise> teste5() {

		DadosSolicitacaoDTO dto = Mock.mockCpfCnpj();

		ResponseEntity<RespostaPreAnalise> resposta;

		resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		return resposta;
	}

	@GetMapping(value = "/teste6")
	public ResponseEntity<RespostaPreAnalise> teste6() {

		DadosSolicitacaoDTO dto = Mock.mockGraficas();

		ResponseEntity<RespostaPreAnalise> resposta;

		resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		return resposta;

	}

}
