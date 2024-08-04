package br.gov.go.sefaz.agualegalclient.testes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.go.sefaz.agualegalclient.domain.RespostaPadrao;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.DadosSolicitacaoDTO;
import br.gov.go.sefaz.agualegalclient.testes.mocks.Mock;
import br.gov.go.sefaz.agualegalclient.testes.service.AguaLegalClient;

@RestController
@RequestMapping(value = "/feign")
public class TestesController {

	@Autowired
	AguaLegalClient client;
	
	@GetMapping(value = "/teste1")
	public ResponseEntity<RespostaPadrao> teste1() {
		
		DadosSolicitacaoDTO dto = Mock.mock1();
		
		ResponseEntity<RespostaPadrao> resposta;
		
		try {
			resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		} catch (Exception e) {
			RespostaPadrao resp = new RespostaPadrao(e.getLocalizedMessage(), 1, false);			
			return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
		}
		return resposta;
	}
	
	@GetMapping(value = "/teste2")
	public ResponseEntity<RespostaPadrao> teste2() {
		
		DadosSolicitacaoDTO dto = Mock.mock2();
		
		ResponseEntity<RespostaPadrao> resposta;
		
		try {
			resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		} catch (Exception e) {
			RespostaPadrao resp = new RespostaPadrao(e.getLocalizedMessage(), 1, false);			
			return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
		}
		return resposta;
	}
	
	@GetMapping(value = "/teste3")
	public ResponseEntity<RespostaPadrao> teste3() {
		
		DadosSolicitacaoDTO dto = Mock.mockSucesso();
		
		ResponseEntity<RespostaPadrao> resposta;
		
		try {
			resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		} catch (Exception e) {
			RespostaPadrao resp = new RespostaPadrao(e.getLocalizedMessage(), 1, false);			
			return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
		}
		return resposta;
	}
	
	@GetMapping(value = "/teste4")
	public ResponseEntity<RespostaPadrao> teste4() {
		
		DadosSolicitacaoDTO dto = Mock.mockEmail();
		
		ResponseEntity<RespostaPadrao> resposta;
		
		try {
			resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		} catch (Exception e) {
			RespostaPadrao resp = new RespostaPadrao(e.getLocalizedMessage(), 1, false);			
			return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
		}
		return resposta;
	}
	
	@GetMapping(value = "/teste5")
	public ResponseEntity<RespostaPadrao> teste5() {
		
		DadosSolicitacaoDTO dto = Mock.mockCpfCnpj();
		
		ResponseEntity<RespostaPadrao> resposta;
		
		try {
			resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		} catch (Exception e) {
			RespostaPadrao resp = new RespostaPadrao(e.getLocalizedMessage(), 1, false);			
			return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
		}
		return resposta;
	}
	
	@GetMapping(value = "/teste6")
	public ResponseEntity<RespostaPadrao> teste6() {
		
		DadosSolicitacaoDTO dto = Mock.mockGraficas();
		
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
