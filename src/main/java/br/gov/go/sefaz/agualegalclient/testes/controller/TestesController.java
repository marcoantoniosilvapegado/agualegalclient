package br.gov.go.sefaz.agualegalclient.testes.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.gov.go.sefaz.agualegalclient.domain.ApiError;
import br.gov.go.sefaz.agualegalclient.domain.ErrorDetail;
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

	@GetMapping(value = "/teste")
	public ResponseEntity<RespostaPadrao> testeSolicitaCredenciamento() {
		SolicitacaoCredenciamentoDTO dto = MocksTestesAPI.mockSolicitacaoSemErrosValidacao();
	//	SolicitacaoCredenciamentoDTO dto = MocksTestesAPI.mockSolicitacaoFaltandoCampos();
		
		ResponseEntity<RespostaPadrao> resposta;
		
		try {
			resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		} catch (Exception e) {
			RespostaPadrao resp = new RespostaPadrao(e.getLocalizedMessage().toString(), 1, false);			
			return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
		}
		return resposta;
	}
			
	
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
	
	@GetMapping(value = "/teste3")
	public ResponseEntity<RespostaPadrao> solicitaCredenciamentoErroProduto() {
		SolicitacaoCredenciamentoDTO dto = MocksTestesAPI.solicitacaoCredenciamentoComErrosProdutos();
		
		ResponseEntity<RespostaPadrao> resposta;
		
		try {
			resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		} catch (Exception e) {
			try {
				this.testaJson(e.getMessage());
			} catch (JsonProcessingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			RespostaPadrao resp = new RespostaPadrao(e.getMessage(), 1, false);			
			return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
		}
		return resposta;
	}
	
	public Map<String, List<String>> testaJson(String json) throws JsonMappingException, JsonProcessingException {
		
		 ObjectMapper objectMapper = new ObjectMapper();
		 
		  ApiError apiError = objectMapper.readValue(json, ApiError.class);

	        // Extract the list of errors from the descricao field
	        String descricao = apiError.getDescricao();
	        int startIndex = descricao.indexOf('[');
	        int endIndex = descricao.lastIndexOf(']') + 1;

	        String errorDetailsJson = descricao.substring(startIndex, endIndex);
	        List<ErrorDetail> errorDetails = objectMapper.readValue(errorDetailsJson, new TypeReference<List<ErrorDetail>>() {});

	        // Group errors by fieldName
	        Map<String, List<String>> groupedErrors = new HashMap<>();
	        for (ErrorDetail errorDetail : errorDetails) {
	            groupedErrors.computeIfAbsent(errorDetail.getFieldName(), k -> new ArrayList<>()).add(errorDetail.getMessage());
	        }

	        // Print the grouped errors
	        for (Map.Entry<String, List<String>> entry : groupedErrors.entrySet()) {
	            System.out.println("Field: " + entry.getKey());
	            for (String message : entry.getValue()) {
	                System.out.println("  - " + message);
	            }
	        }
	        
	        return groupedErrors;
	}

}
