package br.gov.go.sefaz.agualegalclient;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients // adicionar essa annotation
@SpringBootApplication
public class AguaLegalClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AguaLegalClientApplication.class, args);		
	}

}
