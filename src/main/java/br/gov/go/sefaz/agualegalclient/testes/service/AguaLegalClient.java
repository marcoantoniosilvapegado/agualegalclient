package br.gov.go.sefaz.agualegalclient.testes.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.gov.go.sefaz.agualegalclient.domain.RespostaPadrao;
import br.gov.go.sefaz.agualegalclient.dto.solicitacao.DadosSolicitacaoDTO;

@FeignClient(name = "agualegalClient", url = "localhost:8080/api/credenciamento")
public interface AguaLegalClient {
		
	  	@PostMapping("/solicitacao")
	  	public ResponseEntity<RespostaPadrao> solicitarCredenciamentoEnvasadora(
				@RequestBody  DadosSolicitacaoDTO dto
				);
}	
