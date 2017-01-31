package business.layer;

import java.util.HashMap;

//import javax.ejb.LocalBean;
import javax.ejb.Singleton;

@Singleton
//@LocalBean remplace l'interface locale
public class Dictionnaire implements IDictionnaireLocal {
	private HashMap<String, String> listeMots;

	public Dictionnaire() {
		listeMots = new HashMap<>();
	}

	public HashMap<String, String> getListeMots() {
		return listeMots;
	}

	public void setListeMots(HashMap<String, String> listeMots) {
		this.listeMots = listeMots;
	}
}
