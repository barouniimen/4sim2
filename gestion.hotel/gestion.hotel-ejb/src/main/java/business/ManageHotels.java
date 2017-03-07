package business;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

	}

	@Override
	public void removeHotel(Hotel hotel) {
		em.remove(hotel);

	}

	@Override
	public void updateHotel(Hotel hotel) {
		// selon bessrour
		em.persist(hotel);
		em.flush();
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void assignEmployee(Employee employee, Hotel hotel) {
		em.persist(employee);
		employee.setHotel(hotel);

	}

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void assignHotelToAgency(Hotel hotel, Agency agency) {
		hotel = em.find(Hotel.class, hotel.getId());
		agency = em.find(Agency.class, agency.getId());
				
		hotel.getAgencies().add(agency);
		em.merge(hotel);

	}

	@Override
	public void addAgency(Agency agency) {
		em.persist(agency);
	}

}
