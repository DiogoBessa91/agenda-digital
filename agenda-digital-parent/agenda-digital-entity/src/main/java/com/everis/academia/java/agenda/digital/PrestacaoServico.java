package com.everis.academia.java.agenda.digital;

import java.sql.Date;

public class PrestacaoServico {
			

		private Integer	codigo;
		private Date data;

		public PrestacaoServico(Date data, Integer codigo) {
			super();
			this.data = data;
			this.codigo = codigo;
		}
		
		public Date getData() {
			return data;
		}

		public void setData(String data) {
		}

		public Integer getCodigo() {
			return codigo;
		}

		public void setCodigo(Integer codigo) {
		}
			
	


}
