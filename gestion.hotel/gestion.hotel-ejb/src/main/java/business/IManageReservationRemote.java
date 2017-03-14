package business;

import java.sql.Date;

import javax.ejb.Remote;

import persistence.Client;
import persistence.Hotel;
import persistence.Reservation;

@Remote
public interface IManageReservationRemote {
	void assignClientToHotel(Client client, Hotel hotel,Reservation reservation, Date arrivalDate);
	

}
