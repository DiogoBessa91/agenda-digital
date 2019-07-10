package om.everis.academia.java.agenda.digital.web.beans;


import javax.faces.bean.ManagedBean;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@ManagedBean(name = "createBean")
public class CreateBean {

	private ICidadeBusiness business = new CidadeBusiness();
	private Cidade cidade = new Cidade();

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String create() {
		try {
			business.create(cidade);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return "cidades";
	}

	public String call() {
		return "create";
	}
}