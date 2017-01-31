package business.layer;

import javax.ejb.Remote;

@Remote
public interface ITraducteurRemote {

	void ajouterMot(String fr, String eng);
	String traduire(String fr);
}
