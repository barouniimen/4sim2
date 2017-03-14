package business;

import java.sql.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistence.Client;
import persistence.Hotel;
import persistence.Reservation;
import persistence.ReservationPk;

@Stateless
public class ManageReservation implements IManageReservationRemote {
	@PersistenceContext
	EntityManager em;

	@Override
	public void assignClientToHotel(Client client, Hotel hotel,Reservation reservation, Date arrivalDate) {
		// TODO Auto-generated method stub
		ReservationPk reservationPk = new ReservationPk();
		reservationPk.setIdClient(client.getCin());
		reservationPk.setIdHotel(hotel.getId());
		reservationPk.setArrivalDate(arrivalDate);
		reservation.setPk(reservationPk);
		em.persist(reservation);
		
	}
}
