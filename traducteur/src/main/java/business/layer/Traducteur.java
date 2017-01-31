package business.layer;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class Traducteur implements ITraducteurRemote{

	@EJB
	IDictionnaireLocal dictionnaire;
	
	@Override
	public void ajouterMot(String fr, String eng) {
		dictionnaire.getListeMots().put(fr, eng);
		
	}

	@Override
	public String traduire(String fr) {
		return dictionnaire.getListeMots().get(fr);
	}

}
