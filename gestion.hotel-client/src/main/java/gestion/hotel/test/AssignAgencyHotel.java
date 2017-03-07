package gestion.hotel.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import business.IManageHotelsRemote;
import persistence.Agency;
import persistence.Hotel;

public class AssignAgencyHotel {
public static void main(String[] args) {
	try {
		Context context = new InitialContext();
		IManageHotelsRemote hotelsRemote = (IManageHotelsRemote) context.lookup("/gestion.hotel-ear/gestion.hotel-ejb/ManageHotels!business.IManageHotelsRemote");
		Agency agency = new Agency();
		agency.setId(2);
		agency.setName("travel");
		hotelsRemote.addAgency(agency);
		Hotel hotel = new Hotel();
		hotel.setId(1);
		hotelsRemote.assignHotelToAgency(hotel, agency);
		

	} catch (NamingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
