package om.everis.academia.java.agenda.digital.web.beans;


import javax.faces.bean.ManagedBean;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;

@ManagedBean(name = "deleteBean")
public class DeleteBean {

	private ICidadeBusiness business = new CidadeBusiness();

	public void delete(String nome) {
		System.out.println(nome);
		try {
			business.delete(nome);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}
}