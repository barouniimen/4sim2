package business;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import persistence.Agency;
import persistence.Employee;
import persistence.Hotel;

@Stateless
public class ManageHotels implements IManageHotelsRemote {

	@PersistenceContext
	EntityManager em;

	@Override
	public void addHotel(Hotel hotel) {
		em.persist(hotel);
		// hotel.setName("other"); ==> persist permet de rattacher l'entité à
		// l'entity manager (état = managed)

	}

	@Override
	public void removeHotel(Hotel hotel) {
		em.remove(em.find(Hotel.class, hotel.getId()));

	}

	@Override
	public void updateHotel(Hotel hotel) {
		em.merge(hotel);
	}

	@Override
	public Hotel getById(int id) {
		return em.find(Hotel.class, id);
	}

	@Override
	public void assignEmployee(Employee employee, Hotel hotel) {
		employee = em.find(Employee.class, employee.getCin());
		employee.setHotel(hotel);

	}

	@Override
	public List<Hotel> getAllHotels() {
		TypedQuery<Hotel> query = em.createQuery("Select h From Hotel h", Hotel.class);
		return query.getResultList();
	}

	@Override
	public void addAgency(Agency agency) {
		em.persist(agency);

	}

	@Override
	public void assignAgencyToHotel(Hotel hotel, Agency agency) {
		// agency = em.find(Agency.class, agency.getId());
		// agency.getHotels().add(hotel);
		// il n'ya pas eu d'affectation, car agency est le bout slave

		hotel = em.find(Hotel.class, hotel.getId());
		hotel.getAgencies().add(agency);
		// il y a eu affectation car hotel est le bout master
		// P.S: pas besoin d'un merge après le add(agency) car l'entité hotel
		// est managed
	}

	@Override
	public void addEmployee(Employee employee) {
		em.persist(employee);

	}

	@Override
	public void assignHotelToAgency(Hotel hotel, Agency agency) {
		hotel = em.find(Hotel.class, hotel.getId());
		hotel.getAgencies().add(agency);

	}

}
