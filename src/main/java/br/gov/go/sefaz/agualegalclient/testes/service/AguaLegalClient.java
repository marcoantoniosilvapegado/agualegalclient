package br.gov.go.sefaz.agualegalclient.testes.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import br.gov.go.sefaz.agualegalclient.domain.RespostaPadrao;
import br.gov.go.sefaz.agualegalclient.dto.SituacaoEnvasadoraDTO;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.SolicitacaoCredenciamentoDTO;

@FeignClient(name = "agualegalClient", url = "localhost:8080/api")
public interface AguaLegalClient {
		
	  	@PostMapping("/situacaoEnvasadora")
		ResponseEntity<RespostaPadrao> verificaSituacaoEnvasadora(@RequestBody SituacaoEnvasadoraDTO dto);
	  	
	  	@PostMapping("/solicitarCredenciamento")
	  	public ResponseEntity<RespostaPadrao> solicitarCredenciamentoEnvasadora(
				@RequestBody  SolicitacaoCredenciamentoDTO dto
				);
}	
