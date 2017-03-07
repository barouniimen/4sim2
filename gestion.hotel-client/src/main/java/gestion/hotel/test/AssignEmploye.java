package gestion.hotel.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import business.IManageHotelsRemote;
import persistence.Agency;
import persistence.Employee;
import persistence.Hotel;
import persistence.Receptionist;

public class AssignEmploye {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			IManageHotelsRemote hotelsRemote = (IManageHotelsRemote) context
					.lookup("/gestion.hotel-ear/gestion.hotel-ejb/ManageHotels!business.IManageHotelsRemote");
			Receptionist employee = new Receptionist();
			employee.setCin("000");
			Hotel hotel = new Hotel();
			hotel.setId(1);
			hotelsRemote.assignEmployee(employee, hotel);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
