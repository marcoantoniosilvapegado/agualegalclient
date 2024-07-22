package br.gov.go.sefaz.agualegalclient.testes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.go.sefaz.agualegalclient.domain.RespostaPadrao;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.SolicitacaoCredenciamentoDTO;
import br.gov.go.sefaz.agualegalclient.testes.mocks.MocksTestesAPI;
import br.gov.go.sefaz.agualegalclient.testes.service.AguaLegalClient;

@RestController
@RequestMapping(value = "/feign")
public class TestesController {

	@Autowired
	AguaLegalClient client;

	/*@GetMapping(value = "/teste1/{inscricao}")
	public ResponseEntity<RespostaPadrao> verificaSituacaoEnvasadora(
			@PathVariable(name = "inscricao") String inscricao) {
		SolicitacaoCredenciamentoDTO mock = MocksTestesAPI.solicitacaoCredenciamento1();
		ResponseEntity<RespostaPadrao> resposta = null;
		try {
			resposta = this.client.verificaSituacaoEnvasadora(mock);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

		return resposta;
	}*/

	@GetMapping(value = "/teste2")
	public ResponseEntity<RespostaPadrao> solicitaCredenciamento() {
		SolicitacaoCredenciamentoDTO dto = MocksTestesAPI.solicitacaoCredenciamento1();
		
		ResponseEntity<RespostaPadrao> resposta;
		
		try {
			resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		} catch (Exception e) {
			RespostaPadrao resp = new RespostaPadrao(e.getLocalizedMessage(), 1, false);			
			return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
		}
		return resposta;
	}

}
