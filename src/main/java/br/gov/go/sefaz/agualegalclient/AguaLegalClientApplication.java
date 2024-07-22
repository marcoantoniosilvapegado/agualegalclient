package br.gov.go.sefaz.agualegalclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import br.gov.go.sefaz.agualegalclient.dto.solicitacao.SolicitacaoCredenciamentoDTO;
import br.gov.go.sefaz.agualegalclient.testes.mocks.MocksTestesAPI;
import br.gov.go.sefaz.agualegalclient.testes.service.AguaLegalClient;

@EnableFeignClients // adicionar essa annotation
@SpringBootApplication
public class AguaLegalClientApplication implements CommandLineRunner{
	
	@Autowired
	AguaLegalClient client;

	public static void main(String[] args) {
		SpringApplication.run(AguaLegalClientApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		
		SolicitacaoCredenciamentoDTO dto = MocksTestesAPI.solicitacaoCredenciamento1();
		try {
			this.client.solicitarCredenciamentoEnvasadora(dto);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		
	}

}
