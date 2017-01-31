package business.layer;

import java.util.HashMap;

import javax.ejb.Local;

@Local
public interface IDictionnaireLocal {
	public HashMap<String, String> getListeMots();
	public void setListeMots(HashMap<String, String> listeMots);
}
