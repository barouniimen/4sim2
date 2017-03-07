package gestion.hotel.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import business.IManageHotelsRemote;
import persistence.Hotel;

public class AddHotel {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			IManageHotelsRemote hotelsRemote = (IManageHotelsRemote) context.lookup("/gestion.hotel-ear/gestion.hotel-ejb/ManageHotels!business.IManageHotelsRemote");
			Hotel hotel = new Hotel();
			hotel.setName("el mouradi");
			hotelsRemote.addHotel(hotel);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
