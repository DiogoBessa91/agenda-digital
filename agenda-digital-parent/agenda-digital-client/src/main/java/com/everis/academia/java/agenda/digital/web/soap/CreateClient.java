package com.everis.academia.java.agenda.digital.web.soap;

import java.net.URL;


public class CreateClient {

	public static void main(String[] args) {
		URL url = new URL("http://localhost:8080/agenda-digital-web/soap/CidadeSOAP?wsdl");

		CidadeSOAPService service = new CidadeSOAPService(url);
		CidadeSOAP port = service.getCidadeSOAPPort();

		for (Cidade cidade : port.read()) {
			System.out.println(cidade.getNome());
		}
	}

}
