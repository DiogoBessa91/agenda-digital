package com.everis.academia.java.agenda.digital.web.soap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.ws.Holder;

import com.everis.academia.java.agenda.digital.web.soap.generated.Cidade;
import com.everis.academia.java.agenda.digital.web.soap.generated.CidadeSOAP;
import com.everis.academia.java.agenda.digital.web.soap.generated.CidadeSOAPService;
import com.everis.academia.java.agenda.digital.web.soap.generated.BusinessException_Exception;

public class SOAPmain {

	public static void main(String[] args) throws MalformedURLException, BusinessException_Exception {

		URL url = new URL("http://localhost:8080/agenda-digital-web/soap/CidadeSOAP?wsdl");
		CidadeSOAPService service = new CidadeSOAPService(url);
		CidadeSOAP port = service.getCidadeSOAPPort();

		Cidade cidade = new Cidade();
		cidade.setNome("Test1");

		read(port);
		System.out.println();
		create(port, cidade);
		System.out.println();
		read(port);
		System.out.println();
		update(port, cidade);
		System.out.println();
		read(port);
		System.out.println();
		delete(port, cidade.getNome());
		System.out.println();
		read(port);
	}

	private static void read(CidadeSOAP port) throws BusinessException_Exception {
		for (Cidade cidade : port.read()) {
			System.out.println(cidade.getNome());
		}
	}

	private static void create(CidadeSOAP port, Cidade cidade) throws BusinessException_Exception {
		Holder<Cidade> holder = new Holder<Cidade>(cidade);
		port.create(holder);
		List<Cidade> cidades = port.read();
		cidade.setCodigo(cidades.get(cidades.size() - 1).getCodigo());
		System.out.println("Created!");
	}

	private static void update(CidadeSOAP port, Cidade cidade) throws BusinessException_Exception {
		cidade.setNome("Test2");
		Holder<Cidade> holder = new Holder<Cidade>(cidade);
		port.update(holder);
		System.out.println("Updated!");
	}

	private static void delete(CidadeSOAP port, String nome) throws BusinessException_Exception {
		port.delete(nome);
		System.out.println("Deleted!");
	}
}