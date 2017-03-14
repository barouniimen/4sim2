package business;

import java.util.List;

import javax.ejb.Remote;
import persistence.Client;
import persistence.Reservation;

@Remote
public interface IManageClientRemote {
	void addClient(Client client);
	void removeClient(Client client);
	void updateClient(Client client);
	Client findById(String cin);
	List<Reservation> findAllReservations(Client client);
}
;