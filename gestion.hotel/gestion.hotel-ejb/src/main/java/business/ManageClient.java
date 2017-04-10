package business;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import persistence.Client;
import persistence.Reservation;
@Stateless
public class ManageClient implements IManageClientRemote, IManageClientLocal {
	
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

	@Override
	public Client authentifierClient(String login, String pwd) {
		TypedQuery<Client> query = em.createNamedQuery("login", Client.class);
		
		query.setParameter("login", login);
		query.setParameter("pwd", pwd);
		return query.getSingleResult();
	}
}
