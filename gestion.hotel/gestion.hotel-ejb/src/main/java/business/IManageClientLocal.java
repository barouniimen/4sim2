package business;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import persistence.Client;
import persistence.Reservation;

@Local
public interface IManageClientLocal {
	void addClient(Client client);
	void removeClient(Client client);
	void updateClient(Client client);
	Client findById(String cin);
	List<Reservation> findAllReservations(Client client);
	Client authentifierClient(String login, String pwd);
}
