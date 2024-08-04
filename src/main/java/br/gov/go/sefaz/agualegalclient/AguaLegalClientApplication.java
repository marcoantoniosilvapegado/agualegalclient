package br.gov.go.sefaz.agualegalclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import br.gov.go.sefaz.agualegalclient.testes.service.AguaLegalClient;

@EnableFeignClients // adicionar essa annotation
@SpringBootApplication
public class AguaLegalClientApplication // implements CommandLineRunner
{
	
	@Autowired
	AguaLegalClient client;

	public static void main(String[] args) {
		SpringApplication.run(AguaLegalClientApplication.class, args);		
	}

//	@Override
	/*public void run(String... args) throws Exception {
		ResponseEntity<RespostaPadrao> resposta = null;
		SolicitacaoCredenciamentoDTO dto = MocksTestesAPI.mockSolicitacaoFaltandoCampos();
		try {
			 resposta = this.client.solicitarCredenciamentoEnvasadora(dto);
		} catch (Exception e) {		
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());			
			e.printStackTrace();
		}
		if(resposta != null) {
			System.out.println(resposta.toString());
		}
		
		
	}*/
	//}

}
