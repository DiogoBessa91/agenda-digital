package com.everis.academia.java.agenda.digital.web.filters;


import java.io.IOException;
import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName = "Filtro", urlPatterns = "/*")
public class MeuFilho implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
//		long tempoInicial = System.currentTimeMillis();
//		long tempoFinal = System.currentTimeMillis();
//		String uri = ((HttpServletRequest) request).getRequestURI();
//
//		System.out.println("Tempo da requisição de " + uri + " demorou (ms): " + (tempoFinal - tempoInicial));
		
		String url = ((HttpServletRequest)request).getRequestURL().toString();
		if (request instanceof HttpServletRequest) {
			 String queryString = ((HttpServletRequest)request).getQueryString();
			}
	        System.out.println("Url: " + url);
		
		request.getParameterMap().forEach((key, value) -> {
			System.out.println("Parametros recebidos: Key= " + key + " | Value= " + Arrays.toString(value));
		});
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}
}