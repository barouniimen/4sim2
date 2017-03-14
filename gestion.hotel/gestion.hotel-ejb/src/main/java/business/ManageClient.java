package business;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import persistence.Client;
import persistence.Reservation;
@Stateless
public class ManageClient implements IManageClientRemote {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void addClient(Client client) {
		// TODO Auto-generated method stub
		em.persist(client);
	}

	@Override
	public void removeClient(Client client) {
		// TODO Auto-generated method stub
		
		em.remove(em.find(Client.class, client.getCin()));
	}

	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub
		em.merge(client);
	}

	@Override
	public Client findById(String cin) {
		// TODO Auto-generated method stub
		return em.find(Client.class, cin);
	}

	@Override
	public List<Reservation> findAllReservations(Client client) {
		// TODO Auto-generated method stub
		return em.find(Client.class, client.getCin()).getReservations();
	}
}
